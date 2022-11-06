package ru.gb.lesson4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

public class FunctionsTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Выполнится 1 раз перед всеми тестами класса");
        WebDriverManager.safaridriver().setup();
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("перед каждым");

    }

    @Test
    @Disabled("Есть баг номер 123")
    @DisplayName("Проверка метода со словом-палиндромом")
    void isPalindromeTest() {
        boolean result = new Functions().isPalindrome("123321");
        Assertions.assertEquals(true, result);

    }
    @ParameterizedTest
    @ValueSource(strings = {"123321", "1234321"})
    @DisplayName("Проверка метода со словом-палиндромом с нечётным количеством символов")
    void isPalindromeTest2(String testWord) {
        boolean result = new Functions().isPalindrome(testWord);
        Assertions.assertEquals(true, result);
    }

    @ParameterizedTest
    @CsvSource({"123, false", "1234321, true"})
    void isPalindrome(String testWord, boolean expectedResult) {
        Assertions.assertEquals(expectedResult, new Functions().isPalindrome(testWord));
    }

    @ParameterizedTest
    @MethodSource("catAndAgeDataProvider")
    void catAndAgeTest(Cat cat, Integer age) {
        Assertions.assertEquals(cat.getAge(), age);
    }

    private static List<Arguments> catAndAgeDataProvider() {
        return Arrays.asList(
                Arguments.of(new Cat("Test1", 10), 10),
                Arguments.of(new Cat("Test2", 11), 12)
        );
    }



}
