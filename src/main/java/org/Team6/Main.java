package org.Team6;

import org.Team6.SorryModel.Deck;
import org.Team6.SorryModel.GameManager;
import org.Team6.SorryModel.Player;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        GameManager me = new GameManager();
        for(Player player: me.getPlayerArrayList()){
            System.out.println(player.getPawnColor());
        }
    }
}