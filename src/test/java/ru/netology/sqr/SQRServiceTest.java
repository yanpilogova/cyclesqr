package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'average amount of sqr', 200, 300, 3",
            "'minimum amount of sqr', 0, 10, 0"})
    void calculateSqrValues(String name, int number1, int number2, int expected) {
        SQRService sqrService = new SQRService();
        int actual = sqrService.calculateSqr(number1, number2);
        assertEquals(actual, expected);
    }
}