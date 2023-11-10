package org.Team6.RoughBoard;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

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
        Scene scene = new Scene(root, 700, 600);

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

        root.setTop(top);
        root.setBottom(bottom);
        root.setRight(right);
        root.setLeft(left);
        root.setCenter(center);

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
        left.setPadding(new Insets(15, 12, 15, 12));
        left.setSpacing(0);
        left.setStyle("-fx-background-color: #32CD32;");

        for (int i = 0; i < 16; i++) {
            Button buttonCurrent = new Button("Space");
            buttonCurrent.setPrefSize(50, 100);
            left.getChildren().add(buttonCurrent);
        }
    }

    private void initRight() {
        right.setPadding(new Insets(15, 12, 15, 12));
        right.setSpacing(0);
        right.setStyle("-fx-background-color: #1E90FF;");

        for (int i = 0; i < 16; i++) {
            Button buttonCurrent = new Button("Space");
            buttonCurrent.setPrefSize(50, 50);
            right.getChildren().add(buttonCurrent);
        }
    }

    private void initBottom() {
        bottom.setPadding(new Insets(15, 12, 15, 12));
        bottom.setSpacing(0);
        bottom.setStyle("-fx-background-color: #B22222;");

        for (int i = 0; i < 16; i++) {
            Button buttonCurrent = new Button("Space");
            buttonCurrent.setPrefSize(50, 50);
            bottom.getChildren().add(buttonCurrent);
        }
    }

    private void initTop() {
        top.setPadding(new Insets(15, 12, 15, 12));
        top.setSpacing(0);
        top.setStyle("-fx-background-color: #FFD700;");

        for (int i = 0; i < 16; i++) {
            Button buttonCurrent = new Button("Space");
            buttonCurrent.setPrefSize(50, 50);
            top.getChildren().add(buttonCurrent);
        }

        // Button buttonCurrent = new Button("Current");
        //buttonCurrent.setPrefSize(50, 20);

        //Button buttonProjected = new Button("Projected");
        //buttonProjected.setPrefSize(100, 20);
        //top.getChildren().addAll(buttonCurrent, buttonProjected);
    }
}
