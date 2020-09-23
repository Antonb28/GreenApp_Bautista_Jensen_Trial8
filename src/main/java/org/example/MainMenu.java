package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class MainMenu {
    Users us = new Users();
    @FXML
    Label GreetingPrompt;

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

}