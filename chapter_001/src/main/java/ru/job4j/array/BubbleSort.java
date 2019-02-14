package ru.job4j.array;

/**
 * @author Aleksandr Kochkurkin (mailto:info@debitop.com)
 * @version 1.0
 * @since 13.02.2019
 */

public class BubbleSort {
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}