package org.Team6.SorryModel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private Player player;

    private Board board;

    private Pawn pawnToMove;

    @BeforeEach
    void setUp() {
        ArrayList<String> pawnColors = new ArrayList<>(Arrays.asList("red"));
        this.board = new Board(pawnColors);
        this.player = new Player("red", this.board);
        this.pawnToMove = new Pawn(PawnColor.RED, 6);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findPossiblePawnMoves() {
        Card drawnCard = new Card(CardValue.SEVEN);
        this.player.findPossiblePawnMoves(drawnCard);
        assertEquals(this.player.getPossiblePawnMoves().size(), 0);

        drawnCard = new Card(CardValue.ONE);
        this.player.findPossiblePawnMoves(drawnCard);
        assertEquals(this.player.getPossiblePawnMoves().size(), 4);
    }

    @Test
    void movePawn() {
        assertTrue(this.pawnToMove.isAtStart());
    }
}