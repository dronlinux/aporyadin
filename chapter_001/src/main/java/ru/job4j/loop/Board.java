package ru.job4j.loop;

/**
 * Board Class.
 *
 * @author Andrew A. Poryadin (dron600@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Board {

    /**
     * String Chess Board.
     */
    private StringBuilder strChessBoard;
    /**
     * OS specific line separator.
     */
    private final String osLineSeparator;

    /**
     * Board class constructor.
     */
    public Board() {
        this.strChessBoard = new StringBuilder();
        this.osLineSeparator = System.getProperty("line.separator");
    }

    /**
     * Paint Chess Board.
     *
     * @param width  argument
     * @param height argument
     * @return String Chess Board
     */
    public String paint(int width, int height) {

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((i + j) % 2 == 0) {
                    this.strChessBoard.append("x");
                } else {
                    this.strChessBoard.append(" ");
                }
            }
            this.strChessBoard.append(this.osLineSeparator);
        }

        return this.strChessBoard.toString();
    }
}