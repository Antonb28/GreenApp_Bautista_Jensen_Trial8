package org.example;

import javafx.fxml.FXML;
import javafx.stage.FileChooser;
import javafx.scene.control.*;

import java.io.File;
import java.io.IOException;

public class Printing {
    @FXML
    Button SelectFile;
    @FXML
    Label SelectPrompt;
    @FXML
    RadioButton Colored;
    @FXML
    RadioButton BW;
    @FXML
    RadioButton A4;
    @FXML
    RadioButton ShortBond;
    @FXML
    RadioButton LongBond;
    @FXML
    TextField copies;
    @FXML
    TextField pages;
    @FXML
    TextField hour;
    @FXML
    TextField minute;
    @FXML
    Label rName;
    @FXML
    Label rType;
    @FXML
    Label rPage;
    @FXML
    Label rCopies;
    @FXML
    Label rSize;
    @FXML
    Label rTime;
    @FXML
    Label rTotal;
    @FXML
    Label ReferenceNum;

    int PriceType = 0;

    @FXML
    private void Back() throws IOException {
        App.setRoot("MainMenu");
    }

    @FXML
    private void fileSelect() throws IOException{
        File file;
        String path;
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select File");
        file = fileChooser.showOpenDialog(null);
        path = file.getName();
        SelectPrompt.setText(path);
        rName.setText(path);
    }

    @FXML
    private void selectType() throws IOException{
        ToggleGroup Type = new ToggleGroup();
        Colored.setToggleGroup(Type);
        BW.setToggleGroup(Type);

        if(BW.isSelected()){
            rType.setText("B & W");
            PriceType = 5;
        }
        else if(Colored.isSelected()){
            rType.setText("Colored");
            PriceType = 10;
        }
    }
}
