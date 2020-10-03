package org.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class FoodMenu {
    @FXML
    public void Back() throws IOException {
        App.setRoot("MainMenu");
    }
    @FXML
    public void LogOut() throws IOException {
        App.setRoot("LogIn");
    }
    @FXML
    public void Help() throws IOException {
        App.setRoot("HelpMenu");
    }

    @FXML
    public void Bacsilog() throws IOException {
        App.setRoot("Bacsilog");
    }

    @FXML
    public void ColonelsCurry() throws IOException {
        App.setRoot("ColonelsCurry");
    }

    @FXML
    public void GoodMunch() throws IOException {
        App.setRoot("GoodMunch");
    }
}
