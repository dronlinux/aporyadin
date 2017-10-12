package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author Andrew A. Poryadin (dron600@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {

    /**
     * Result field.
     */
    private double result;

    /**
     * Addition method.
     *
     * @param first argument
     * @param second argument
     */
    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Subtraction method.
     *
     * @param first argument
     * @param second argument
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Multiplication method.
     *
     * @param first argument
     * @param second argument
     */
    public void multiply(double first, double second) {
        this.result = first * second;
    }

    /**
     * Division method.
     *
     * @param first argument
     * @param second argument
     * @throws ArithmeticException If second parameter is Zero
     */
    public void div(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        this.result = first / second;
    }

    /**
     *
     * @return Double result
     */
    public double getResult() {
        return this.result;
    }
}