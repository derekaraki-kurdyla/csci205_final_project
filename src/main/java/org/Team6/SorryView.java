/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla
 * Section: 9am-10am
 * Date: 11/29/23
 * Time: 5:50 PM
 *
 * Project: csci205_final_project
 * Package: org.Team6
 * Class: SorryView
 *
 * Description:
 *
 * ****************************************
 */
package org.Team6;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import org.Team6.SorryModel.GameManager;
import java.io.IOException;

public class SorryView {
    private GameManager theModel;

    public SorryView(GameManager model) {
        this.theModel = model;
    }

    public Parent initializeView() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/RoughSorryBoard/BoardView.fxml"));
            System.out.println("initialize view");
            SorryController controller = new SorryController(this.theModel, this);
            loader.setController(controller);
            return loader.load();
        }
        catch (IOException e) {
            e.printStackTrace();
            // Handle exception appropriately
            return null;
        }
    }
}
