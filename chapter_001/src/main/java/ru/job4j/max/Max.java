package ru.job4j.max;

/**
 * @author Aleksandr Kochkurkin (mailto:info@debitop.com)
 * @version 1.0
 * @since 21.09.2018
 */
public class Max {
    /**
     * Возвращает максимум из двух чисел.
     *
     * @param first,second - два числа.
     * @return Максимальное число.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }

    /**
     * Возвращает максимум из трех чисел, используя метод max для двух чисел.
     *
     * @param first,second,third - три числа.
     * @return Максимальное число.
     */
    public int max(int first, int second, int third) {
        return this.max(this.max(first, second), third);
    }
}