package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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

}