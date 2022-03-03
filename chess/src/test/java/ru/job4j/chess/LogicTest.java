package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LogicTest {

    @Test(expected = FigureNotFoundException.class)
    public void testFigureNotFound() throws FigureNotFoundException,
            OccupiedCellException,
            ImpossibleMoveException {
        Logic logic = new Logic();
        BishopBlack position = new BishopBlack(Cell.D3);
        logic.move(Cell.C1, Cell.H6);
    }

    @Test(expected = OccupiedCellException.class)
    public void testOccupiedCell() throws FigureNotFoundException,
            OccupiedCellException,
            ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.add(new BishopBlack(Cell.B2));
        logic.move(Cell.A1, Cell.C3);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testImpossibleMove() throws FigureNotFoundException,
            OccupiedCellException,
            ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.move(Cell.A1, Cell.B1);
    }
}