package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
//import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * Counter Test.
 *
 * @author Andrew A. Poryadin (dron600@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CounterTest {

    /**
     * Test Sum Even numbers.
     */
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        //напишите здесь тест, проверяющий,
        // что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        int expected = 30;
        //Проверяем результат и ожидаемое значение.
        assertThat(result, is(expected));


    }
}