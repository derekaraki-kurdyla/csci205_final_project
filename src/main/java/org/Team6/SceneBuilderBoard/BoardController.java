/* *****************************************
 * CSCI 205 - Software Engineering and Design
 * Fall 2023
 * Instructor: Prof. Brian King / Prof. Joshua Stough
 *
 * Name: Nathan Stamford
 * Section: 02 - 10am
 * Date: 11/17/2023
 * Time: 10:13 AM
 *
 * Project: csci205_final_project
 * Package: org.Team6.SceneBuilderBoard
 * Class: BoardController
 *
 * Description:
 *
 * ****************************************
 */
package org.Team6.SceneBuilderBoard;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BoardController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Circle bluePawn1;

    @FXML
    private Circle bluePawn2;

    @FXML
    private Circle bluePawn3;

    @FXML
    private Circle bluePawn4;

    @FXML
    private Circle greenPawn1;

    @FXML
    private Circle greenPawn2;

    @FXML
    private Circle greenPawn3;

    @FXML
    private Circle greenPawn4;

    @FXML
    private Circle redPawn1;

    @FXML
    private Circle redPawn2;

    @FXML
    private Circle redPawn3;

    @FXML
    private Circle redPawn4;

    @FXML
    private Circle yellowPawn1;

    @FXML
    private Circle yellowPawn2;

    @FXML
    private Circle yellowPawn3;

    @FXML
    private Circle yellowPawn4;

    @FXML
    void initialize() {
        assert bluePawn1 != null : "fx:id=\"bluePawn1\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert bluePawn2 != null : "fx:id=\"bluePawn2\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert bluePawn3 != null : "fx:id=\"bluePawn3\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert bluePawn4 != null : "fx:id=\"bluePawn4\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert greenPawn1 != null : "fx:id=\"greenPawn1\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert greenPawn2 != null : "fx:id=\"greenPawn2\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert greenPawn3 != null : "fx:id=\"greenPawn3\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert greenPawn4 != null : "fx:id=\"greenPawn4\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert redPawn1 != null : "fx:id=\"redPawn1\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert redPawn2 != null : "fx:id=\"redPawn2\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert redPawn3 != null : "fx:id=\"redPawn3\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert redPawn4 != null : "fx:id=\"redPawn4\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert yellowPawn1 != null : "fx:id=\"yellowPawn1\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert yellowPawn2 != null : "fx:id=\"yellowPawn2\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert yellowPawn3 != null : "fx:id=\"yellowPawn3\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert yellowPawn4 != null : "fx:id=\"yellowPawn4\" was not injected: check your FXML file 'BoardView.fxml'.";

        initBindings();
        initEventHandlers();
    }

    private void initEventHandlers() {
        
    }

    private void initBindings() {

    }

}

