package org.Team6.SorryModel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlueConverterTest {

    private BlueConverter converter;

    @BeforeEach
    void setUp() {
        BlueConverter blueConverter = new BlueConverter();
        this.converter = blueConverter;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void convertToBoardIndex() {
        //test for home indices
        assertTrue(this.converter.convertToBoardIndex(66) == 72);

        //test for normal indices
        assertTrue(this.converter.convertToBoardIndex(10) == 28);
    }

    @Test
    void convertToColorIndex() {
        //test for home indices
        assertTrue(this.converter.convertToColorIndex(72) == 66);

        //test for normal indices
        assertTrue(this.converter.convertToColorIndex(28) == 10);
    }
}