package ru.job4j.max;

/**
 * Max.
 *
 * @author Andrew A. Poryadin (dron600@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Max {

    /**
     * Max method.
     *
     * @param first  argument
     * @param second argument
     * @return max from 2 arguments
     */
    public int max(int first, int second) {
        return first <= second ? second : first;
    }

}