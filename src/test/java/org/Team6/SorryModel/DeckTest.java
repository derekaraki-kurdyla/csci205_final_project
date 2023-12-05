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
 * Class: Deck
 *
 * Description:
 * This is a test class for our Deck Class
 *
 * The Deck class is a class that will encapsulate the deck of cards of the sorry board game.
 * It will have methods to initialize and draw cards.
 *
 * ****************************************
 */

package org.Team6.SorryModel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    private Deck deck;
    @BeforeEach
    void setUp() {
        this.deck = new Deck();
    }

    @Test
    void drawCard() {
        assertEquals(45, this.deck.getDeckCount());
        assertEquals(0, this.deck.getDiscardCount());
        Card drawnCard = this.deck.drawCard();
        assert(drawnCard != null);
        assertEquals(44, this.deck.getDeckCount());
        assertEquals(1, this.deck.getDiscardCount());
    }
}