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

    public ArrayList<Pawn> redStart = new ArrayList<>();

    public ArrayList<Pawn> blueStart = new ArrayList<>();

    public ArrayList<Pawn> yellowStart = new ArrayList<>();

    public ArrayList<Pawn> greenStart = new ArrayList<>();

    public ArrayList<Spaces> redHome = new ArrayList<>();

    public ArrayList<Spaces> blueHome = new ArrayList<>();

    public ArrayList<Spaces> yellowHome = new ArrayList<>();

    public ArrayList<Spaces> greenHome = new ArrayList<>();





    /** constructor for {@link Board} class */
    public Board(ArrayList<Player> listOfPlayers){
        this.initBoard(listOfPlayers);

    }

    /**
     * updates 2-4 out of {@link #redPawns}, {@link #bluePawns}, {@link #greenPawns} and {@link #yellowPawns}
     * @param listOfPlayers Arraylist of players in this instance of Sorry game
     */
    private void initBoard(ArrayList<Player> listOfPlayers) {
        for (Player player : listOfPlayers) {
            String pawnColor = player.getPawnColor().toLowerCase();

            switch (pawnColor) {
                case "red" -> {
                    for(int i = 0; i < 4; i++) {
                        this.redPawns.add(new Pawn(PawnColor.RED));
                    }
                    for(int i = 0; i < 4; i++) {
                        this.redStart.add(new Pawn(PawnColor.RED));
                    }

                }
                case "blue" -> {
                    for(int i = 0; i < 4; i++) {
                        this.bluePawns.add(new Pawn(PawnColor.BLUE));
                    }
                    for(int i = 0; i < 4; i++) {
                        this.blueStart.add(new Pawn(PawnColor.BLUE));
                    }
                }case "yellow" -> {
                    for(int i = 0; i < 4; i++) {
                        this.yellowPawns.add(new Pawn(PawnColor.YELLOW));
                    }
                    for(int i = 0; i < 4; i++) {
                        this.yellowStart.add(new Pawn(PawnColor.YELLOW));
                    }
                }case "green" -> {
                    for(int i = 0; i < 4; i++) {
                        this.greenPawns.add(new Pawn(PawnColor.GREEN));
                    }
                    for(int i = 0; i < 4; i++) {
                        this.greenStart.add(new Pawn(PawnColor.GREEN));
                    }
                }
            }
        }
    }

}
