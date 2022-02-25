package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell expected = bishopBlack.position();
        assertThat(expected, is(Cell.C1));
    }

   /* public void testWayRight() {
        BishopBlack dest = new BishopBlack(Cell.D3);
        BishopBlack position = new BishopBlack(Cell.B1);
        Cell[] cell = way(dest);

    }

    public void testIsDiagonal() {

    } */

    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G5);
        bishopBlack.copy(Cell.G5);
        Cell expected = bishopBlack.position();
        assertThat(expected, is(Cell.G5));
    }
}