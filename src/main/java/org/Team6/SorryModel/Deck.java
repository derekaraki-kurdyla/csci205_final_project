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
 * Class: Deck
 *
 * Description:
 *
 * ****************************************
 */
package org.Team6.SorryModel;

import java.util.*;

/**
 * simple deck class that encapsulates the deck of the Sorry board game
 */
public class Deck {

    /** A {@link ArrayList} that represents a discard pile comprised of {@link Card} objects */
    private ArrayList<Card> gameDiscardPile = new ArrayList<>();

    /** A {@link ArrayList} that represents the Sorry deck comprised of {@link Card} objects */
    private ArrayList<Card> gameDeck = new ArrayList<>();

    /** A {@link HashMap} that <key, value> are the {@link CardValue} and its corresponding frequency */
    private Map<CardValue, Integer> gameDeckHashMap = new HashMap<>();


    /** Simple constructor for Sorry Deck class */
    public Deck(){
        this.initGameDeck();
        this.initGameDeckHashMap();
    }

    /**
     * method to initialize {@link #gameDeck} with the correct number of {@link Card} objects
     */
    private void initGameDeck(){
        for(int i=0; i<5; i++){
            this.gameDeck.add(new Card(CardValue.ONE));
        }

        for(CardValue value: CardValue.values()){
            if(value != CardValue.ONE) {
                for (int i = 0; i < 4; i++) {
                    this.gameDeck.add(new Card(value));
                }
            }
        }
    }

    /**
     * Simple method to simulate the drawing of a card from the Sorry deck {@link #gameDeck}
     */
    public Card drawCard(){
        Random random = new Random();
        int drawIndex = random.nextInt(this.gameDeck.size());
        Card drawnCard = this.gameDeck.get(drawIndex);
        //System.out.println("You have drawn a " + drawnCard.getCardValue());
        //System.out.println(drawnCard.getCardValue().getCardMethod());

        //update instance variables
        this.gameDeck.remove(drawnCard);
        this.gameDeckHashMap.remove(drawnCard.getCardValue());
        this.gameDiscardPile.add(drawnCard);

        //check if deck is empty after drawn to replace with discard pile
        if (this.gameDeck.isEmpty()) {
            Iterator<Card> iterator = this.gameDiscardPile.iterator();

            while (iterator.hasNext()) {
                Card card = iterator.next();
                this.gameDeck.add(card);
                iterator.remove(); // Safe removal using iterator's remove() method
            }
        }
        return drawnCard;
    }

    /**
     * method to initialize {@link #gameDeckHashMap} with the correct number of {@link Card} objects
     */
    private void initGameDeckHashMap(){
        for(Card card: this.gameDeck){
            if(this.gameDeckHashMap.containsKey(card.getCardValue())) { //card value is already in hashmap
                this.gameDeckHashMap.put(card.getCardValue(),
                        this.gameDeckHashMap.get(card.getCardValue())+1);
            }
            else{ //card value is not in hashmap yet
                this.gameDeckHashMap.put(card.getCardValue(), 1);
            }
        }
    }

    /**
     * String representation of the {@link Deck} class
     * @return string with each {@link Card} object in {@link #gameDeck}
     */
    public String toString(){
        String s = "Value     Frequency\n";
        for(Map.Entry<CardValue, Integer> entry: this.gameDeckHashMap.entrySet()){
            s += String.format("%-10s%d%n",entry.getKey(), entry.getValue());
        }
        return s;
    }

    /**
     * @return number of cards in {@link #gameDeck}
     */
    public int getDeckCount(){
        return this.gameDeck.size();
    }

    /**
     * @return number of cards in {@link #gameDiscardPile}
     */
    public int getDiscardCount(){
        return this.gameDiscardPile.size();
    }
}