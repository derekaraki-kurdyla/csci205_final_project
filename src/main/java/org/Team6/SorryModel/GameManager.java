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
 * Class: GameManager
 *
 * Description:
 *
 * ****************************************
 */
package org.Team6.SorryModel;

import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {

    /** {@link Board} object for each Sorry game */
    private Board gameBoard = new Board();

    /** {@link Deck} object for each Sorry game */
    private Deck gameDeck = new Deck();

    /** {@link ArrayList} object for storing {@link Player} objects*/
    private ArrayList<Player> playerArrayList = new ArrayList<>();

    /** number of players in this instance of Sorry boardgame */
    private int numPlayers;

    /** constructor for {@link GameManager} class */
    public GameManager(){
        this.displayWelcome();
        this.getNumPlayers();
        this.getColorPawns();

    }

    /**
     * Welcomes the players to Sorry
     */
    private void displayWelcome() {
        System.out.println("Welcome to Sorry!");
    }

    /**
     * asks the users for the number of {@link Player} and updates {@link #numPlayers}
     */
    private void getNumPlayers(){
        System.out.println("How many players are playing Sorry? [1-4]");
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;
        while (!validInput) {
            // Check if the input is an integer
            if (scan.hasNextInt()) {
                userInput = scan.nextInt();

                // Check if the number is within the specified range
                if (userInput >= 1 && userInput <= 4) {
                    System.out.println("Valid input: " + userInput);
                    validInput = true; // Set the flag to exit the loop
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and 4.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next(); // Consume the invalid input to avoid an infinite loop
            }
        }
        this.numPlayers = userInput;
    }

    /**
     * determines what {@link PawnColor} each of the{@link Player} objects
     * will use for their {@link Pawn} objects
     */
    private void getColorPawns(){
        ArrayList<String> pawnColors = new ArrayList<>();
        pawnColors.add("red");
        pawnColors.add("blue");
        pawnColors.add("yellow");
        pawnColors.add("green");
        for(int i = 1; i <= this.numPlayers; i++){
            System.out.println("What color does player " + i + " want to be? [red, blue, yellow, green]");
            Scanner scan = new Scanner(System.in);
            String userInput = " ";
            boolean validInput = false;
            while (!validInput) {
                // Check if the input is a String
                if (scan.hasNext()) {
                    userInput = scan.next();

                    // Check if the String is one of the
                    if (pawnColors.contains(userInput)) {
                        System.out.println("Valid input: " + userInput);
                        validInput = true; // Set the flag to exit the loop
                    } else {
                        System.out.println("Invalid input. Please enter a color [red, blue, yellow, green]");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a string.");
                    scan.next(); // Consume the invalid input to avoid an infinite loop
                }
            }
            this.playerArrayList.add(new Player(userInput));
        }
    }

    public ArrayList<Player> getPlayerArrayList() {
        return playerArrayList;
    }
}
