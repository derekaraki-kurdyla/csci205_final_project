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
 * The class will be used to change how the individual color views the board
 * and convert it to the way the board is created on scenebuilder
 *
 * ****************************************
 */
package org.Team6.SorryModel;

/**
 * The class will be used to change how the individual color views the board
 * and convert it to the way the board is created on scenebuilder
 */
public class BlueConverter implements BoardPawnIndexConverter{

    //This will add to the index of the spaces that are out of order from the Color then to the Board index
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

    //This will add or subtract to the index of spaces that are ou tof order from the Board then to the color index
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
