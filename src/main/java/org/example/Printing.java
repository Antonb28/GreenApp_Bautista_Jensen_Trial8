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
    RadioButton AM;
    @FXML
    RadioButton PM;
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
    @FXML
    Label ConfirmPrompt;

    int PriceType = 0, total, netTotal;

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

    @FXML
    private void selectSize() throws IOException{
        ToggleGroup Size = new ToggleGroup();
        A4.setToggleGroup(Size);
        LongBond.setToggleGroup(Size);
        ShortBond.setToggleGroup(Size);

        String Copy = copies.getText();
        String Page = pages.getText();

        rPage.setText(Page);
        rCopies.setText(Copy);

        int cp = Integer.parseInt(String.valueOf(Copy));
        int pg = Integer.parseInt(String.valueOf(Page));

        total = pg*PriceType;
        netTotal = total*cp;
        rTotal.setText(netTotal + " PHP");

        if(A4.isSelected()){
            rSize.setText("A4");
        }
        else if(LongBond.isSelected()){
            rSize.setText("US Legal");
        }
        else if(ShortBond.isSelected()){
            rSize.setText("US Letter");
        }
    }

    @FXML
    Label timePrompt;

    @FXML
    private void inputTime() throws IOException{
        ToggleGroup Time = new ToggleGroup();
        AM.setToggleGroup(Time);
        PM.setToggleGroup(Time);

        String hr = hour.getText();
        String mn = minute.getText();

        int hour = Integer.parseInt(String.valueOf(hr));
        int minute = Integer.parseInt(String.valueOf(mn));

        if(AM.isSelected()){
            if((hour > 12)||(minute> 59)||(hour < 0)||(minute < 0)){
                timePrompt.setText("INVALID TIME");
            }
            rTime.setText(hr+":"+mn+" AM");
        }
        else if(PM.isSelected()){
            if((hour > 12)||(minute> 59)||(hour < 0)||(minute < 0)){
                timePrompt.setText("INVALID TIME");
            }
            rTime.setText(hr+":"+mn+" PM");
        }
    }

    @FXML
    private void confirm() throws IOException{
        int number = (int) (100000 + Math.random()*(999-100)-100);
        String res = Integer.toString(number);
        ConfirmPrompt.setText("Transaction Successful!");
        ReferenceNum.setText(res);
    }

}
