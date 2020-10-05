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

    @FXML
    public void Bacsilog() throws IOException {
        App.setRoot("Bacsilog");
    }

    @FXML
    private void ColonelsCurry() throws IOException {
        App.setRoot("ColonelsCurry");
    }

    @FXML
    private void GoodMunch() throws IOException {
        App.setRoot("GoodMunch");
    }

    @FXML
    private void User() throws IOException{
        App.setRoot("UserDetails");
    }
}
