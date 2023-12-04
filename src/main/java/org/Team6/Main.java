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

    @Override
    public void init() throws Exception {
        super.init();
        this.theModel = new GameManager();
        this.theView = new SorryView(this.theModel);
        this.theController = new SorryController(this.theModel, this.theView);
    }

    @Override
    public void start(Stage primaryStage) {

        //System.out.println("reached start method");

        Parent root = this.theView.initializeView();

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Sorry! Board Game");
        primaryStage.show();
    }
}