/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Leo McMenimen
 * Section: CSCI 205 section 02
 * Date: 11/10/23
 * Time: 10:08 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: Spaces
 *
 * Description:
 *
 * ****************************************
 */
package org.Team6.SorryModel;





enum SpaceType {
    OCCUPIED, //This will be if the space already has a pawn on the space
    UNOCCUPIED, //If the space does not already have a pawn on it
    SLIDERANGE, //This is the range that is contained by slide
    STARTSLIDE, //This is the location that you need to land on in order to slide
    START, //This is the location tht all pawns will begin at, and if they get reset it will be to here
    HOME, //This is the base where the pawns are trying to get to
    SAFEZONE //This is the distance leading up to home that will not allow you to be bumped back to the start
}
public class Spaces {

    /**
     * An enumerator that will contain the different type of spaces that we will have.
     * These will be used to determine what will happen in our game
     */


    //THis is the variable I will be using to create the space
    private SpaceType spacetype;


    /**
     * This is how you will create a new space
     * @param
     */
    public Spaces(SpaceType SpaceType){
        this.spacetype = SpaceType;
    }



    /**
     * Create a method that will allow you to set the space to whatever you would like
     */
    public void setSpace(SpaceType SpaceType){
        this.spacetype = SpaceType;
    }
}