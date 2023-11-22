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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

    /** {@link Map} of {@link Integer} objects for the {@link #mapOfBoard} indices
     * and their corresponding {@link Pawn} object on that index
     */
    private Map<Pawn, Integer> mapOfBoard = new HashMap<>();

    /** {@link Map} of {@link Integer} objects  */
    private Map<Integer, SpaceType> mapOfSpaces = new HashMap<>();


    /** constructor for {@link Board} class */
    public Board(ArrayList<String> pawnColors){
        this.initPawnsOnBoard(pawnColors);
        this.initSpacesOnBoard(); //just initializes all to unoccupied
    }

    private void initSpacesOnBoard(){
        for(int i = 1; i <= 84; i++){
            this.mapOfSpaces.put(i, SpaceType.UNOCCUPIED);
        }
    }

    /**
     * method that initializes {@link #mapOfSpaces}
     * to their starting space enumerations {@link SpaceType}
     */
    public void initSlideSpacesOnBoard(Player player){
        // make sure when setting a spacetype as occupied by different, that only holds true if it is also not the start of the slide
        // reason for this is because can only be one type, so it needs to be start of slide so that the pawn will slide.
        // (this will automatically knock off all other pawns on the slide anyway)

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

        for (String pawnColor : pawnColors) {

            switch (pawnColor) {
                case "red" -> {
                    for(int i = 0; i < 4; i++) {
                        this.redPawns.add(new Pawn(PawnColor.RED));
                    }
                }
                case "blue" -> {
                    for(int i = 0; i < 4; i++) {
                        this.bluePawns.add(new Pawn(PawnColor.BLUE));
                    }
                }
                case "yellow" -> {
                    for(int i = 0; i < 4; i++) {
                        this.yellowPawns.add(new Pawn(PawnColor.YELLOW));
                    }
                }
                case "green" -> {
                    for(int i = 0; i < 4; i++) {
                        this.greenPawns.add(new Pawn(PawnColor.GREEN));
                    }
                }
            }
        }
        System.out.println("length of redPawns: " + this.redPawns.size());
        System.out.println("length of bluePawns: " + this.bluePawns.size());
        System.out.println("length of greenPawns: " + this.greenPawns.size());
        System.out.println("length of yellowPawns: " + this.yellowPawns.size());
    }

    private void initRedSlideSpaces(){
        this.mapOfSpaces.put(2, SpaceType.START_SHORT_SLIDE_DIFFERENT);
        this.mapOfSpaces.put(10, SpaceType.START_LONG_SLIDE_DIFFERENT);
    }
    private void initBlueSlideSpaces(){
        this.mapOfSpaces.put(17, SpaceType.START_SHORT_SLIDE_DIFFERENT);
        this.mapOfSpaces.put(25, SpaceType.START_LONG_SLIDE_DIFFERENT);
    }
    private void initYellowSlideSpaces(){
        this.mapOfSpaces.put(32, SpaceType.START_SHORT_SLIDE_DIFFERENT);
        this.mapOfSpaces.put(40, SpaceType.START_LONG_SLIDE_DIFFERENT);
    }
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
}