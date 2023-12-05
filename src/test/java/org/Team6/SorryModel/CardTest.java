package org.Team6.SorryModel;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @org.junit.jupiter.api.Test
    void getCardValue() {
        Card card = new Card(CardValue.ONE);
        assertTrue(card.getCardValue().equals(CardValue.ONE));
    }
}