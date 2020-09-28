package org.example;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.scene.control.*;
import java.io.IOException;

public class Printing {
    @FXML
    Button SelectFile;

    @FXML
    private void Back() throws IOException {
        App.setRoot("MainMenu");
    }

    @FXML
    private void fileSelect() throws IOException{
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select File");
        fileChooser.showOpenDialog(null);
    }
}
