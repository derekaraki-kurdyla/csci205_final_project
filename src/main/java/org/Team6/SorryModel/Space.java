/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla, Alex Araki-Kurdyla, Nathan Stamford, Leo McMenimen
 * Section: CSCI 205 section 02
 * Date: 11/10/23
 * Time: 10:08 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: Spaces
 *
 * Description:
 * SpaceType is an Enumerator that is responsible for showing the different types of spaces on the board
 *
 * Space will just be used to create a new space
 *
 * ****************************************
 */
package org.Team6.SorryModel;





enum SpaceType {
    OCCUPIED, //This will be if the space already has a pawn on the space
    UNOCCUPIED,
    SLIDERANGE, //This is the range that is contained by slide
    START_SHORT_SLIDE_DIFFERENT, //Start of location for short slide of different color
    START_LONG_SLIDE_DIFFERENT, //Start of location for long slide of different color
    END, //This is the base where the pawns are trying to get to
    SAFEZONE //This is the distance leading up to home that will not allow you to be bumped back to the start
}
public class Space {

    /**
     * An enumerator that will contain the different type of spaces that we will have.
     * These will be used to determine what will happen in our game
     */


    //THis is the variable I will be using to create the space
    private SpaceType spaceType;


    /**
     * This is how you will create a new space
     * @param
     */
    public Space(SpaceType spaceType){
        this.spaceType = spaceType;
    }



    /**
     * Create a method that will allow you to set the space to whatever you would like
     */
    public void setSpace(SpaceType spaceType){
        this.spaceType = spaceType;
    }

    public SpaceType getSpaceType(){
        return this.spaceType;
    }
}