package org.Team6.SorryModel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PawnTest {

    private Pawn pawn;
    @BeforeEach
    void setUp() {
        Pawn pawn = new Pawn(PawnColor.BLUE, 5);
        this.pawn = pawn;
    }

    @Test
    void sendStart() {
        this.pawn.sendStart();
        assertTrue(this.pawn.isAtStart());
        assertFalse(this.pawn.isAtEnd());
        assertFalse(this.pawn.isOnBoard());
    }

    @Test
    void reachedEnd() {
        this.pawn.moveFromStart();
        this.pawn.reachedEnd();
        assertFalse(this.pawn.isAtStart());
        assertTrue(this.pawn.isAtEnd());
        assertFalse(this.pawn.isOnBoard());
    }

    @Test
    void moveFromStart() {
        this.pawn.moveFromStart();
        assertFalse(this.pawn.isAtStart());
        assertFalse(this.pawn.isAtEnd());
        assertTrue(this.pawn.isOnBoard());
    }
}