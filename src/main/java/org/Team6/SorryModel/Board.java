/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla
 * Section: 9am-10am
 * Date: 11/9/23
 * Time: 10:00 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: Board
 *
 * Description:
 *
 * ****************************************
 */
package org.Team6.SorryModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Board class that encapsulates the functionality of the Sorry board game.
 */
public class Board {

    /** array of red {@link Pawn} objects */
    private ArrayList<Pawn> redPawns = new ArrayList<>();

    /** array of blue {@link Pawn} objects */
    private ArrayList<Pawn> bluePawns = new ArrayList<>();

    /** array of yellow {@link Pawn} objects */
    private ArrayList<Pawn> yellowPawns = new ArrayList<>();

    /** array of green {@link Pawn} objects */
    private ArrayList<Pawn> greenPawns = new ArrayList<>();

    /** {@link Map} of {@link Pawn} objects and their corresponding position on the board*/
    private Map<Pawn, Integer> mapOfBoard = new HashMap<>();

    /** constructor for {@link Board} class */
    public Board(){

    }
}
