/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla
 * Section: 9am-10am
 * Date: 11/19/23
 * Time: 11:50 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: YellowConverter
 *
 * Description:
 *
 * ****************************************
 */
package org.Team6.SorryModel;

public class YellowConverter implements BoardPawnIndexConverter{

    public int convertToBoardIndex(int index){
        if(index >= 61 && index <= 66){
            return index + 12;
        }
        else if(index >= 1 && index <= 27){
            return index + 33;
        }
        else{ //(index >= 28 && index <= 60)
            return index - 27;
        }
    }

    public int convertToColorIndex(int index){
        if(index >= 73 && index <= 78){
            return index - 12;
        }
        else if(index >= 34 && index <= 60){
            return index - 33;
        }
        else{ //(index >= 1 && index <= 33)
            return index + 27;
        }
    }

}
