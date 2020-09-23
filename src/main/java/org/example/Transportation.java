package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.io.IOException;

public class Transportation {
    @FXML
    RadioButton DtoA;
    @FXML
    RadioButton Time1;
    @FXML
    RadioButton Time2;
    @FXML
    Label rPrompt;
    @FXML
    Label rRoute;
    @FXML
    Label rTime;
    @FXML
    Label rSeat;
    @FXML
    Label rNumber;
    @FXML
    Label Seat;
    @FXML
    Label SeatStat;
    @FXML
    Button back;
    @FXML
    Button CONFIRM;
    @FXML
    Button A1;
    @FXML
    Button B2;
    @FXML
    Button C1;
    @FXML
    Button D2;
    @FXML
    Button E1;
    @FXML
    Button F2;
    @FXML
    Button A3;
    @FXML
    Button B4;
    @FXML
    Button C3;
    @FXML
    Button D4;
    @FXML
    Button E3;
    @FXML
    Button F4;

    @FXML
    private void DtoA() throws IOException {
        Time1.setText("Hello1");
        Time2.setText("Hello3");
        rRoute.setText("DLSU-ATC");
    }


}
