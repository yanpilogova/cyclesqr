package ru.netology.sqr;

public class SQRService {
    public static int calculateSqr(int number1, int number2) {
        int count = 0;
        for (int i = 10; i <= 99; i++)
            if (i * i >= number1 && i * i <= number2) {
                count++;
            }
        return count;
    }
}
