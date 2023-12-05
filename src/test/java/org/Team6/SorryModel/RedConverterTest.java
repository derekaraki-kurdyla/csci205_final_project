package org.Team6.SorryModel;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RedConverterTest {

    private RedConverter converter;

    @BeforeEach
    void setUp() {
        RedConverter redConverter = new RedConverter();
        this.converter = redConverter;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void convertToBoardIndex() {
        //test for home indices
        assertTrue(this.converter.convertToBoardIndex(66) == 66);

        //test for normal indices
        assertTrue(this.converter.convertToBoardIndex(10) == 13);
    }

    @Test
    void convertToColorIndex() {
        //test for home indices
        assertTrue(this.converter.convertToColorIndex(66) == 66);

        //test for normal indices
        assertTrue(this.converter.convertToColorIndex(13) == 10);
    }
}