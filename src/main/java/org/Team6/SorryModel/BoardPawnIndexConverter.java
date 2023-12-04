/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla, Alex Araki-Kurdyla, Nathan Stamford, Leo McMenimen
 * Section: 9am-10am
 * Date: 11/18/23
 * Time: 2:23 PM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: BoardPawnIndexConverter
 *
 * Description: An interface that we used to convert the individual color views
 * to the universal board index.
 *
 * ****************************************
 */
package org.Team6.SorryModel;

/**
 * An interface that we used to convert the individual color views
 * to the universal board index.
 */
public interface BoardPawnIndexConverter {

    /**
     * Convert a color index to a board index
     * @param index - index of a pawn or space before conversion
     * @return the converted index
     */
    public abstract int convertToBoardIndex(int index);

    /**
     * Convert a board index to a color index
     * @param index - index of a pawn or space before conversion
     * @return the converted index
     */
    public abstract int convertToColorIndex(int index);
}
