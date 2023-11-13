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
    private HBox top;
    private HBox bottom;
    private VBox right;
    private VBox left;
    private BorderPane center;
    private VBox cardPile;
    private Label drawPileLabel;
    private Label discardPileLabel;
    private Label sorryLbl;


    public static void main(String[] args) {
        launch(args);
    }

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

    private void initSceneGraph(BorderPane root) {
        top = new HBox();
        bottom = new HBox();
        right = new VBox();
        left = new VBox();
        center = new BorderPane();
        cardPile = new VBox();

        initTop();
        initBottom();
        initRight();
        initLeft();
        initCenter();
        initRedStartGreenHome();
        initBlueStartRedHome();

        root.setTop(top);
        root.setBottom(bottom);
        root.setRight(right);
        root.setLeft(left);
        root.setCenter(center);

    }

    private void initBlueStartRedHome() {
        HBox redHomeHBox = new HBox();

        VBox blueStartRedHome = new VBox();

        for (int i = 0; i < 6; i++) {
            Label spacePadding = new Label();
            spacePadding.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.EMPTY)));
            spacePadding.setPrefSize(50, 20);
            blueStartRedHome.getChildren().add(spacePadding);
        }

        Circle blueHome = new Circle(42.5, Color.BLUE);
        blueStartRedHome.getChildren().add(blueHome);

        for (int i = 0; i < 3; i++) {
            Label filler = new Label();
            filler.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.EMPTY)));
            filler.setPrefSize(45,55);
            blueStartRedHome.getChildren().add(filler);
        }

        Label redHome = new Label("Home");
        redHome.setBorder(new Border(new BorderStroke(null,
                BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
        redHome.setPrefSize(75,75);
        redHome.setAlignment(Pos.CENTER);

        blueStartRedHome.getChildren().add(redHome);

        for (int i = 0; i < 5; i++) {
            Label spacePadding = new Label();
            spacePadding.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
            spacePadding.setPrefSize(50, 50);
            blueStartRedHome.getChildren().add(spacePadding);
        }


        redHomeHBox.getChildren().add(blueStartRedHome);
        center.setRight(redHomeHBox);
    }


    private void initRedStartGreenHome() {

        VBox greenHomeVBox = new VBox();

        HBox redStartGreenHome = new HBox();
        for (int i = 0; i < 5; i++) {
            Label greenSafeZone = new Label();
            greenSafeZone.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
            greenSafeZone.setPrefSize(50,50);
            redStartGreenHome.getChildren().add(greenSafeZone);
        }


        Label greenHome = new Label("Home");
        greenHome.setBorder(new Border(new BorderStroke(null,
                BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
        greenHome.setPrefSize(75,75);
        greenHome.setAlignment(Pos.CENTER);

        redStartGreenHome.getChildren().add(greenHome);
        greenHomeVBox.getChildren().add(redStartGreenHome);

        for (int i = 0; i < 3; i++) {
            Label filler = new Label();
            filler.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.EMPTY)));
            filler.setPrefSize(45,45);
            redStartGreenHome.getChildren().add(filler);
        }

        Circle redHome = new Circle(42.5, Color.RED);
        redStartGreenHome.getChildren().add(redHome);

        center.setBottom(greenHomeVBox);

    }

    private void initCenter() {
        sorryLbl = new Label("Sorry!");
        sorryLbl.setFont(new Font("Comic Sans", 35));

        drawPileLabel = new Label("Draw Pile");
        drawPileLabel.setFont(new Font("Comic Sans", 15));

        discardPileLabel = new Label("Discard Pile");
        discardPileLabel.setFont(new Font("Comic Sans", 15));

        drawPileLabel.setBorder(new Border(new BorderStroke(null,
                BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
        discardPileLabel.setBorder(new Border(new BorderStroke(null,
                BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));

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

    private void initLeft() {
        left.setSpacing(0);
        left.setStyle("-fx-background-color: #32CD32;");

        for (int i = 0; i < 14; i++) {
            Label spaceOutline = new Label();
            spaceOutline.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
            spaceOutline.setPrefSize(50,50);
            left.getChildren().add(spaceOutline);

            //Button buttonCurrent = new Button("Space");
            //buttonCurrent.setPrefSize(50, 100);
            //left.getChildren().add(buttonCurrent);
        }
    }

    private void initRight() {
        right.setSpacing(0);
        right.setStyle("-fx-background-color: #1E90FF;");

        for (int i = 0; i < 14; i++) {
            Label spaceOutline = new Label();
            spaceOutline.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
            spaceOutline.setPrefSize(50,50);
            right.getChildren().add(spaceOutline);

            //Button buttonCurrent = new Button("Space");
            //buttonCurrent.setPrefSize(50, 50);
            //right.getChildren().add(buttonCurrent);
        }
    }

    private void initBottom() {
        bottom.setSpacing(0);
        bottom.setStyle("-fx-background-color: #B22222;");

        for (int i = 0; i < 16; i++) {
            Label spaceOutline = new Label();
            spaceOutline.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
            spaceOutline.setPrefSize(50,50);
            bottom.getChildren().add(spaceOutline);

            //Button buttonCurrent = new Button("Space");
            //buttonCurrent.setPrefSize(50, 50);
            //bottom.getChildren().add(buttonCurrent);
        }
    }

    private void initTop() {
        top.setSpacing(0);
        top.setStyle("-fx-background-color: #FFD700;");

        for (int i = 0; i < 16; i++) {
            Label spaceOutline = new Label();
            spaceOutline.setBorder(new Border(new BorderStroke(null,
                    BorderStrokeStyle.SOLID, new CornerRadii(4), BorderWidths.DEFAULT)));
            spaceOutline.setPrefSize(50,50);
            top.getChildren().add(spaceOutline);

            //Button buttonCurrent = new Button("Space");
            //buttonCurrent.setPrefSize(50, 50);
            //top.getChildren().add(buttonCurrent);
        }

        // Button buttonCurrent = new Button("Current");
        //buttonCurrent.setPrefSize(50, 20);

        //Button buttonProjected = new Button("Projected");
        //buttonProjected.setPrefSize(100, 20);
        //top.getChildren().addAll(buttonCurrent, buttonProjected);
    }
}
