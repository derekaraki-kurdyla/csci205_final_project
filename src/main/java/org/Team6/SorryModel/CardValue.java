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
    ONE("Either move a pawn from Start or move a pawn one space forward"),
    TWO("Either move a pawn from Start or move a pawn two spaces forward. Drawing a two entitles the player to draw again at the end of their turn. If the player cannot use a two to move, they can still draw again"),
    THREE("Move a pawn three spaces forward."),
    FOUR("Move a pawn four spaces backward."),
    FIVE("Move a pawn five spaces forward."),
    SEVEN("Move one pawn seven spaces forward, or split the seven spaces between two pawns (such as four spaces for one pawn and three for another). This makes it possible for two pawns to enter Home on the same turn, for example. The seven cannot be used to move a pawn out of Start, even if the player splits it into a six and one or a five and two. The entire seven spaces must be used or their turn ends. The player can not move their pawn backwards with a split."),
    EIGHT("Move a pawn eight spaces forward."),
    TEN("Move a pawn ten spaces forward or one space backward. If none of a player's pawns can move forward 10 spaces, then one pawn must move back one space."),
    ELEVEN("Move eleven spaces forward, or switch the places of one of the player's own pawns and an opponent's pawn. A player who cannot move 11 spaces is not forced to switch and instead can end their turn. An 11 cannot be used to switch a pawn that is in a Safety Zone."),
    TWELVE("Move a pawn twelve spaces forward."),
    SORRY("Take any one pawn from Start and move it directly to a square occupied by any opponent's pawn, sending that pawn back to its own Start. A Sorry! card cannot be used on an opponent's pawn in a Safety Zone or at the Home base. If there are no pawns on the player's Start, or no opponent's pawns on any space that can be moved to, the turn ends. ");

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
