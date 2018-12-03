package ru.job4j.loop;

/**
 * @author Aleksandr Kochkurkin (mailto:info@debitop.com)
 * @version 1.0
 * @since 04.12.2018
 */
public class Board {
    /**
     * Рисует шахматную доску из символов x и пробелов
     *
     * @param width, height - ширина и высота шахматной доски.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // условие проверки, что писать пробел или X
                // Выше в задании мы определили закономерность, когда нужно проставлять X
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод на новую строку.
            screen.append(ln);
        }
        return screen.toString();
    }
}