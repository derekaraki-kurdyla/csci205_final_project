/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla, Alex Araki-Kurdyla, Nathan Stamford, Leo McMenimen
 * Section: 9am-10am
 * Date: 11/9/23
 * Time: 10:00 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: Board
 *
 * Description: These are our tests for the Board class.
 * This class represents the Sorry! Board. It keeps track of and creates
 * all the pawns and spaces currently on the board.
 *
 * ****************************************
 */
package org.Team6.SorryModel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    private Board board;

    private Player currPlayer;

    @BeforeEach
    void setUp() {
        ArrayList<String> pawnColors = new ArrayList<>(Arrays.asList("red", "yellow"));
        this.board = new Board(pawnColors);
        this.currPlayer = new Player("red", this.board);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void initSlideSpacesOnBoard(){
        this.board.initSlideSpacesOnBoard(this.currPlayer);

        assertNotEquals(this.board.getMapOfSpaces().get(2), SpaceType.START_SHORT_SLIDE_DIFFERENT);
        assertNotEquals(this.board.getMapOfSpaces().get(10), SpaceType.START_LONG_SLIDE_DIFFERENT);

        assertEquals(this.board.getMapOfSpaces().get(17), SpaceType.START_SHORT_SLIDE_DIFFERENT);
        assertEquals(this.board.getMapOfSpaces().get(25), SpaceType.START_LONG_SLIDE_DIFFERENT);

        assertEquals(this.board.getMapOfSpaces().get(32), SpaceType.START_SHORT_SLIDE_DIFFERENT);
        assertEquals(this.board.getMapOfSpaces().get(40), SpaceType.START_LONG_SLIDE_DIFFERENT);

        assertEquals(this.board.getMapOfSpaces().get(47), SpaceType.START_SHORT_SLIDE_DIFFERENT);
        assertEquals(this.board.getMapOfSpaces().get(55), SpaceType.START_LONG_SLIDE_DIFFERENT);
    }

    @Test
    void getRedPawns() {
        assertTrue(this.board.getRedPawns().size() == 4);
    }

    @Test
    void getBluePawns() {
        assertFalse(this.board.getBluePawns().size() == 4);
    }

    @Test
    void getGreenPawns() {
        assertFalse(this.board.getGreenPawns().size() == 4);
    }

    @Test
    void getYellowPawns() {
        assertTrue(this.board.getYellowPawns().size() == 4);
    }
}