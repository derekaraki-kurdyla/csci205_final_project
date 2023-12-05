/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla, Alex Araki-Kurdyla, Nathan Stamford, Leo McMenimen
 * Section: 9am-10am
 * Date: 11/19/23
 * Time: 11:50 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: GreenConverter
 *
 * Description:
 * This is to test our GreenConverter class
 *
 * The GreenConverterTest class will be used to change how the individual color views the board
 * and convert it to the way the board is created on scenebuilder
 *
 * ****************************************
 */

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