package org.Team6.SorryModel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    private Deck deck;
    @BeforeEach
    void setUp() {
        this.deck = new Deck();
    }

    @Test
    void drawCard() {
        assertEquals(45, this.deck.getDeckCount());
        assertEquals(0, this.deck.getDiscardCount());
        Card drawnCard = this.deck.drawCard();
        assert(drawnCard != null);
        assertEquals(44, this.deck.getDeckCount());
        assertEquals(1, this.deck.getDiscardCount());
    }
}