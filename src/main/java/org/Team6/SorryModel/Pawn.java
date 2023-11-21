/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla
 * Section: 9am-10am
 * Date: 11/9/23
 * Time: 10:01 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: Pawn
 *
 * Description:
 *
 * ****************************************
 */
package org.Team6.SorryModel;

/**
 * enums used to assign a color to a {@link Pawn} since there are only four possible colors for each pawn
 */
enum PawnColor {
    RED,
    GREEN,
    BLUE,
    YELLOW;
}


public class Pawn{

    /** Max index for each Pawn i.e. index of end circle */
    public final static int MAX_INDEX = 66;

    /** Color of the pawn */
    private final PawnColor color;

    /** The pawn is initialized as not onBoard */
    private boolean onBoard;

    /** the pawn is initialized as not isHome */
    private boolean atStart;

    /** the pawn is initialized as not in the end circle */
    private boolean atEnd;

    /** Constructor that lets us set the color of the pawn */
    public Pawn(PawnColor color)
    {
        this.color = color;
        this.atStart = true;
        this.onBoard = false;
        this.atEnd = false;
    }


    /**
     * Method to move a pawn backward
     * @param numSpaces: the number of spaces the pawn will move backward
     */
    public void moveBackward(int numSpaces)
    {

    }

    /**
     * Method to move the pawn from the start area and update variables {@link #atStart} and {@link #onBoard}
     */
    public void moveFromStart()
    {
        this.atStart = false;
        this.onBoard = true;
    }

    public PawnColor getColor()
    {
        return this.color;
    }

    public boolean isAtStart(){
        return this.atStart;
    }

    public boolean isAtEnd(){
        return this.atEnd;
    }

    public boolean isOnBoard(){
        return this.onBoard;
    }

    public void sendHome(){
        this.atStart = true;
        this.onBoard = false;
    }

    public void reachedEnd(){
        this.onBoard = false;
        this.atEnd = true;
    }

}