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
 * Description: A class to represent a Pawn in the game Sorry! Pawns will keep track
 * of where they are on the board.
 *
 * ****************************************
 */
package org.Team6.SorryModel;

/**
 * A class to represent a Pawn in the game Sorry! Pawns will keep track
 * of where they are on the board.
 */
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

    /** ID to link to view */
    private String id;

    /**
     * The landing index of the pawn
     */
    private int landingIndex;

    /** Constructor that lets us set the color of the pawn */
    public Pawn(PawnColor color, int idNum)
    {
        this.color = color;
        this.atStart = true;
        this.onBoard = false;
        this.atEnd = false;
        this.id = generateId(idNum);
        this.landingIndex = 0;
    }

    /**
     * Generate and set the id of a {@link Pawn} object
     * @param idNum - number of pawn
     * @return an id of a pawn that matches the fxid of an
     * FXML {@link javafx.scene.shape.Circle} object.
     */
    private String generateId(int idNum) {
        if (this.color == PawnColor.RED){
            this.id = "redPawn" + idNum;
        }
        else if (this.color == PawnColor.BLUE){
            this.id = "bluePawn" + idNum;
        }
        else if (this.color == PawnColor.GREEN){
            this.id = "greenPawn" + idNum;
        }
        else if (this.color == PawnColor.YELLOW){
            this.id = "yellowPawn" + idNum;
        }
        return this.id;
    }


    public PawnColor getColor() {return this.color;}

    public boolean isAtStart() {return this.atStart;}

    public boolean isAtEnd() {return this.atEnd;}

    public boolean isOnBoard() {return this.onBoard;}

    /**
     * Update the pawn's location booleans when it is at Start
     */
    public void sendStart(){
        this.atStart = true;
        this.onBoard = false;
    }

    /**
     * Update the pawn's location booleans when it reaches the end
     */
    public void reachedEnd(){
        this.onBoard = false;
        this.atEnd = true;
    }

    /**
     * Method to move the pawn from the start area and update variables {@link #atStart} and {@link #onBoard}
     */
    public void moveFromStart()
    {
        this.atStart = false;
        this.onBoard = true;
    }

    public String getId() {return id;}

    public int getLandingIndex() {return landingIndex;}

    public void setLandingIndex(int landingIndex) {this.landingIndex = landingIndex;}
}