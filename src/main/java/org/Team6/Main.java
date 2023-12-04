/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Derek Araki-Kurdyla, Alex Araki-Kurdyla, Nathan Stamford, Leo McMenimen
 * Section: 9am-10am
 * Date: 11/9/23
 * Time: 10:30 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SorryModel
 * Class: Player
 *
 * Description: This is the main method for our Sorry. It has references to a
 * GameManager, SorryView, and SorryController object that represents a model, view,
 * and controller class respectively.
 *
 * ****************************************
 */
package org.Team6;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.Team6.SorryModel.Deck;
import org.Team6.SorryModel.GameManager;
import org.Team6.SorryModel.Player;

public class Main extends Application {

    private GameManager theModel;

    private SorryView theView;

    private SorryController theController;

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Load in the GameManager, SorryView, and SorryController objects
     * @throws Exception
     */
    @Override
    public void init() throws Exception {
        super.init();
        this.theModel = new GameManager();
        this.theView = new SorryView(this.theModel);
        this.theController = new SorryController(this.theModel, this.theView);
    }

    /**
     * Display the application
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) {

        Parent root = this.theView.initializeView();

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Sorry! Board Game");
        primaryStage.show();
    }
}