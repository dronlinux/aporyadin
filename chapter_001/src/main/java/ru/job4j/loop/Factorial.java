package ru.job4j.loop;

/**
 * Factorial Class.
 *
 * @author Andrew A. Poryadin (dron600@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {

    /**
     * Calculate Factorial.
     *
     * @param n argument
     * @return int Factorial
     */
    public int calc(int n) {


        int result = 1;
        if (n > 1) {

            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }

        return result;
    }
}