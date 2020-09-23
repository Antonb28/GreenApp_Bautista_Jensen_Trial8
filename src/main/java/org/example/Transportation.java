package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

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
    Label tp;
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
        Time1.setText("1:00 pm");
        Time2.setText("5:30 pm");
        rRoute.setText("DLSU-ATC");
        tp.setText(" ");
    }

    @FXML
    private void selectTime(){
        ToggleGroup Time = new ToggleGroup();
        Time1.setToggleGroup(Time);
        Time2.setToggleGroup(Time);

        if(!DtoA.isSelected()){
            tp.setText("Pls Select Route");
        }
        else{
            if(Time1.isSelected()){
                rTime.setText("1:00pm");
            }
            else if (Time2.isSelected()){
                rTime.setText("5:00pm");
            }
        }
    }

    @FXML
    private void A1(){
        if(!DtoA.isSelected()){
            tp.setText("Pls Select Route");
        }
        else {
                rSeat.setText("A1");
                Seat.setText("A1");
                SeatStat.setText("AVAILABLE");
            }
        }
    }

