package main;

import main.java.Snake;

import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        Snake s = new Snake(new Point(10,10), 1);
        Point p = s.getPoint();
        p.x += 1000;
        System.out.println(p.getX());
        System.out.println(s.getPoint().getX());
    }
}
