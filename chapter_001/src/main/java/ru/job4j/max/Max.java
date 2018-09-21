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
}