package ru.job4j.array;

/**
 * Turn Class.
 *
 * @author Andrew A. Poryadin (dron600@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Turn {

    /**
     * Reverse array method.
     *
     * @param array argument
     * @return Reversed int array
     */
    public int[] back(int[] array) {

        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            int temp = array[low];
            array[low++] = array[high];
            array[high--] = temp;
        }

        return array;
    }

}