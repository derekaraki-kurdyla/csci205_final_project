/* *****************************************
 * CSCI205 - Software Engineering and Design
 * Fall 2023
 *
 * Author: Prof. King
 *
 * Name: Name: Derek Araki-Kurdyla, Alex Araki-Kurdyla, Nathan Stamford, Leo McMenimen
 * Date: 10/11/2023
 * Time: 9:30 PM

 * Project: csci205FinalProject
 * Class: RoughBoardFirstTry
 * Description: This was our first try at making the visuals for our Sorry! game.
 * The method we used was a needlessly complex, so we ended up switching to
 * SceneBuilder for our visuals instead.
 *
 * ****************************************
 */
package org.Team6.RoughBoard;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.swing.plaf.ColorUIResource;

public class RoughBoardFirstTry extends Application {

    /** The root node for our JavaFX App. The BorderPane reflect what a Sorry!
     * board looks like */
    private BorderPane root;

    /** This HBox would represent a container to hold the yellow pawns
     *  and the Start, Home, and Slide spaces */
    private HBox top;
    /** This HBox would represent a container to hold the red pawns
     *  and the Start, Home, and Slide spaces */
    private HBox bottom;
    /** This VBox would represent a container to hold the green pawns
     *  and the Start, Home, and Slide spaces */
    private VBox right;
    /** This VBox would represent a container to hold the blue pawns
     *  and the Start, Home, and Slide spaces */
    private VBox left;
    /** This BorderPane would hold the Sorry! label, and the discard and draw piles */
    private BorderPane center;
    /** A VBox to order everything in the center */
    private VBox cardPile;

    /** Labels for the piles and Sorry! text*/
    private Label drawPileLabel;
    private Label discardPileLabel;
    private Label sorryLbl;


    public static void main(String[] args) {
        launch(args);
    }

    /** The Start method to run our JavaFX application*/
    @Override
    public void start(Stage primaryStage) {
        root = new BorderPane();

        // Initialize the controls for the scene graph
        initSceneGraph(root);

        // Set up our scene and place the root of the scene graph on it
        Scene scene = new Scene(root, 775, 675);

        // Set scene on the stage
        primaryStage.setScene(scene);

        // Set the title for the main window
        primaryStage.setTitle("Sorry!");

        // Display the scene
        primaryStage.show();
    }

    /**
     * Create the SceneGraph
     * @param root - a BorderPane scene
     */
    private void initSceneGraph(BorderPane root) {
        // Create the containers
        top = new HBox();
        bottom = new HBox();
        right = new VBox();
        left = new VBox();
        center = new BorderPane();
        cardPile = new VBox();

        //Initialize everything
        initTop();
        initBottom();
        initRight();
        initLeft();
        initCenter();
        initRedStartGreenHome();
        initBlueStartRedHome();

        // Set the containers in the BorderPane root
        root.setTop(top);
        root.setBottom(bottom);
        root.setRight(right);
        root.setLeft(left);
        root.setCenter(center);

    }

    /**
     * Create the red Home and the blue Start spaces
     */
    private void initBlueStartRedHome() {
        // Create containers for the spaces
        HBox redHomeHBox = new HBox();
        VBox blueStartRedHome = new VBox();

        // Create some empty, invisible spaces for spacing
        for (int i = 0; i < 6; i++) {
            Label spacePadding = new Label();
            spacePadding.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.EMPTY)));
            spacePadding.setPrefSize(50, 20);
            blueStartRedHome.getChildren().add(spacePadding);
        }

        // Create the blue Home
        Circle blueHome = new Circle(42.5, Color.BLUE);
        blueStartRedHome.getChildren().add(blueHome);

        // More space
        for (int i = 0; i < 3; i++) {
            Label filler = new Label();
            filler.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.EMPTY)));
            filler.setPrefSize(45,55);
            blueStartRedHome.getChildren().add(filler);
        }

        // Create the red Home
        Label redHome = new Label("Home");
        redHome.setBorder(new Border(new BorderStroke(null,
                BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
        redHome.setPrefSize(75,75);
        redHome.setAlignment(Pos.CENTER);

        blueStartRedHome.getChildren().add(redHome);

        // More spacing
        for (int i = 0; i < 5; i++) {
            Label spacePadding = new Label();
            spacePadding.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
            spacePadding.setPrefSize(50, 50);
            blueStartRedHome.getChildren().add(spacePadding);
        }


        // Set everything
        redHomeHBox.getChildren().add(blueStartRedHome);
        center.setRight(redHomeHBox);
    }


    /** Create the Red Start and Green Home spaces */
    private void initRedStartGreenHome() {
        // Create containers for the spaces
        VBox greenHomeVBox = new VBox();
        HBox redStartGreenHome = new HBox();

        // Create the Green Safe Zone
        for (int i = 0; i < 5; i++) {
            Label greenSafeZone = new Label();
            greenSafeZone.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
            greenSafeZone.setPrefSize(50,50);
            redStartGreenHome.getChildren().add(greenSafeZone);
        }

        // Create the Green Home
        Label greenHome = new Label("Home");
        greenHome.setBorder(new Border(new BorderStroke(null,
                BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
        greenHome.setPrefSize(75,75);
        greenHome.setAlignment(Pos.CENTER);

        // Add the Home
        redStartGreenHome.getChildren().add(greenHome);
        greenHomeVBox.getChildren().add(redStartGreenHome);

        // Create some space
        for (int i = 0; i < 3; i++) {
            Label filler = new Label();
            filler.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.EMPTY)));
            filler.setPrefSize(45,45);
            redStartGreenHome.getChildren().add(filler);
        }

        // Create the red Home
        Circle redHome = new Circle(42.5, Color.RED);
        redStartGreenHome.getChildren().add(redHome);

        // Set it to the center
        center.setBottom(greenHomeVBox);

    }

    /** Create the Sorry label and pile objects */
    private void initCenter() {
        // Create the Sorry! label object
        sorryLbl = new Label("Sorry!");
        sorryLbl.setFont(new Font("Comic Sans", 35));

        // Create the draw pile
        drawPileLabel = new Label("Draw Pile");
        drawPileLabel.setFont(new Font("Comic Sans", 15));

        // Create the discard pile
        discardPileLabel = new Label("Discard Pile");
        discardPileLabel.setFont(new Font("Comic Sans", 15));

        // Create the borders to represent a physical stack of cards
        drawPileLabel.setBorder(new Border(new BorderStroke(null,
                BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
        discardPileLabel.setBorder(new Border(new BorderStroke(null,
                BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));

        // Set the preferred width, height, and alignment
        drawPileLabel.setPrefWidth(100);
        drawPileLabel.setPrefHeight(50);

        discardPileLabel.setPrefWidth(100);
        discardPileLabel.setPrefHeight(50);

        drawPileLabel.setAlignment(Pos.CENTER);
        discardPileLabel.setAlignment(Pos.CENTER);

        cardPile.getChildren().addAll(drawPileLabel, sorryLbl, discardPileLabel);
        cardPile.setAlignment(Pos.CENTER);
        center.setCenter(cardPile);

    }

    /**
     * Create the left side of the board
     */
    private void initLeft() {
        left.setSpacing(0);
        left.setStyle("-fx-background-color: #32CD32;");

        // Create the green spaces
        for (int i = 0; i < 14; i++) {
            Label spaceOutline = new Label();
            spaceOutline.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
            spaceOutline.setPrefSize(50,50);
            left.getChildren().add(spaceOutline);

        }
    }

    /**
     * Create the right side of the board
     */
    private void initRight() {
        right.setSpacing(0);
        right.setStyle("-fx-background-color: #1E90FF;");

        // Create the blue spaces
        for (int i = 0; i < 14; i++) {
            Label spaceOutline = new Label();
            spaceOutline.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
            spaceOutline.setPrefSize(50,50);
            right.getChildren().add(spaceOutline);

        }
    }

    /**
     * Create the bottom side of the board
     */
    private void initBottom() {
        bottom.setSpacing(0);
        bottom.setStyle("-fx-background-color: #B22222;");

        // Create the red spaces
        for (int i = 0; i < 16; i++) {
            Label spaceOutline = new Label();
            spaceOutline.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
            spaceOutline.setPrefSize(50,50);
            bottom.getChildren().add(spaceOutline);

        }
    }

    /**
     * Create the top side of the board
     */
    private void initTop() {
        top.setSpacing(0);
        top.setStyle("-fx-background-color: #FFD700;");

        // Create the yellow spaces
        for (int i = 0; i < 16; i++) {
            Label spaceOutline = new Label();
            spaceOutline.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
            spaceOutline.setPrefSize(50,50);
            top.getChildren().add(spaceOutline);

        }

    }
}
