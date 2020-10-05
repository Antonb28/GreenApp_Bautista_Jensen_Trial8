package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class MainMenu {
    @FXML
    Label GreetingPrompt;
    @FXML
    Rectangle FClick;
    @FXML
    Rectangle TClick;
    @FXML
    Rectangle printClick;
    @FXML
    ImageView Foods;
    @FXML
    ImageView Trans;
    @FXML
    ImageView Prints;

    @FXML
    private void LogOut() throws IOException {
        App.setRoot("LogIn");
    }

    @FXML
    private void Help() throws IOException{
        App.setRoot("HelpMenu");
    }

    @FXML
    private void Transportation() throws IOException{
        App.setRoot("Transportation");
    }

    @FXML
    private void Back() throws IOException{
        App.setRoot("MainMenu");
    }

    @FXML
    private void Food() throws IOException{
        App.setRoot("FoodMenu");
    }

    @FXML
    private void Print() throws IOException{
        App.setRoot("Printing");
    }

    @FXML
    private void User() throws IOException{
        App.setRoot("UserDetails");
    }

    @FXML
    private void FoodDetect() throws IOException{
        FClick.setOpacity(.30);
    }

    @FXML
    private void FoodExit() throws IOException{
        FClick.setOpacity(0);
    }

    @FXML
    private void TransDetect() throws IOException{
        TClick.setOpacity(.30);
    }

    @FXML
    private void TransExit() throws IOException{
        TClick.setOpacity(0);
    }

    @FXML
    private void PrintDetect() throws IOException{
        printClick.setOpacity(.30);
    }

    @FXML
    private void PrintExit() throws IOException{
        printClick.setOpacity(0);
    }

    @FXML
    private void fdDetect() throws IOException{
        Foods.setOpacity(0);
    }

    @FXML
    private void fdExit() throws IOException{
        Foods.setOpacity(100);
    }

    @FXML
    private void trDetect() throws IOException{
        Trans.setOpacity(0);
    }

    @FXML
    private void trExit() throws IOException{
        Trans.setOpacity(100);
    }

    @FXML
    private void prDetect() throws IOException{
        Prints.setOpacity(0);
    }

    @FXML
    private void prExit() throws IOException{
        Prints.setOpacity(100);
    }

}