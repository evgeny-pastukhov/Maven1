package ru.gb.lesson3.hw;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hw {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        WebElement logIn = driver.findElement(By.xpath("//a[@class='login']"));
        logIn.click();
        WebElement eMail = driver.findElement(By.xpath("//input[@id='email']"));
        eMail.sendKeys("nodari5177@evilant.com");
        WebElement passWord = driver.findElement(By.xpath("//input[@id='passwd']"));
        passWord.sendKeys("12345");
        WebElement addToCart = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
        addToCart.click();



        Thread.sleep(5000);
        driver.quit();
    }
}
