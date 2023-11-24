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
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

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
    private Rectangle space1;

    @FXML
    private Rectangle space10;

    @FXML
    private Rectangle space11;

    @FXML
    private Rectangle space12;

    @FXML
    private Rectangle space13;

    @FXML
    private Rectangle space14;

    @FXML
    private Rectangle space15;

    @FXML
    private Rectangle space16;

    @FXML
    private Rectangle space17;

    @FXML
    private Rectangle space18;

    @FXML
    private Rectangle space19;

    @FXML
    private Rectangle space2;

    @FXML
    private Rectangle space20;

    @FXML
    private Rectangle space21;

    @FXML
    private Rectangle space22;

    @FXML
    private Rectangle space23;

    @FXML
    private Rectangle space24;

    @FXML
    private Rectangle space25;

    @FXML
    private Rectangle space26;

    @FXML
    private Rectangle space27;

    @FXML
    private Rectangle space28;

    @FXML
    private Rectangle space29;

    @FXML
    private Rectangle space3;

    @FXML
    private Rectangle space30;

    @FXML
    private Rectangle space31;

    @FXML
    private Rectangle space32;

    @FXML
    private Rectangle space33;

    @FXML
    private Rectangle space34;

    @FXML
    private Rectangle space35;

    @FXML
    private Rectangle space36;

    @FXML
    private Rectangle space37;

    @FXML
    private Rectangle space38;

    @FXML
    private Rectangle space39;

    @FXML
    private Rectangle space4;

    @FXML
    private Rectangle space40;

    @FXML
    private Rectangle space41;

    @FXML
    private Rectangle space42;

    @FXML
    private Rectangle space43;

    @FXML
    private Rectangle space44;

    @FXML
    private Rectangle space45;

    @FXML
    private Rectangle space46;

    @FXML
    private Rectangle space47;

    @FXML
    private Rectangle space48;

    @FXML
    private Rectangle space49;

    @FXML
    private Rectangle space5;

    @FXML
    private Rectangle space50;

    @FXML
    private Rectangle space51;

    @FXML
    private Rectangle space52;

    @FXML
    private Rectangle space53;

    @FXML
    private Rectangle space54;

    @FXML
    private Rectangle space55;

    @FXML
    private Rectangle space56;

    @FXML
    private Rectangle space57;

    @FXML
    private Rectangle space58;

    @FXML
    private Rectangle space59;

    @FXML
    private Rectangle space6;

    @FXML
    private Rectangle space60;

    @FXML
    private Rectangle space61;

    @FXML
    private Rectangle space62;

    @FXML
    private Rectangle space63;

    @FXML
    private Rectangle space64;

    @FXML
    private Rectangle space65;

    @FXML
    private Circle space66;

    @FXML
    private Rectangle space67;

    @FXML
    private Rectangle space68;

    @FXML
    private Rectangle space69;

    @FXML
    private Rectangle space7;

    @FXML
    private Rectangle space70;

    @FXML
    private Rectangle space71;

    @FXML
    private Circle space72;

    @FXML
    private Rectangle space73;

    @FXML
    private Rectangle space74;

    @FXML
    private Rectangle space75;

    @FXML
    private Rectangle space76;

    @FXML
    private Rectangle space77;

    @FXML
    private Circle space78;

    @FXML
    private Rectangle space79;

    @FXML
    private Rectangle space8;

    @FXML
    private Rectangle space80;

    @FXML
    private Rectangle space81;

    @FXML
    private Rectangle space82;

    @FXML
    private Rectangle space83;

    @FXML
    private Circle space84;

    @FXML
    private Rectangle space9;

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
        assert space1 != null : "fx:id=\"space1\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space10 != null : "fx:id=\"space10\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space11 != null : "fx:id=\"space11\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space12 != null : "fx:id=\"space12\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space13 != null : "fx:id=\"space13\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space14 != null : "fx:id=\"space14\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space15 != null : "fx:id=\"space15\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space16 != null : "fx:id=\"space16\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space17 != null : "fx:id=\"space17\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space18 != null : "fx:id=\"space18\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space19 != null : "fx:id=\"space19\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space2 != null : "fx:id=\"space2\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space20 != null : "fx:id=\"space20\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space21 != null : "fx:id=\"space21\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space22 != null : "fx:id=\"space22\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space23 != null : "fx:id=\"space23\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space24 != null : "fx:id=\"space24\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space25 != null : "fx:id=\"space25\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space26 != null : "fx:id=\"space26\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space27 != null : "fx:id=\"space27\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space28 != null : "fx:id=\"space28\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space29 != null : "fx:id=\"space29\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space3 != null : "fx:id=\"space3\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space30 != null : "fx:id=\"space30\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space31 != null : "fx:id=\"space31\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space32 != null : "fx:id=\"space32\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space33 != null : "fx:id=\"space33\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space34 != null : "fx:id=\"space34\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space35 != null : "fx:id=\"space35\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space36 != null : "fx:id=\"space36\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space37 != null : "fx:id=\"space37\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space38 != null : "fx:id=\"space38\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space39 != null : "fx:id=\"space39\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space4 != null : "fx:id=\"space4\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space40 != null : "fx:id=\"space40\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space41 != null : "fx:id=\"space41\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space42 != null : "fx:id=\"space42\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space43 != null : "fx:id=\"space43\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space44 != null : "fx:id=\"space44\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space45 != null : "fx:id=\"space45\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space46 != null : "fx:id=\"space46\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space47 != null : "fx:id=\"space47\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space48 != null : "fx:id=\"space48\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space49 != null : "fx:id=\"space49\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space5 != null : "fx:id=\"space5\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space50 != null : "fx:id=\"space50\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space51 != null : "fx:id=\"space51\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space52 != null : "fx:id=\"space52\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space53 != null : "fx:id=\"space53\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space54 != null : "fx:id=\"space54\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space55 != null : "fx:id=\"space55\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space56 != null : "fx:id=\"space56\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space57 != null : "fx:id=\"space57\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space58 != null : "fx:id=\"space58\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space59 != null : "fx:id=\"space59\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space6 != null : "fx:id=\"space6\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space60 != null : "fx:id=\"space60\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space61 != null : "fx:id=\"space61\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space62 != null : "fx:id=\"space62\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space63 != null : "fx:id=\"space63\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space64 != null : "fx:id=\"space64\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space65 != null : "fx:id=\"space65\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space66 != null : "fx:id=\"space66\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space67 != null : "fx:id=\"space67\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space68 != null : "fx:id=\"space68\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space69 != null : "fx:id=\"space69\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space7 != null : "fx:id=\"space7\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space70 != null : "fx:id=\"space70\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space71 != null : "fx:id=\"space71\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space72 != null : "fx:id=\"space72\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space73 != null : "fx:id=\"space73\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space74 != null : "fx:id=\"space74\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space75 != null : "fx:id=\"space75\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space76 != null : "fx:id=\"space76\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space77 != null : "fx:id=\"space77\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space78 != null : "fx:id=\"space78\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space79 != null : "fx:id=\"space79\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space8 != null : "fx:id=\"space8\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space80 != null : "fx:id=\"space80\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space81 != null : "fx:id=\"space81\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space82 != null : "fx:id=\"space82\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space83 != null : "fx:id=\"space83\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space84 != null : "fx:id=\"space84\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert space9 != null : "fx:id=\"space9\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert yellowPawn1 != null : "fx:id=\"yellowPawn1\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert yellowPawn2 != null : "fx:id=\"yellowPawn2\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert yellowPawn3 != null : "fx:id=\"yellowPawn3\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert yellowPawn4 != null : "fx:id=\"yellowPawn4\" was not injected: check your FXML file 'BoardView.fxml'.";

        initEventHandlers();
        initBindings();
    }

    private void initEventHandlers() {
        // MOVE BLUE PAWN FROM START
        //Get X and Y coords for both the space and the pawn
        double x = space20.getBoundsInParent().getCenterX();
        double y = space20.getBoundsInParent().getCenterY();
        double x2 = bluePawn1.getLayoutX();
        double y2 = bluePawn1.getLayoutY();

        // Calculate the difference and set the center
        double x3 = x - x2;
        double y3 = y - y2;
        bluePawn1.setCenterX(x3);
        bluePawn1.setCenterY(y3);

        // Move 3 spaces
        double x4 = space21.getBoundsInParent().getCenterX();
        double y4 = space21.getBoundsInParent().getCenterY();
        double x5 = bluePawn1.getLayoutX();
        double y5 = bluePawn1.getLayoutY();
        double x6 = x4 - x5;
        double y6 = y4 - y5;
        bluePawn1.setCenterX(x6);
        bluePawn1.setCenterY(y6);

    }

    private void initBindings() {
    }
}

