/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla
 * Section: 9am-10am
 * Date: 11/19/23
 * Time: 11:49 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: RedConverter
 *
 * Description:
 *
 * ****************************************
 */
package org.Team6.SorryModel;

public class RedConverter implements BoardPawnIndexConverter{

    public int convertToBoardIndex(int index){
        if(index >= 61 && index <= 66){
            return index;
        }
        else if(index >= 1 && index <= 57){
            return index + 3;
        }
        else{ //(index >= 58 && index <= 60)
            return index - 57;
        }
    }

    public int convertToColorIndex(int index){
        if(index >= 61 && index <= 66){
            return index;
        }
        else if(index >= 4 && index <= 60){
            return index - 3;
        }
        else{ //(index >= 1 && index <= 3)
            return index + 57;
        }
    }

}
