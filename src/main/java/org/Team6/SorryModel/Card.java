/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla
 * Section: 9am-10am
 * Date: 11/8/23
 * Time: 9:39 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: Card
 *
 * Description:
 *
 * ****************************************
 */
package org.Team6.SorryModel;

enum CardValue {
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SEVEN,
    EIGHT,
    TEN,
    ELEVEN,
    TWELVE,
    SORRY;
}

public class Card {

    /** Value of the Sorry card */
    private CardValue cardValue;

    public Card(CardValue cardValue){
        this.cardValue = cardValue;
    }

    public CardValue getCardValue() {
        return cardValue;
    }
}
