package ru.job4j.array;

/**
 * @author Aleksandr Kochkurkin (mailto:info@debitop.com)
 * @version 1.0
 * @since 11.02.2019
 */

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != data[0]) {
                result = false;
                break;
            }
        }
        return result;
    }
}