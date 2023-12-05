package org.Team6.SorryModel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreenConverterTest {

    private GreenConverter converter;

    @BeforeEach
    void setUp() {
        GreenConverter greenConverter = new GreenConverter();
        this.converter = greenConverter;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void convertToBoardIndex() {
        //test for home indices
        assertTrue(this.converter.convertToBoardIndex(66) == 84);

        //test for normal indices
        assertTrue(this.converter.convertToBoardIndex(10) == 58);
    }

    @Test
    void convertToColorIndex() {
        //test for home indices
        assertTrue(this.converter.convertToColorIndex(84) == 66);

        //test for normal indices
        assertTrue(this.converter.convertToColorIndex(58) == 10);
    }

}