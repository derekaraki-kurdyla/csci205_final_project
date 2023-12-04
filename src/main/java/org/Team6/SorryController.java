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
 * Class: SorryController
 *
 * Description: This is the Controller Class for our Sorry! program.
 *
 * ****************************************
 */
package org.Team6;


import java.net.URL;
import java.util.ArrayList;
import java.util.Formattable;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import org.Team6.SorryModel.*;

public class SorryController {

    /** The {@link GameManager}  object that will be the logic and the Model */
    private GameManager theModel;

    /** The {@link SorryView}  object that will be used as the View */
    private SorryView theView;

    /**
     * These are all the spaces and pawns we use
     * There are 84 spaces total. The four homes are {@link Circle} objects,
     * while the rest of them are {@link Rectangle} objects.
     */

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
    private Circle blueStart;
    @FXML
    private Circle greenStart;
    @FXML
    private Circle redStart;
    @FXML
    private Circle yellowStart;

    /** The Buttons we used */
    @FXML
    private Button startButton;
    @FXML
    private Button drawButton;
    @FXML
    private Button moveButton;

    /** The RadioButtons we used */
    @FXML
    private RadioButton blueRadioButton;
    @FXML
    private RadioButton greenRadioButton;
    @FXML
    private RadioButton redRadioButton;
    @FXML
    private RadioButton yellowRadioButton;

    /** SimpleBooleanProperties that we used */
    private SimpleBooleanProperty isSetForRed;
    private SimpleBooleanProperty isSetForBlue;
    private SimpleBooleanProperty isSetForGreen;
    private SimpleBooleanProperty isSetForYellow;

    /** Text and Labels we used*/
    @FXML
    private Text cardDrawnText;
    @FXML
    private Text cardRuleText;
    @FXML
    private Label discardLabel;
    @FXML
    private Text turnText;
    @FXML
    private Text movesText;


    /** Some ArrayLists that store Pawns and Spaces*/
    private ArrayList<Circle> pawnList = new ArrayList<>();
    private ArrayList<Rectangle> spacesList = new ArrayList<>();
    private ArrayList<Circle> homeList = new ArrayList<>();


    /** Other objects that are useful to store */
    private Card lastCardDrawn;
    private Circle pawnSelected;


    public SorryController(GameManager model, SorryView view) {
        this.theModel = model;
        this.theView = view;
        System.out.println("constructor correct!");
        System.out.println(this.theModel.getPlayerArrayList());
        // You can perform additional setup here if needed
    }


    public void setModel(GameManager model) {
        this.theModel = model;
    }

    @FXML
    void initialize() {
        // Assert that all FXML objects are accounted for
        assertFMXLObjects();

        // Create the SimpleBooleanProperties
        initSBPs();

        // Create the PawnList
        initPawnList();

        // Create the SpacesList
        initSpacesList();

        // Creates the Home List
        initHomeList();

        // Creates all the Event Handlers
        initEventHandlers();

    }

    private void initSBPs() {
        this.isSetForRed = new SimpleBooleanProperty(false);
        this.isSetForBlue = new SimpleBooleanProperty(false);
        this.isSetForGreen = new SimpleBooleanProperty(false);
        this.isSetForYellow = new SimpleBooleanProperty(false);
    }
    private void assertFMXLObjects() {
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
        assert startButton != null : "fx:id=\"startButton\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert blueRadioButton != null : "fx:id=\"blueRadioButton\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert greenRadioButton != null : "fx:id=\"greenRadioButton\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert redRadioButton != null : "fx:id=\"redRadioButton\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert yellowRadioButton != null : "fx:id=\"yellowRadioButton\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert cardDrawnText != null : "fx:id=\"cardDrawnText\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert cardRuleText != null : "fx:id=\"cardRuleText\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert discardLabel != null : "fx:id=\"discardLabel\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert drawButton != null : "fx:id=\"drawButton\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert turnText != null : "fx:id=\"turnText\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert movesText != null : "fx:id=\"movesText\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert moveButton != null : "fx:id=\"moveButton\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert blueStart != null : "fx:id=\"blueStart\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert greenStart != null : "fx:id=\"greenStart\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert redStart != null : "fx:id=\"redStart\" was not injected: check your FXML file 'BoardView.fxml'.";
        assert yellowStart != null : "fx:id=\"yellowStart\" was not injected: check your FXML file 'BoardView.fxml'.";
    }
    private void initHomeList() {
        this.homeList.add(space66);
        this.homeList.add(space72);
        this.homeList.add(space78);
        this.homeList.add(space84);
    }
    private void initSpacesList() {
        this.spacesList.add(space1);
        this.spacesList.add(space2);
        this.spacesList.add(space3);
        this.spacesList.add(space4);
        this.spacesList.add(space5);
        this.spacesList.add(space6);
        this.spacesList.add(space7);
        this.spacesList.add(space8);
        this.spacesList.add(space9);
        this.spacesList.add(space10);
        this.spacesList.add(space11);
        this.spacesList.add(space12);
        this.spacesList.add(space13);
        this.spacesList.add(space14);
        this.spacesList.add(space15);
        this.spacesList.add(space16);
        this.spacesList.add(space17);
        this.spacesList.add(space18);
        this.spacesList.add(space19);
        this.spacesList.add(space20);
        this.spacesList.add(space21);
        this.spacesList.add(space22);
        this.spacesList.add(space23);
        this.spacesList.add(space24);
        this.spacesList.add(space25);
        this.spacesList.add(space26);
        this.spacesList.add(space27);
        this.spacesList.add(space28);
        this.spacesList.add(space29);
        this.spacesList.add(space30);
        this.spacesList.add(space31);
        this.spacesList.add(space32);
        this.spacesList.add(space33);
        this.spacesList.add(space34);
        this.spacesList.add(space35);
        this.spacesList.add(space36);
        this.spacesList.add(space37);
        this.spacesList.add(space38);
        this.spacesList.add(space39);
        this.spacesList.add(space40);
        this.spacesList.add(space41);
        this.spacesList.add(space42);
        this.spacesList.add(space43);
        this.spacesList.add(space44);
        this.spacesList.add(space45);
        this.spacesList.add(space46);
        this.spacesList.add(space47);
        this.spacesList.add(space48);
        this.spacesList.add(space49);
        this.spacesList.add(space50);
        this.spacesList.add(space51);
        this.spacesList.add(space52);
        this.spacesList.add(space53);
        this.spacesList.add(space54);
        this.spacesList.add(space55);
        this.spacesList.add(space56);
        this.spacesList.add(space57);
        this.spacesList.add(space58);
        this.spacesList.add(space59);
        this.spacesList.add(space60);
        this.spacesList.add(space61);
        this.spacesList.add(space62);
        this.spacesList.add(space63);
        this.spacesList.add(space64);
        this.spacesList.add(space65);
        this.spacesList.add(space67);
        this.spacesList.add(space68);
        this.spacesList.add(space69);
        this.spacesList.add(space70);
        this.spacesList.add(space71);
        this.spacesList.add(space73);
        this.spacesList.add(space74);
        this.spacesList.add(space75);
        this.spacesList.add(space76);
        this.spacesList.add(space77);
        this.spacesList.add(space79);
        this.spacesList.add(space80);
        this.spacesList.add(space81);
        this.spacesList.add(space82);
        this.spacesList.add(space83);



    }
    private void initPawnList() {
        pawnList.add(bluePawn1);
        pawnList.add(bluePawn2);
        pawnList.add(bluePawn3);
        pawnList.add(bluePawn4);
        pawnList.add(redPawn1);
        pawnList.add(redPawn2);
        pawnList.add(redPawn3);
        pawnList.add(redPawn4);
        pawnList.add(greenPawn1);
        pawnList.add(greenPawn2);
        pawnList.add(greenPawn3);
        pawnList.add(greenPawn4);
        pawnList.add(yellowPawn1);
        pawnList.add(yellowPawn2);
        pawnList.add(yellowPawn3);
        pawnList.add(yellowPawn4);
    }

    private void initEventHandlers() {

        //press the draw button:
        // draw card, and set lastcarddrawn to it
        // find possible pawn moves for the current player
        // if its a 2, do nothing
        // if its not a 2, increment current player

        //logic is, if there is no possible pawn moves, you want to increment to next player in draw
        // but if there are possible pawn moves, you don't want to increment to next player in draw because
        // then you will increment the player before you move for that player, so you will move the pawn for the next player
        // so if no possible pawn moves, you want to increment next player in draw
        // but if there are, increment next player in move function unless the card is a two

        drawButton.setOnMouseClicked(event -> {drawButtonHandleEvent();});
        moveButton.setOnMouseClicked(event -> {moveButtonHandleEvent();});
        startButton.setOnMouseClicked(event -> {startButtonHandleEvent();});

        bluePawnHighlight();
        redPawnHighlight();
        greenPawnHighlight();
        yellowPawnHighlight();

        redRadioButton.setOnMouseClicked(event -> {redIndicateSelected();});
        blueRadioButton.setOnMouseClicked(event -> {blueIndicateSelected();});
        greenRadioButton.setOnMouseClicked(event -> {greenIndicateSelected();});
        yellowRadioButton.setOnMouseClicked(event -> {yellowIndicateSelected();});

    }

    private void yellowIndicateSelected() {
        if (!isIsSetForYellow()){
            yellowPawn1.setFill(Color.LIGHTYELLOW);
            yellowPawn2.setFill(Color.LIGHTYELLOW);
            yellowPawn3.setFill(Color.LIGHTYELLOW);
            yellowPawn4.setFill(Color.LIGHTYELLOW);
            isSetForYellow.setValue(true);
        }
        else if (isIsSetForYellow()){
            yellowPawn1.setFill(Color.web("#edff1f"));
            yellowPawn2.setFill(Color.web("#edff1f"));
            yellowPawn3.setFill(Color.web("#edff1f"));
            yellowPawn4.setFill(Color.web("#edff1f"));
            isSetForYellow.setValue(false);
        }
    }
    private void greenIndicateSelected() {
        if (!isIsSetForGreen()){
            greenPawn1.setFill(Color.GREENYELLOW);
            greenPawn2.setFill(Color.GREENYELLOW);
            greenPawn3.setFill(Color.GREENYELLOW);
            greenPawn4.setFill(Color.GREENYELLOW);
            isSetForGreen.setValue(true);
        }
        else if (isIsSetForGreen()){
            greenPawn1.setFill(Color.web("#26ff00"));
            greenPawn2.setFill(Color.web("#26ff00"));
            greenPawn3.setFill(Color.web("#26ff00"));
            greenPawn4.setFill(Color.web("#26ff00"));
            isSetForGreen.setValue(false);
        }
    }
    private void blueIndicateSelected() {
        if (!isIsSetForBlue()){
            bluePawn1.setFill(Color.AQUA);
            bluePawn2.setFill(Color.AQUA);
            bluePawn3.setFill(Color.AQUA);
            bluePawn4.setFill(Color.AQUA);
            isSetForBlue.setValue(true);
        }
        else if (isIsSetForBlue()){
            bluePawn1.setFill(Color.DODGERBLUE);
            bluePawn2.setFill(Color.DODGERBLUE);
            bluePawn3.setFill(Color.DODGERBLUE);
            bluePawn4.setFill(Color.DODGERBLUE);
            isSetForBlue.setValue(false);
        }
    }
    private void redIndicateSelected() {
        if (!isIsSetForRed()){
            redPawn1.setFill(Color.PINK);
            redPawn2.setFill(Color.PINK);
            redPawn3.setFill(Color.PINK);
            redPawn4.setFill(Color.PINK);
            isSetForRed.setValue(true);
        }
        else if (isIsSetForRed()){
            redPawn1.setFill(Color.web("#ff1f1f"));
            redPawn2.setFill(Color.web("#ff1f1f"));
            redPawn3.setFill(Color.web("#ff1f1f"));
            redPawn4.setFill(Color.web("#ff1f1f"));
            isSetForRed.setValue(false);
        }
    }

    private void yellowPawnHighlight() {
        for (int i = 12; i < 16; i++) {
            Circle pawn = pawnList.get(i);
            pawn.setOnMouseEntered(event -> {
                pawn.setFill(Color.LIGHTYELLOW);
            });
            pawn.setOnMouseExited(event -> {
                pawn.setFill(Color.web("#edff1f"));
            });
        }
    }
    private void greenPawnHighlight() {
        for (int i = 8; i < 12; i++) {
            Circle pawn = pawnList.get(i);
            pawn.setOnMouseEntered(event -> {
                pawn.setFill(Color.GREENYELLOW);
            });
            pawn.setOnMouseExited(event -> {
                pawn.setFill(Color.web("#26ff00"));
            });
        }
    }
    private void redPawnHighlight() {
        for (int i = 4; i < 8 ; i++) {
            Circle pawn = pawnList.get(i);
            pawn.setOnMouseEntered(event -> {
                pawn.setFill(Color.PINK);
            });
            pawn.setOnMouseExited(event -> {
                pawn.setFill(Color.web("#ff1f1f"));
            });

        }
    }
    private void bluePawnHighlight() {
        for (int i = 0; i < 4; i++) {
            Circle pawn = pawnList.get(i);
            pawn.setOnMouseEntered(event -> {
                pawn.setFill(Color.AQUA);
            });
            pawn.setOnMouseExited(event -> {
                pawn.setFill(Color.DODGERBLUE);
            });
        }
    }


    private void startButtonHandleEvent() {

        int playerCount = getPlayerCount();
        this.theModel.setNumPlayers(playerCount);
        this.theModel.initBoardAndDeck();
        this.theModel.setCurrPlayer(this.theModel.getPlayerArrayList().get(0));

        turnText.setText("Please draw a card!");

        setPawnToOgColors();
        setPawnEventHandlers();
    }

    private void setPawnEventHandlers() {
        for (Circle BoardPawn : pawnList){
            String pawnId = BoardPawn.getId();
            for(Pawn pawn: this.theModel.getGameBoard().getAllPawns()){
                if (pawn.getId().equals(pawnId)){
                    BoardPawn.setOnMouseClicked(event2 -> {
                        this.theModel.getCurrPlayer().setPawnToMove(pawn);
                        this.pawnSelected = BoardPawn;
                        this.pawnSelected.setFill(Color.BLACK);

                    });
                }
            }
        }
    }
    private void setPawnToOgColors() {
        redPawn1.setFill(Color.web("#ff1f1f"));
        redPawn2.setFill(Color.web("#ff1f1f"));
        redPawn3.setFill(Color.web("#ff1f1f"));
        redPawn4.setFill(Color.web("#ff1f1f"));
        bluePawn1.setFill(Color.DODGERBLUE);
        bluePawn2.setFill(Color.DODGERBLUE);
        bluePawn3.setFill(Color.DODGERBLUE);
        bluePawn4.setFill(Color.DODGERBLUE);
        greenPawn1.setFill(Color.web("#26ff00"));
        greenPawn2.setFill(Color.web("#26ff00"));
        greenPawn3.setFill(Color.web("#26ff00"));
        greenPawn4.setFill(Color.web("#26ff00"));
        yellowPawn1.setFill(Color.web("#edff1f"));
        yellowPawn2.setFill(Color.web("#edff1f"));
        yellowPawn3.setFill(Color.web("#edff1f"));
        yellowPawn4.setFill(Color.web("#edff1f"));
    }
    private int getPlayerCount() {
        int playerCount = 0;
        if (isIsSetForRed()){
            playerCount++;
            this.theModel.getPawnColors().add("red");
        }

        if (isIsSetForBlue()){
            playerCount++;
            this.theModel.getPawnColors().add("blue");
        }

        if (isIsSetForYellow()){
            playerCount++;
            this.theModel.getPawnColors().add("yellow");
        }

        if (isIsSetForGreen()){
            playerCount++;
            this.theModel.getPawnColors().add("green");
        }
        return playerCount;
    }

    private void moveButtonHandleEvent() {
        if(this.theModel.getCurrPlayer().getPawnToMove() != null) {
            this.theModel.getCurrPlayer().movePawn(this.lastCardDrawn.getCardValue()); //this moves this.pawnToMove
            int landingIndex = this.theModel.getCurrPlayer().getPawnToMove().getLandingIndex();
            String id = "space" + landingIndex;
            for (Rectangle space : spacesList) {
                if (id.equals(space.getId())) {
                    move(this.pawnSelected, space);
                    sendPawnsStartOnUI();
                    if(!this.theModel.getCurrPlayer().getListOfPawnsToMoveToStart().isEmpty())
                        this.theModel.getCurrPlayer().clearListOfPawnsToMoveToStart();
                }

            }
            for (Circle space : homeList) {
                if (id.equals(space.getId())) {
                    move(this.pawnSelected, space);
                    sendPawnsStartOnUI();
                    if(!this.theModel.getCurrPlayer().getListOfPawnsToMoveToStart().isEmpty())
                        this.theModel.getCurrPlayer().clearListOfPawnsToMoveToStart();
                }
            }

            //after you moved, now increment the current player unless its a two
            if(this.lastCardDrawn.getCardValue().equals(CardValue.TWO)) {
                //java fx to print this to screen
                turnText.setText("Draw Again! It is still " + this.theModel.getCurrPlayer().getPawnColor() + "'s turn.");
                cardRuleText.setText(null);
                cardDrawnText.setText(null);
                movesText.setText(null);
            }

            else{
                if(this.theModel.isGameOver()){
                    System.out.println("GAME OVER");
                }
                else{
                    int currIndex = this.theModel.getCurrPlayerIndex(); //current player index
                    this.theModel.setCurrPlayerIndex(currIndex + 1); //increment current player index

                    if(this.theModel.getCurrPlayerIndex() == this.theModel.getPlayerArrayList().size()) { //if incrementing it caused it to go out of bounds
                        System.out.println(this.theModel.getCurrPlayerIndex());
                        this.theModel.setCurrPlayerIndex(0);
                        this.theModel.setCurrPlayer(this.theModel.getPlayerArrayList().get(0)); //set currplayer to
                    }
                    else{
                        this.theModel.setCurrPlayer(this.theModel.getPlayerArrayList().get(this.theModel.getCurrPlayerIndex()));
                    }
                }
                turnText.setText("Next player draw!");
                cardRuleText.setText(null);
                cardDrawnText.setText(null);
                movesText.setText(null);
            }
        }
        else{
            turnText.setText("You cannot move a pawn this turn!");
        }
    }

    private void drawButtonHandleEvent() {
        this.theModel.getGameBoard().initSlideSpacesOnBoard(this.theModel.getCurrPlayer());

        System.out.println("It is " + this.theModel.getCurrPlayer().getPawnColor() + "'s turn.");
        //update UI
        turnText.setText("It is " + this.theModel.getCurrPlayer().getPawnColor() + "'s turn.");

        Card drawnCard = this.theModel.getGameDeck().drawCard();
        this.lastCardDrawn = drawnCard;

        this.theModel.setDrawnCard(drawnCard);
        //Update UI
        cardDrawnText.setText("You have drawn a " + this.theModel.getDrawnCard().getCardValue());
        cardRuleText.setText(this.theModel.getDrawnCard().getCardValue().getCardMethod());

        this.theModel.getCurrPlayer().findPossiblePawnMoves(theModel.getDrawnCard());

        if (this.theModel.getCurrPlayer().getPossiblePawnMoves().isEmpty()){

            this.theModel.getCurrPlayer().setPawnToMove(null);

            movesText.setText("No possible moves! Draw card for next turn!");

            //incrementing to the next player
            int currIndex = this.theModel.getCurrPlayerIndex(); //current player index
            this.theModel.setCurrPlayerIndex(currIndex + 1); //increment current player index

            if(this.theModel.getCurrPlayerIndex() == this.theModel.getPlayerArrayList().size()) { //if incrementing it caused it to go out of bounds
                System.out.println(this.theModel.getCurrPlayerIndex());
                this.theModel.setCurrPlayerIndex(0);
                this.theModel.setCurrPlayer(this.theModel.getPlayerArrayList().get(0)); //set currplayer to
            }
            else{
                this.theModel.setCurrPlayer(this.theModel.getPlayerArrayList().get(this.theModel.getCurrPlayerIndex()));
            }
        }
        else{
            movesText.setText(this.theModel.getCurrPlayer().getPossiblePawnMoves().size() + " possible moves! Please select a pawn!");
        }
    }

    private void sendPawnsStartOnUI() {
        System.out.println("REACHED CONTROLLER LOGIC HERE LINE 968");
        if (!this.theModel.getCurrPlayer().getListOfPawnsToMoveToStart().isEmpty()){
            System.out.println("reached here");
            for(Pawn pawn: this.theModel.getCurrPlayer().getListOfPawnsToMoveToStart()){
                System.out.println("reached here 2");
                for(Circle UIPawn: this.pawnList){
                    System.out.println("reached here 3");
                    if (pawn.getId().equals(UIPawn.getId())){ //we found the pawn to move on the UI
                        if(pawn.getColor().equals(PawnColor.RED)){
                            move(UIPawn, redStart);
                        }
                        if(pawn.getColor().equals(PawnColor.BLUE)){
                            move(UIPawn, blueStart);
                        }
                        if(pawn.getColor().equals(PawnColor.YELLOW)){
                            move(UIPawn, yellowStart);
                        }
                        if(pawn.getColor().equals(PawnColor.GREEN)){
                            move(UIPawn, greenStart);
                        }
                    }
                }
            }
        }
    }

    /**
     * Moves a pawn to a regular space (not home)
     * @param pawn - pawn to move
     * @param space - space to move to
     */
    public static void move(Circle pawn, Rectangle space){

        // Get position of the space
        double xSpace = space.getBoundsInParent().getCenterX();
        double ySpace = space.getBoundsInParent().getCenterY();

        // Get position of the pawn
        double xPawn = pawn.getLayoutX();
        double yPawn = pawn.getLayoutY();

        // Find the difference between them
        double xDiff = xSpace - xPawn;
        double yDiff = ySpace - yPawn;

        // Set the pawn to move the difference
        pawn.setCenterX(xDiff);
        pawn.setCenterY(yDiff);
    }

    /**
     * Move a pawn to home
     * @param pawn - pawn to move
     * @param home - home space
     */
    public static void move(Circle pawn, Circle home){
        // Get position of the space
        double xHome = home.getBoundsInParent().getCenterX();
        double yHome = home.getBoundsInParent().getCenterY();

        // Get position of the pawn
        double xPawn = pawn.getLayoutX();
        double yPawn = pawn.getLayoutY();

        // Find the difference between them
        double xDiff = xHome - xPawn;
        double yDiff = yHome - yPawn;

        // Set the pawn to move the difference
        pawn.setCenterX(xDiff);
        pawn.setCenterY(yDiff);
    }

    public boolean isIsSetForRed() {
        return isSetForRed.get();
    }

    public SimpleBooleanProperty isSetForRedProperty() {
        return isSetForRed;
    }

    public boolean isIsSetForBlue() {
        return isSetForBlue.get();
    }

    public SimpleBooleanProperty isSetForBlueProperty() {
        return isSetForBlue;
    }

    public boolean isIsSetForGreen() {
        return isSetForGreen.get();
    }

    public SimpleBooleanProperty isSetForGreenProperty() {
        return isSetForGreen;
    }

    public boolean isIsSetForYellow() {
        return isSetForYellow.get();
    }

    public SimpleBooleanProperty isSetForYellowProperty() {
        return isSetForYellow;
    }


}
