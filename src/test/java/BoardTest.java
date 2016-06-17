import main.java.Board;
import org.junit.Test;
import java.awt.*;
import static org.junit.Assert.assertEquals;

public class BoardTest
{
    @Test
    public void testisOnBoard()
    {
        Board board = new Board(100, 100);
        Point coord = new Point(10, 10);
        assertEquals("x: 10 and y: 10 must be is on board", true, board.isOnBoard(coord));
    }

    @Test
    public void testXIsNotOnBoard()
    {
        Board board = new Board(100, 50);
        Point coord = new Point(101, 10);
        assertEquals("x: 101 and y: 10 X must not be is on board", false, board.isOnBoard(coord));
    }

    @Test
    public void testYIsNotOnBoard()
    {
        Board board = new Board(100, 50);
        Point coord = new Point(10, 100);
        assertEquals("x: 10 and y: 100 Y must not be is on board", false, board.isOnBoard(coord));
    }
}
