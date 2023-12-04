/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla, Alex Araki-Kurdyla, Nathan Stamford, Leo McMenimen
 * Section: 9am-10am
 * Date: 11/19/23
 * Time: 11:49 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: BlueConverter
 *
 * Description:
 *
 * ****************************************
 */
package org.Team6.SorryModel;

/**
 * This code will convert to the Board Index as needed for the code
 */
public class BlueConverter implements BoardPawnIndexConverter{

    public int convertToBoardIndex(int index){
        if(index >= 61 && index <= 66){
            return index + 6;
        }
        else if(index >= 1 && index <= 42){
            return index + 18;
        }
        else{ //(index >= 43 && index <= 60)
            return index - 42;
        }
    }

    public int convertToColorIndex(int index){
        if(index >= 67 && index <= 72){
            return index - 6;
        }
        else if(index >= 19 && index <= 60){
            return index - 18;
        }
        else{ //(index >= 1 && index <= 18)
            return index + 42;
        }
    }

}
