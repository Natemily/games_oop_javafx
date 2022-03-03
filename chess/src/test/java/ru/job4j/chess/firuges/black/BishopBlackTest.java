package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Ignore;
import ru.job4j.chess.FigureNotFoundException;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.OccupiedCellException;
import ru.job4j.chess.firuges.Cell;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell expected = bishopBlack.position();
        assertThat(expected, is(Cell.C1));
    }

   public void testWayRight() {
        BishopBlack position = new BishopBlack(Cell.D3);
        Cell[] cell = new Cell[] {Cell.C2, Cell.B1};
        Cell[] expected = position.way(Cell.B1);
        assertThat(expected, is(cell));
    }

    /*public void testWayNotRight() throws ImpossibleMoveException {
        BishopBlack source = new BishopBlack(Cell.D3);
        Cell[] cell = source.way(Cell.B2);
    }*/

    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.G5);
        bishopBlack.copy(Cell.G5);
        Cell expected = bishopBlack.position();
        assertThat(expected, is(Cell.G5));
    }
}