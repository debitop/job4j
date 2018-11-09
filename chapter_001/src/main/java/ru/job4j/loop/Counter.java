package ru.job4j.loop;

/**
 * @author Aleksandr Kochkurkin (mailto:info@debitop.com)
 * @version 1.0
 * @since 09.11.2018
 */
public class Counter {
    /**
     * Возвращает сумму четных чисел в диапазоне.
     *
     * @param start,finish - начало и конец массива.
     * @return сумма четных чисед.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}