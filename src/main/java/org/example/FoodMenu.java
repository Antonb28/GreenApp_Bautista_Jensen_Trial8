package org.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class FoodMenu {
    @FXML
    private void Back() throws IOException {
        App.setRoot("MainMenu");
    }
    @FXML
    private void LogOut() throws IOException {
        App.setRoot("LogIn");
    }
    @FXML
    private void Help() throws IOException {
        App.setRoot("HelpMenu");
    }
}
