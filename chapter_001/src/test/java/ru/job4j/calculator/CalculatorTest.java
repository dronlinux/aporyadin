package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Calculator Test.
 *
 * @author Andrew A. Poryadin (dron600@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CalculatorTest {
    /**
     * Addition Test.
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Subtraction test.
     */
    @Test
    public void whenSubtractOneMinusOneThenZero() {
        Calculator calc = new Calculator();
        calc.subtract(1D, 1D);
        double result = calc.getResult();
        double expected = 0;
        assertThat(result, is(expected));
    }
    /**
     * Division test.
     */
    @Test
    public void whenDivOneDivideOneThenOne() {
        Calculator calc = new Calculator();
        calc.div(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
    /**
     * Multiply test.
     */
    @Test
    public void whenMultiplyOneMultiplyOneThenOne() {
        Calculator calc = new Calculator();
        calc.multiply(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

}
