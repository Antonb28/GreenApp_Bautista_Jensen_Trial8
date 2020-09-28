package org.example;

import javafx.fxml.FXML;

import java.io.IOException;

public class Printing {
    @FXML
    private void Back() throws IOException {
        App.setRoot("MainMenu");
    }
}
