package org.Team6.SorryModel;

import static org.junit.jupiter.api.Assertions.*;

class CardValueTest {
    @org.junit.jupiter.api.Test
    void getCardMethod() {
        Card card = new Card(CardValue.ONE);
        assertTrue(card.getCardValue().getCardMethod().equals("Move from Start, or move forward one space."));
    }
}