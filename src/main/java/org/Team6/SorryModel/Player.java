/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla
 * Section: 9am-10am
 * Date: 11/9/23
 * Time: 10:30 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: Player
 *
 * Description:
 *
 * ****************************************
 */
package org.Team6.SorryModel;

public class Player {

    /** color of {@link Pawn} for specific instance of player */
    private String pawnColor;

    /** constructor for {@link Player} object that initializes {@link} */
    public Player(String pawnColor){
        this.pawnColor = pawnColor;
    }

    /**
     * carries out the {@link Player} turn depending on their drawn card
     * @param drawnCard the card drawn by the player on their turn
     */
    public static void takeTurn(Card drawnCard) {
        switch (drawnCard.getCardValue()) {
            case ONE -> {}
            case TWO -> {}
            case THREE -> {

            }
            case FOUR -> {}
            case FIVE -> {}
            case SEVEN -> {}
            case EIGHT -> {}
            case TEN -> {}
            case ELEVEN -> {}
            case TWELVE-> {}
            case SORRY -> {}
        }
    }

    public String getPawnColor(){
        return this.pawnColor;
    }

}
