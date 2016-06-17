package main.java;

import java.awt.*;

enum Direction
{
    Forward, Back, Left, Right
}

public class Snake
{
    private final Point point;
    private final int step;
    private Snake body;
    private Direction direction = Direction.Forward;

    public Snake(Point point, int step)
    {
        this.point = point;
        this.step = step;
        this.body = null;
    }

    public void growUp(Direction direction)
    {
        if (this.body == null) {
            this.body = new Snake(this.getPoint(), this.step);
        } else {
            this.body.growUp(direction);
        }

        this.move(direction);
    }

    public void move(Direction direction)
    {
        switch (direction)
        {
            case Forward:
                this.moveUp();
                break;
            case Back:
                this.moveDown();
                break;
            case Left:
                this.moveLeft();
                break;
            case Right:
                this.moveRight();
                break;
        }
    }

    private void moveUp()
    {
        this.point.y += this.step;
    }

    private void moveDown()
    {
        this.point.y -= this.step;
    }

    private void moveLeft()
    {
        this.point.x -= this.step;
    }

    private void moveRight()
    {
        this.point.x += this.step;
    }

    public Point getPoint()
    {
        return this.point.getLocation();
    }
}
