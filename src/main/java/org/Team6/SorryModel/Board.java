/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla, Alex Araki-Kurdyla, Nathan Stamford, Leo McMenimen
 * Section: 9am-10am
 * Date: 11/9/23
 * Time: 10:00 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: Board
 *
 * Description: This class represents the Sorry! Board. It keeps track of and creates
 * all the pawns and spaces currently on the board.
 *
 * ****************************************
 */
package org.Team6.SorryModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * This class represents the Sorry! Board. It keeps track of and creates
 * all the pawns and spaces currently on the board.
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

    /** array of all {@link Pawn} objects */
    private ArrayList<Pawn> allPawns = new ArrayList<>();

    /** {@link Map} of {@link Integer} objects for the {@link #mapOfBoard} indices
     * and their corresponding {@link Pawn} object on that index
     */
    private Map<Pawn, Integer> mapOfBoard = new HashMap<>();

    /** {@link Map} of {@link Integer} objects  */
    private Map<Integer, SpaceType> mapOfSpaces = new HashMap<>();


    /** Constructor for {@link Board} class */
    public Board(ArrayList<String> pawnColors){
        this.initPawnsOnBoard(pawnColors);
        this.initSpacesOnBoard();
    }

    /**
     * Method that initializes {@link #mapOfSpaces}
     * to their starting space enumerations {@link SpaceType}
     */
    private void initSpacesOnBoard(){
        for(int i = 1; i <= 84; i++){ //have to do this to clear all slide indices
            this.mapOfSpaces.put(i, SpaceType.UNOCCUPIED);
        }
    }

    /**
     * This method will initialize the slide spaces to the board, we will have cases for each color
     *
     * @param player
     */
    public void initSlideSpacesOnBoard(Player player){

        for(int i = 1; i <= 84; i++){ //have to do this to clear all slide indices
            if(this.mapOfSpaces.get(i).equals(SpaceType.START_LONG_SLIDE_DIFFERENT) || this.mapOfSpaces.get(i).equals(SpaceType.START_SHORT_SLIDE_DIFFERENT)){
                this.mapOfSpaces.put(i, SpaceType.UNOCCUPIED);
            }
        }

        //Switch depending on the color that is needed
        switch(player.getPawnColor()){
            case RED -> {
                this.initBlueSlideSpaces();
                this.initYellowSlideSpaces();
                this.initGreenSlideSpaces();
            }
            case BLUE -> {
                this.initRedSlideSpaces();
                this.initYellowSlideSpaces();
                this.initGreenSlideSpaces();
            }
            case YELLOW -> {
                this.initRedSlideSpaces();
                this.initBlueSlideSpaces();
                this.initGreenSlideSpaces();
            }
            case GREEN -> {
                this.initRedSlideSpaces();
                this.initBlueSlideSpaces();
                this.initYellowSlideSpaces();
            }
        }
    }

    /**
     * updates 2-4 out of {@link #redPawns}, {@link #bluePawns}, {@link #greenPawns} and {@link #yellowPawns}
     * @param pawnColors Arraylist of pawnColors in this instance of Sorry game
     */
    private void initPawnsOnBoard(ArrayList<String> pawnColors) {

        // For each PawnColor, create four pawns
        for (String pawnColor : pawnColors) {

            switch (pawnColor) {
                case "red" -> {
                    for(int i = 0; i < 4; i++) {
                        Pawn pawn = new Pawn(PawnColor.RED, i + 1);
                        this.redPawns.add(pawn);
                        this.allPawns.add(pawn);
                    }
                }
                case "blue" -> {
                    for(int i = 0; i < 4; i++) {
                        Pawn pawn = new Pawn(PawnColor.BLUE, i + 1);
                        this.bluePawns.add(pawn);
                        this.allPawns.add(pawn);
                    }
                }
                case "yellow" -> {
                    for(int i = 0; i < 4; i++) {
                        Pawn pawn = new Pawn(PawnColor.YELLOW,i + 1);
                        this.yellowPawns.add(pawn);
                        this.allPawns.add(pawn);
                    }
                }
                case "green" -> {
                    for(int i = 0; i < 4; i++) {
                        Pawn pawn = new Pawn(PawnColor.GREEN,i + 1);
                        this.greenPawns.add(pawn);
                        this.allPawns.add(pawn);
                    }
                }
            }
        }
    }

    /**
     * This initializes the red slide space on the board
     *
     */
    private void initRedSlideSpaces(){
        this.mapOfSpaces.put(2, SpaceType.START_SHORT_SLIDE_DIFFERENT);
        this.mapOfSpaces.put(10, SpaceType.START_LONG_SLIDE_DIFFERENT);
    }

    /**
     * This initializes the blue slide space on the board
     *
     */
    private void initBlueSlideSpaces(){
        this.mapOfSpaces.put(17, SpaceType.START_SHORT_SLIDE_DIFFERENT);
        this.mapOfSpaces.put(25, SpaceType.START_LONG_SLIDE_DIFFERENT);
    }

    /**
     * This initializes the yellow slide space on the board
     *
     */
    private void initYellowSlideSpaces(){
        this.mapOfSpaces.put(32, SpaceType.START_SHORT_SLIDE_DIFFERENT);
        this.mapOfSpaces.put(40, SpaceType.START_LONG_SLIDE_DIFFERENT);
    }

    /**
     * This initializes the green slide space on the board
     *
     */
    private void initGreenSlideSpaces(){
        this.mapOfSpaces.put(47, SpaceType.START_SHORT_SLIDE_DIFFERENT);
        this.mapOfSpaces.put(55, SpaceType.START_LONG_SLIDE_DIFFERENT);
    }

    public Map<Pawn, Integer> getMapOfBoard(){
        return this.mapOfBoard;
    }

    public Map<Integer, SpaceType> getMapOfSpaces(){
        return this.mapOfSpaces;
    }

    public ArrayList<Pawn> getRedPawns(){
        return this.redPawns;
    }

    public ArrayList<Pawn> getBluePawns(){
        return this.bluePawns;
    }

    public ArrayList<Pawn> getGreenPawns(){
        return this.greenPawns;
    }

    public ArrayList<Pawn> getYellowPawns(){
        return this.yellowPawns;
    }

    public ArrayList<Pawn> getAllPawns() {
        return allPawns;
    }
}