/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla
 * Section: 9am-10am
 * Date: 11/30/23
 * Time: 12:00 PM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: CardValue
 *
 * Description:
 *
 * ****************************************
 */
package org.Team6.SorryModel;

/**
 * enum that represents the card value which determines what the {@link Player} is able to do
 */

public enum CardValue {
    ONE("Move from Start, or move one space forward"),
    TWO("Move from Start, or move two spaces forward. Draw Again."),
    THREE("Move three spaces forward."),
    FOUR("Move four spaces backward."),
    FIVE("Move five spaces forward."),
    SEVEN("Move seven spaces forward, or split between two pawns."),
    EIGHT("Move eight spaces forward."),
    TEN("Move ten spaces forward or one space backward."),
    ELEVEN("Move eleven spaces forward, or switch with another pawn."),
    TWELVE("Move twelve spaces forward."),
    SORRY("Send a pawn to Start.");

    /**
     * String representation of the card method that is displayed to user
     */
    private String cardMethod;

    CardValue(String cardMethod) {
        this.cardMethod = cardMethod;
    }

    public String getCardMethod() {
        return cardMethod;
    }
}
