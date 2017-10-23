package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * Turn  Test.
 *
 * @author Andrew A. Poryadin (dron600@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class TurnTest {
    /**
     * Test when Turn Array With Even Amount Of Elements.
     */
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с чётным числом элементов, например {2, 6, 1, 4}.
        Turn turnArr = new Turn();
        int[] result = turnArr.back(new int[]{2, 6, 1, 4});
        int[] expected = new int[]{4, 1, 6, 2};
        assertThat(result, is(expected));
    }

    /**
     * Test when Turn Array With Odd Amount Of Elements.
     */
    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        //напишите здесь тест, проверяющий переворот массива с нечётным числом элементов, например {1, 2, 3, 4, 5}.
        Turn turnArr = new Turn();
        int[] result = turnArr.back(new int[]{1, 2, 3, 4, 5});
        int[] expected = new int[]{5, 4, 3, 2, 1};
        assertThat(result, is(expected));
    }
}