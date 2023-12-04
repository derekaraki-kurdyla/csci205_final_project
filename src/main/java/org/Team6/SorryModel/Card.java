/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla, Alex Araki-Kurdyla, Nathan Stamford, Leo McMenimen
 * Section: 9am-10am
 * Date: 11/8/23
 * Time: 9:39 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: Card
 *
 * Description:
 * This is the class for cards, it will create a Sorry card and links it to the associated card value
 * ****************************************
 */
package org.Team6.SorryModel;

/**
 * simple class that encapsulates a Sorry card with just its associated {@link #cardValue}
 */
public class Card {

    /** Value of the Sorry card */
    private final CardValue cardValue;

    /** Simple constructor for Card class */
    public Card(CardValue cardValue){
        this.cardValue = cardValue;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

}
