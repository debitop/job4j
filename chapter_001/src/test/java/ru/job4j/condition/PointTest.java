package ru.job4j.condition;


import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;

/**
 * @author Aleksandr Kochkurkin (mailto:info@debitop.com)
 * @version 1.0
 * @since 03.01.2019
 */
public class PointTest {
    @Test
    public void whenSetTwoPointsThenCountDistanse() {
        // создаем два объекта класса Point.
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        // Вычисляем расстояние.
        double result = a.distanceTo(b);
        //Проверяем результат и ожидаемое значение.
        assertThat(result, closeTo(4.47213595499958, 0.1));
    }
}