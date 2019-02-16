package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Aleksandr Kochkurkin (mailto:info@debitop.com)
 * @version 1.0
 * @since 15.02.2019
 */

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int arraySize = array.length;
        for (int i = 0; i < arraySize; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                if (array[i].equals(array[j])) {
                    array[j] = array[arraySize - 1];
                    arraySize--;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, arraySize);
    }
}