package org.example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import org.example.App;

import java.io.IOException;

public class Bacsilog {
    int total =0, input, change;
    int item;
    int [] itemarray = new int[14];
    int [] price = {74, 74, 74, 74, 74, 74, 74, 89, 89, 89, 89, 89, 89, 89};

    @FXML
    private Label Message;

    @FXML
    private TextField qCornedsilog;

    @FXML
    private CheckBox BaconOmelette;
    @FXML
    private CheckBox Tocilog;

    @FXML
    private CheckBox TapaOmelette;

    @FXML
    private CheckBox FootlongOmelette;

    @FXML
    private CheckBox NuggetsOmelette;

    @FXML
    private CheckBox TocinoOmelette;

    @FXML
    private CheckBox HotdogOmelette;

    @FXML
    private CheckBox CornedbeefOmelette;

    @FXML
    private TextField qBaconOmelette;

    @FXML
    private TextField qTapaOmelette;

    @FXML
    private TextField qFootlongOmelette;

    @FXML
    private TextField qNuggetsOmelette;

    @FXML
    private TextField qTocinoOmelette;
    @FXML
    private TextField qHotdogOmelette;

    @FXML
    private TextField qCornedbeefOmelette;

    @FXML
    private TextField qHotsilog;

    @FXML
    private CheckBox Hotsilog;

    @FXML
    private TextField qTocilog;
    @FXML
    private CheckBox Nuggetsilog;
    @FXML
    private TextField qNuggetsilog;

    @FXML
    private CheckBox Footsilog;
    @FXML
    private TextField qFootsilog;
    @FXML
    private TextField qBacsilog;

    @FXML
    private TextField qTapsilog;

    @FXML
    private ListView list;

    @FXML
    private CheckBox Cornedsilog;

    @FXML
    private CheckBox Bacsilog;

    @FXML
    private CheckBox Tapsilog;

    @FXML
    private Label Total;

    @FXML
    private TextField Payment;

    @FXML
    private Label Change;

    @FXML
    private Label orderNum;

    @FXML
    private void OrderBacsilog(){
        String ob = qBacsilog.getText();
        if(Bacsilog.isSelected()) {
            input = Integer.parseInt(String.valueOf(ob));
            item = 0;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Bacsilog: " + itemarray[item]);
            Total.setText("Total: Php " + total);

        }
        if(!Bacsilog.isSelected()) {
            list.getItems().remove("Bacsilog: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }
    }

    @FXML
    private void OrderTapsilog(){
        String ot = qTapsilog.getText();
        if(Tapsilog.isSelected()) {
            input = Integer.parseInt(String.valueOf(ot));
            item = 1;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Tapsilog: " + itemarray[item]);
            Total.setText("Total: Php " + total);

        }
        if(!Tapsilog.isSelected()) {
            list.getItems().remove("Tapsilog: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }

    }

    @FXML
    private void OrderFootsilog(){
        String of = qFootsilog.getText();
        if(Footsilog.isSelected()) {
            input = Integer.parseInt(String.valueOf(of));
            item = 2;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Footsilog: " + itemarray[item]);
            Total.setText("Total: Php " + total);

        }
        if(!Footsilog.isSelected()) {
            list.getItems().remove("Footsilog: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }

    }

    @FXML
    private void OrderNuggetsilog() {
        String on = qNuggetsilog.getText();
        if(Nuggetsilog.isSelected()) {
            input = Integer.parseInt(String.valueOf(on));
            item = 3;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Nuggetsilog: " + itemarray[item]);
            Total.setText("Total: Php " + total);

        }
        if(!Nuggetsilog.isSelected()) {
            list.getItems().remove("Nuggetsilog: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }


    }
    
    @FXML
    private void OrderTocilog(){
        String ot = qTocilog.getText();
        if(Tocilog.isSelected()) {
            input = Integer.parseInt(String.valueOf(ot));
            item = 4;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Tocilog: " + itemarray[item]);
            Total.setText("Total: Php " + total);

        }
        if(!Tocilog.isSelected()) {
            list.getItems().remove("Tocilog: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }
        
    }

    @FXML
    private void OrderHotsilog(){
        String ot = qHotsilog.getText();
        if(Hotsilog.isSelected()) {
            input = Integer.parseInt(String.valueOf(ot));
            item = 5;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Hotsilog: " + itemarray[item]);
            Total.setText("Total: Php " + total);

        }
        if(!Hotsilog.isSelected()) {
            list.getItems().remove("Hotsilog: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }

    }
    @FXML
    private void OrderCornedsilog() {
        String oc = qCornedsilog.getText();
        if(Cornedsilog.isSelected()) {
            input = Integer.parseInt(String.valueOf(oc));
            item = 6;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Cornedsilog: " + itemarray[item]);
            Total.setText("Total: Php " + total);

        }
        if(!Cornedsilog.isSelected()) {
            list.getItems().remove("Cornedsilog: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }
    }

    @FXML
    private void OrderBaconOmelette() {
        String ob = qBaconOmelette.getText();
        if(BaconOmelette.isSelected()) {
            input = Integer.parseInt(String.valueOf(ob));
            item = 7;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Bacon Omelette: " + itemarray[item]);
            Total.setText("Total: Php " + total);

        }
        if(!BaconOmelette.isSelected()) {
            list.getItems().remove("Bacon Omelette: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }

    }

    @FXML
    private void OrderTapaOmelette() {
        String ot = qTapaOmelette.getText();
        if(TapaOmelette.isSelected()) {
            input = Integer.parseInt(String.valueOf(ot));
            item = 8;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Tapa Omelette: " + itemarray[item]);
            Total.setText("Total: Php " + total);

        }
        if(!TapaOmelette.isSelected()) {
            list.getItems().remove("Tapa Omelette: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }

    }
    @FXML
    private void OrderFootlongOmelette() {
        String of = qFootlongOmelette.getText();
        if(FootlongOmelette.isSelected()) {
            input = Integer.parseInt(String.valueOf(of));
            item = 9;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Footlong Omelette: " + itemarray[item]);
            Total.setText("Total: Php " + total);

        }
        if(!FootlongOmelette.isSelected()) {
            list.getItems().remove("Footlong Omelette: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }


    }

    @FXML
    private void OrderNuggetsOmelette(){
        String on = qNuggetsOmelette.getText();
        if(NuggetsOmelette.isSelected()) {
            input = Integer.parseInt(String.valueOf(on));
            item = 10;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Nuggets Omelette: " + itemarray[item]);
            Total.setText("Total: Php " + total);

        }
        if(!NuggetsOmelette.isSelected()) {
            list.getItems().remove("Nuggets Omelette: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }
    }

    @FXML
    private void OrderTocinoOmelette() {
        String ot = qTocinoOmelette.getText();
        if(TocinoOmelette.isSelected()) {
            input = Integer.parseInt(String.valueOf(ot));
            item = 11;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Tocino Omelette: " + itemarray[item]);
            Total.setText("Total: Php " + total);

        }
        if(!TocinoOmelette.isSelected()) {
            list.getItems().remove("Tocino Omelette: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }
    }

    @FXML
    private void OrderHotdogOmelette() {
        String oh = qHotdogOmelette.getText();
        if(HotdogOmelette.isSelected()) {
            input = Integer.parseInt(String.valueOf(oh));
            item = 12;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Hotdog Omelette: " + itemarray[item]);
            Total.setText("Total: Php " + total);

        }
        if(!HotdogOmelette.isSelected()) {
            list.getItems().remove("Hotdog Omelette: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }

    }

    @FXML
    private void OrderCornedbeefOmelette() {
        String oc = qCornedbeefOmelette.getText();
        if(CornedbeefOmelette.isSelected()) {
            input = Integer.parseInt(String.valueOf(oc));
            item = 13;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Cornedbeef Omelette: " + itemarray[item]);
            Total.setText("Total: Php " + total);

        }
        if(!CornedbeefOmelette.isSelected()) {
            list.getItems().remove("Cornedbeef Omelette: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }
    }

    @FXML
    private void BackToMenu() throws IOException {
        App.setRoot("FoodMenu");
    }

    @FXML
    private void Payment(){
        int number = (int) (100000 + Math.random()*(999-100)-100);
        String res = Integer.toString(number);
        String pay = Payment.getText();
        if (input < total){
            input = Integer.parseInt(String.valueOf(pay));
            Message.setText("Insufficient Funds!");
        }
        if(input >= total){
            change = input - total;
            Change.setText("Php " + change);
            Message.setText("Order Sucessful");
            orderNum.setText(res);
        }
    }
}