package main.java;

import java.awt.*;

public class Board
{
    private final int height;
    private final int width;

    public Board(int height, int width)
    {
        this.height = height;
        this.width = width;
    }

    public boolean isOnBoard(Point coord)
    {
        return this.isXOnBoard(coord) && this.isYOnBoard(coord);
    }

    private boolean isXOnBoard(Point coord)
    {
        return coord.getX() > 0 && coord.getX() < this.height;
    }

    private boolean isYOnBoard(Point coord)
    {
        return coord.getY() > 0 && coord.getY() < this.width;
    }
}
