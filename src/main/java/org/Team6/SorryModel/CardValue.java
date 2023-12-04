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
 * An enumerator that represents all the card values that are possible for a user to get.
 * These will be used to assign values to the card class
 * ****************************************
 */
package org.Team6.SorryModel;

/**
 * enum that represents the card value which determines what the {@link Player} is able to do
 */

public enum CardValue {
    ONE("Move from Start, or move forward one space."),
    TWO("Move from Start, or move forward two spaces. Draw Again."),
    THREE("Move forward three spaces."),
    FOUR("Move backward four spaces."),
    FIVE("Move forward five spaces."),
    SEVEN("Move forward seven spaces."),
    EIGHT("Move forward eight spaces."),
    TEN("Move forward ten spaces."),
    ELEVEN("Move forward eleven spaces."),
    TWELVE("Move forward twelve spaces."),
    SORRY("Move forward thirteen spaces.");

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
