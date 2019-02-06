package ru.job4j.loop;

/**
 * @author Aleksandr Kochkurkin (mailto:info@debitop.com)
 * @version 1.0
 * @since 11.11.2018
 */
public class Factorial {
    /**
     * Вычисляем факториал.
     *
     * @param n - положительное целое число.
     * @return возвращает факториал.
     */
    public int calc(int n) {
        int fact = 1;
        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
        }
        return fact;
    }
}