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

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameManager {

    /** {@link Board} object for each Sorry game */
    private Board gameBoard;

    /** {@link Deck} object for each Sorry game */
    private Deck gameDeck;

    /** {@link ArrayList} object for storing {@link Player} objects*/
    private ArrayList<Player> playerArrayList = new ArrayList<>();

    /** number of players in this instance of Sorry boardgame */
    private int numPlayers;

    /** {@link Player} object whose turn it currently is */
    private Player currPlayer;

    /** Colors chosen by players */
    private ArrayList<String> pawnColors = new ArrayList<>();


    /** constructor for {@link GameManager} class */
    public GameManager(){
        this.displayWelcome();

        this.getNumPlayers(); //need to update this.numPlayers first

        this.getColorPawns(); //need to update this.pawnColors first to initialize this.gameBoard

        this.gameBoard = new Board(this.pawnColors); //need to initialize the gameBoard first in order to create this.playerArrayList

        for(String pawnColor: this.pawnColors){
            this.playerArrayList.add(new Player(pawnColor, this.gameBoard)); //this is just so that GameManager can access turnorder
        }

        this.gameDeck = new Deck();
    }

    /**
     * Method that runs the entire game logic until game is won or quit
     */
    public void playGame(){
        boolean gameOver = false;
        int currPlayerIndex = 0;
        int countTurns = 0;

        while(!gameOver){
            if(currPlayerIndex == this.playerArrayList.size()){
                currPlayerIndex = 0;
            }

            this.currPlayer = this.playerArrayList.get(currPlayerIndex);

            this.gameBoard.initSlideSpacesOnBoard(this.currPlayer); //do this for every turn because spaces on turn depend on color of pawn currently going

            //use java fx to print this to screen
            System.out.println("It is " + this.currPlayer.getPawnColor() + "'s turn.");

            //use java FX for this function to run only if button to draw has been pressed
            Card drawnCard = this.gameDeck.drawCard();

            this.currPlayer.takeTurn(drawnCard);

            currPlayerIndex ++; //set up for next player's turn
            countTurns ++;

            if(countTurns == 5000){
                gameOver = true;
            }

        }
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
        ArrayList<String> chosenPawnColors = new ArrayList<>();
        ArrayList<String> availablePawnColors = new ArrayList<>(Arrays.asList("red", "blue", "yellow", "green"));

        for(int i = 1; i <= this.numPlayers; i++){
            System.out.println("What color does player " + i + " want to be? [red, blue, yellow, green]");
            Scanner scan = new Scanner(System.in);
            String userInput = " ";
            boolean validInput = false;
            while (!validInput) {
                // Check if the input is a String
                if (scan.hasNext()) {
                    userInput = scan.next();
                    if(!chosenPawnColors.contains(userInput)) {
                        if (availablePawnColors.contains(userInput)) {
                            System.out.println("Valid input: " + userInput);
                            chosenPawnColors.add(userInput); //remove this color from possible pawn colors
                            validInput = true; // Set the flag to exit the loop
                        } else {
                            System.out.println("TRY AGAIN. Invalid input. Please enter a color [red, blue, yellow, green]");
                        }
                    }
                    else{
                        System.out.println("TRY AGAIN. This color has already been chosen.");
                    }
                } else {
                    System.out.println("TRY AGAIN. Invalid input. Please enter a string.");
                    scan.next(); // Consume the invalid input to avoid an infinite loop
                }
            }
            this.pawnColors.add(userInput);
        }
    }

    public ArrayList<Player> getPlayerArrayList() {
        return playerArrayList;
    }
}
