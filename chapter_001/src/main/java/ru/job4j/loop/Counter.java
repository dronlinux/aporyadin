package ru.job4j.loop;

/**
 * Counter Class.
 *
 * @author Andrew A. Poryadin (dron600@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Counter {

    /**
     * Sum even numbers.
     *
     * @param start  argument
     * @param finish argument
     * @return int Sum of even numbers
     */
    public int add(int start, int finish) {

        int result = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                result += i;
            }

        }

        return result;
    }
}