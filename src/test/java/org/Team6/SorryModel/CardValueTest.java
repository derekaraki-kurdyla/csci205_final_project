/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla, Alex Araki-Kurdyla, Nathan Stamford, Leo McMenimen
 * Section: 9am-10am
 * Date: 11/30/23
 * Time: 12:00 PM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: CardValue
 *
 * Description:
 * This is a test class for out enumeration for card values
 *
 * An enumerator that represents all the card values that are possible for a user to get.
 * These will be used to assign values to the card class
 * ****************************************
 */

package org.Team6.SorryModel;

import static org.junit.jupiter.api.Assertions.*;

class CardValueTest {
    @org.junit.jupiter.api.Test
    void getCardMethod() {
        Card card = new Card(CardValue.ONE);
        assertTrue(card.getCardValue().getCardMethod().equals("Move from Start, or move forward one space."));
    }
}