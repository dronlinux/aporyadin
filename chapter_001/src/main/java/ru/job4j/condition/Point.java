package ru.job4j.condition;

/**
 * Condition.
 *
 * @author Andrew A. Poryadin (dron600@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Point {
    /**
     * x field.
     */
    private int x;
    /**
     * y field.
     */
    private int y;

    /**
     * Point constructor.
     *
     * @param x param
     * @param y param
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Get x coordinate.
     *
     * @return x coordinate.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Get y coordinate.
     *
     * @return y coordinate.
     */
    public int getY() {
        return this.y;
    }

    /**
     * Is Point method.
     *
     * @param a param
     * @param b param
     * @return boolean
     */
    public boolean is(int a, int b) {
        return y == a * x + b; // используя координаты точки и вычисления функции.
    }

}