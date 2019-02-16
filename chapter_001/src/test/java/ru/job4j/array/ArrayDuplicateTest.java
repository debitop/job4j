package ru.job4j.array;

import org.junit.Test;
import org.junit.Test;

import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Aleksandr Kochkurkin (mailto:info@debitop.com)
 * @version 1.0
 * @since 15.02.2019
 */

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] resultArray = arrayDuplicate.remove(input);
        String[] expectArray = new String[]{"Привет", "Мир", "Супер"};
        assertThat(resultArray, arrayContainingInAnyOrder(expectArray));
    }
}