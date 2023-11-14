package org.Team6;

import org.Team6.SorryModel.Deck;
import org.Team6.SorryModel.GameManager;
import org.Team6.SorryModel.Player;

public class Main {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();

        //use java FX for this function to run only if button to play game has been pressed
        gameManager.playGame();
    }
}