/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla, Alex Araki-Kurdyla, Nathan Stamford, Leo McMenimen
 * Section: 9am-10am
 * Date: 11/29/23
 * Time: 5:50 PM
 *
 * Project: csci205_final_project
 * Package: org.Team6
 * Class: SorryView
 *
 * Description: The View for our Sorry! game. The FXML file is in our resources folder
 *
 * ****************************************
 */
package org.Team6;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.Team6.SorryModel.GameManager;
import java.io.IOException;

/**
 * This class will take care of creating the visual aspect of our code
 */
public class SorryView {
    private GameManager theModel;

    public SorryView(GameManager model) {
        this.theModel = model;
    }

    public Parent initializeView() {
        try {
            // Get FXML from resources folder
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/RoughSorryBoard/BoardView.fxml"));

            SorryController controller = new SorryController(this.theModel, this);
            loader.setController(controller);
            return loader.load();
        }

        // Handle IOExceptions
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
