package ru.gb.hw4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static ru.gb.hw4.TriangleArea.calcTriangleArea;

public class TriangleTest {
    @Test
    void triangleCalcAreaTest() throws Exception {
        Assertions.assertEquals(0.96824, calcTriangleArea(1,2,2), 0.001);
    }

    @Test
    void negativeTest() {
        Assertions.assertThrows(Exception.class, () -> calcTriangleArea(-1,2,2));
    }

}
