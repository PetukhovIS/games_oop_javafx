package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;

import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    public void testPosition() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Assert.assertEquals(Cell.C1, bishop.position());

    }

    @Test
    public void testCopy() {
        BishopBlack bishop = new BishopBlack(Cell.C8);
        Assert.assertEquals(Cell.E6, bishop.copy(Cell.E6).position());
    }

    @Test
    public void way() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        Cell[] correctWay = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Cell[] way = bishop.way(Cell.G5);
        Assert.assertEquals(correctWay, way);
    }

    @Test
    public void diagonalMoveC1ToG5IsTrue() {
        Cell sourceCell = Cell.C1;
        Cell destCell = Cell.G5;
        BishopBlack bs = new BishopBlack(Cell.A1);
        Assert.assertTrue(bs.isDiagonal(sourceCell, destCell));
    }

    @Test
    public void diagonalMoveA1ToE3IsFalse() {
        Cell sourceCell = Cell.A1;
        Cell destCell = Cell.E3;
        BishopBlack bs = new BishopBlack(Cell.A1);
        Assert.assertFalse(bs.isDiagonal(sourceCell, destCell));
    }
}
