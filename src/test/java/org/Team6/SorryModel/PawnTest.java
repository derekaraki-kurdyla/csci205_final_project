/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla, Alex Araki-Kurdyla, Nathan Stamford, Leo McMenimen
 * Section: 9am-10am
 * Date: 11/9/23
 * Time: 10:01 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: Pawn
 *
 * Description:
 * This is a test clas for a pawn class
 *
 * The pawn class to represent a Pawn in the game Sorry! Pawns will keep track
 * of where they are on the board.
 *
 * ****************************************
 */

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