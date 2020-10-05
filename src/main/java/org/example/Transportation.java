package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;
import java.time.LocalDate;

public class Transportation{
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

    public int Sched;
    public int SeatSelected;

    Seats st = new Seats();

    @FXML
    private void DtoA() throws IOException {
        Time1.setText("1:00 pm");
        Time2.setText("5:30 pm");
        rRoute.setText("DLSU-ATC");
        tp.setText(" ");
    }

    @FXML
    private void selectTime(){
        LocalDate date = LocalDate.now();
        ToggleGroup Time = new ToggleGroup();
        Time1.setToggleGroup(Time);
        Time2.setToggleGroup(Time);

        if(!DtoA.isSelected()){
            tp.setText("Pls Select Route");
        }
        else{
            if(Time1.isSelected()){
                rTime.setText(date + "   1:00pm");
                Sched = 1;
            }
            else if (Time2.isSelected()){
                rTime.setText(date + "   5:30pm");
                Sched = 2;
            }
        }
    }

    @FXML
    private void A1(){
        int status;
        if(!DtoA.isSelected()){
            tp.setText("Pls Select Route");
        }
        else {
                rSeat.setText("A1");
                Seat.setText("A1");
                status = st.LookUpSeat(Sched,1);
                if(status == 1){
                    SeatStat.setText("SEAT TAKEN");
                    SeatSelected = 0;
                }
                else if(status == 2){
                    SeatStat.setText("AVAILABLE");
                    SeatSelected = 1;
                }
            }
    }

    @FXML
    private void B2(){
        int status;
        if(!DtoA.isSelected()){
            tp.setText("Pls Select Route");
        }
        else {
            rSeat.setText("B2");
            Seat.setText("B2");
            status = st.LookUpSeat(Sched,2);
            if(status == 1){
                SeatStat.setText("SEAT TAKEN");
                SeatSelected = 0;
            }
            else if(status == 2){
                SeatStat.setText("AVAILABLE");
                SeatSelected = 2;
            }
        }
    }

    @FXML
    private void C1(){
        int status;
        if(!DtoA.isSelected()){
            tp.setText("Pls Select Route");
        }
        else {
            rSeat.setText("C1");
            Seat.setText("C1");
            status = st.LookUpSeat(Sched,3);
            if(status == 1){
                SeatStat.setText("SEAT TAKEN");
                SeatSelected = 0;
            }
            else if(status == 2){
                SeatStat.setText("AVAILABLE");
                SeatSelected = 3;
            }
        }
    }

    @FXML
    private void D2(){
        int status;
        if(!DtoA.isSelected()){
            tp.setText("Pls Select Route");
        }
        else {
            rSeat.setText("D2");
            Seat.setText("D2");
            status = st.LookUpSeat(Sched,4);
            if(status == 1){
                SeatStat.setText("SEAT TAKEN");
                SeatSelected = 0;
            }
            else if(status == 2){
                SeatStat.setText("AVAILABLE");
                SeatSelected = 4;
            }
        }
    }

    @FXML
    private void E1(){
        int status;
        if(!DtoA.isSelected()){
            tp.setText("Pls Select Route");
        }
        else {
            rSeat.setText("E1");
            Seat.setText("E1");
            status = st.LookUpSeat(Sched,5);
            if(status == 1){
                SeatStat.setText("SEAT TAKEN");
                SeatSelected = 0;
            }
            else if(status == 2){
                SeatStat.setText("AVAILABLE");
                SeatSelected = 5;
            }
        }
    }

    @FXML
    private void F2(){
        int status;
        if(!DtoA.isSelected()){
            tp.setText("Pls Select Route");
        }
        else {
            rSeat.setText("F2");
            Seat.setText("F2");
            status = st.LookUpSeat(Sched,6);
            if(status == 1){
                SeatStat.setText("SEAT TAKEN");
                SeatSelected = 0;
            }
            else if(status == 2){
                SeatStat.setText("AVAILABLE");
                SeatSelected = 6;
            }
        }
    }

    @FXML
    private void A3(){
        int status;
        if(!DtoA.isSelected()){
            tp.setText("Pls Select Route");
        }
        else {
            rSeat.setText("A3");
            Seat.setText("A3");
            status = st.LookUpSeat(Sched,7);
            if(status == 1){
                SeatStat.setText("SEAT TAKEN");
                SeatSelected = 0;
            }
            else if(status == 2){
                SeatStat.setText("AVAILABLE");
                SeatSelected = 7;
            }
        }
    }

    @FXML
    private void B4(){
        int status;
        if(!DtoA.isSelected()){
            tp.setText("Pls Select Route");
        }
        else {
            rSeat.setText("B4");
            Seat.setText("B4");
            status = st.LookUpSeat(Sched,8);
            if(status == 1){
                SeatStat.setText("SEAT TAKEN");
                SeatSelected = 0;
            }
            else if(status == 2){
                SeatStat.setText("AVAILABLE");
                SeatSelected = 8;
            }
        }
    }

    @FXML
    private void C3(){
        int status;
        if(!DtoA.isSelected()){
            tp.setText("Pls Select Route");
        }
        else {
            rSeat.setText("C3");
            Seat.setText("C3");
            status = st.LookUpSeat(Sched,9);
            if(status == 1){
                SeatStat.setText("SEAT TAKEN");
                SeatSelected = 0;
            }
            else if(status == 2){
                SeatStat.setText("AVAILABLE");
                SeatSelected = 9;
            }
        }
    }

    @FXML
    private void D4(){
        int status;
        if(!DtoA.isSelected()){
            tp.setText("Pls Select Route");
        }
        else {
            rSeat.setText("D4");
            Seat.setText("D4");
            status = st.LookUpSeat(Sched,10);
            if(status == 1){
                SeatStat.setText("SEAT TAKEN");
                SeatSelected = 0;
            }
            else if(status == 2){
                SeatStat.setText("AVAILABLE");
                SeatSelected = 10;
            }
        }
    }

    @FXML
    private void E3(){
        int status;
        if(!DtoA.isSelected()){
            tp.setText("Pls Select Route");
        }
        else {
            rSeat.setText("E3");
            Seat.setText("E3");
            status = st.LookUpSeat(Sched,11);
            if(status == 1){
                SeatStat.setText("SEAT TAKEN");
                SeatSelected = 0;
            }
            else if(status == 2){
                SeatStat.setText("AVAILABLE");
                SeatSelected = 11;
            }
        }
    }

    @FXML
    private void F4(){
        int status;
        if(!DtoA.isSelected()){
            tp.setText("Pls Select Route");
        }
        else {
            rSeat.setText("F4");
            Seat.setText("F4");
            status = st.LookUpSeat(Sched,12);
            if(status == 1){
                SeatStat.setText("SEAT TAKEN");
                SeatSelected = 0;
            }
            else if(status == 2){
                SeatStat.setText("AVAILABLE");
                SeatSelected = 12;
            }
        }
    }

    Receipt r = new Receipt();

    @FXML
    private void Confirm(){
        int status;
        int number = r.TransactionNumber();
        String res = Integer.toString(number);
        status = st.seatSelect(Sched,SeatSelected);
        if(SeatSelected != 0) {
            if ((status == 1)) {
                rPrompt.setText("Reservation Successful!");
                rNumber.setText(res);
            }
        }
        if(SeatSelected == 0) {
            rPrompt.setText("Reservation Failed");
        }
    }

    @FXML
    private void Back() throws IOException {
        App.setRoot("MainMenu");
    }

    @FXML
    private void reset(){
        DtoA.setSelected(false);
        Time1.setSelected(false);
        Time2.setSelected(false);
        Time1.setText("--:--");
        Time2.setText("--:--");
        rRoute.setText("----");
        rNumber.setText("----");
        rTime.setText("----");
        rSeat.setText("----");
        rPrompt.setText(" ");
        SeatStat.setText(" ");
        Seat.setText(" ");
    }

    }


