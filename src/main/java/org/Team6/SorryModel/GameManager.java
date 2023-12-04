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
 * Class: GameManager
 *
 * Description: This class is used to create the necessary objects that will be used
 * in our Sorry! game. This class creates a board, deck, and players, and it checks
 * for a win condition
 *
 * ****************************************
 */
package org.Team6.SorryModel;

import java.util.ArrayList;

/**
 * This class is used to create the necessary objects that will be used
 * in our Sorry! game. This class creates a board, deck, and players, and it checks
 * for a win condition
 */
public class GameManager {

    /**
     * {@link Board} object for each Sorry game
     */
    private Board gameBoard;

    /**
     * {@link Deck} object for each Sorry game
     */
    private Deck gameDeck;

    /**
     * {@link ArrayList} object for storing {@link Player} objects
     */
    private ArrayList<Player> playerArrayList = new ArrayList<>();

    /**
     * number of players in this instance of Sorry boardgame
     */
    private int numPlayers;

    /**
     * {@link Player} object whose turn it currently is
     */
    private Player currPlayer;

    /**
     * Colors chosen by players
     */
    private ArrayList<String> pawnColors = new ArrayList<>();

    /**
     * Most recent card drawn
     */
    private Card drawnCard;

    /**
     * Index that correlates to the current player
     */
    private int currPlayerIndex;


    /**
     * constructor for {@link GameManager} class
     */
    public GameManager() {
    }


    /**
     * This method creates a new {@link Board} object.
     * Then for each color in the pawnColors ArrayList, create a new player
     * Finally, create a new deck
     */
    public void initBoardAndDeck() {
        // Create a Board
        this.gameBoard = new Board(this.pawnColors); //need to initialize the gameBoard first in order to create this.playerArrayList

        // Create the players
        for (String pawnColor : this.pawnColors) {
            this.playerArrayList.add(new Player(pawnColor, this.gameBoard)); //this is just so that GameManager can access turnorder
        }

        // Create the Deck
        this.gameDeck = new Deck();

    }

    /**
     * Check to see if the game is over. The game is over when all four pawns of
     * one color are at home.
     * @return true if all four pawns of a color are at home, false otherwise
     */
    public boolean isGameOver() {
        // Pawn count
        int countRed = 0;
        int countBlue = 0;
        int countYellow = 0;
        int countGreen = 0;

        // Count each pawn of each color if it is at home
        for (Pawn pawn : this.gameBoard.getRedPawns()) {
            if (pawn.isAtEnd())
                countRed++;
        }
        for (Pawn pawn : this.gameBoard.getBluePawns()) {
            if (pawn.isAtEnd())
                countBlue++;
        }
        for (Pawn pawn : this.gameBoard.getYellowPawns()) {
            if (pawn.isAtEnd())
                countYellow++;
        }
        for (Pawn pawn : this.gameBoard.getGreenPawns()) {
            if (pawn.isAtEnd())
                countGreen++;
        }

        return (countRed == 4 || countBlue == 4 || countYellow == 4 || countGreen == 4);
    }


    public ArrayList<Player> getPlayerArrayList() {
        return playerArrayList;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public ArrayList<String> getPawnColors() {
        return pawnColors;
    }

    public Deck getGameDeck() {
        return gameDeck;
    }

    public Card getDrawnCard() {
        return drawnCard;
    }

    public void setDrawnCard(Card drawnCard) {
        this.drawnCard = drawnCard;
    }

    public Player getCurrPlayer() {
        return currPlayer;
    }

    public void setCurrPlayer(Player currPlayer) {
        this.currPlayer = currPlayer;
    }

    public int getCurrPlayerIndex() {
        return this.currPlayerIndex;
    }

    public void setCurrPlayerIndex(int num){
        this.currPlayerIndex = num;
    }

    public Board getGameBoard() {
        return gameBoard;
    }

}
