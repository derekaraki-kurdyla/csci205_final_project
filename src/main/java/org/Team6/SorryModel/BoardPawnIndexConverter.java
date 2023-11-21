/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla
 * Section: 9am-10am
 * Date: 11/18/23
 * Time: 2:23 PM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: BoardPawnIndexConverter
 *
 * Description:
 *
 * ****************************************
 */
package org.Team6.SorryModel;

public interface BoardPawnIndexConverter {

    public abstract int convertToBoardIndex(int index);

    public abstract int convertToColorIndex(int index);
}
