package org.Team6.SorryModel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YellowConverterTest {

    private YellowConverter converter;

    @BeforeEach
    void setUp() {
        YellowConverter yellowConverter = new YellowConverter();
        this.converter = yellowConverter;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void convertToBoardIndex() {
        //test for home indices
        assertTrue(this.converter.convertToBoardIndex(66) == 78);

        //test for normal indices
        assertTrue(this.converter.convertToBoardIndex(10) == 43);
    }

    @Test
    void convertToColorIndex() {
        //test for home indices
        assertTrue(this.converter.convertToColorIndex(78) == 66);

        //test for normal indices
        assertTrue(this.converter.convertToColorIndex(43) == 10);
    }

}