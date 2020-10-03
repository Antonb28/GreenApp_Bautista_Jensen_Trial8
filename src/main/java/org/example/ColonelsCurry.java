package org.openjfx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.example.App;

import java.io.IOException;

public class ColonelsCurry {
    int total =0, input, change;
    int item;
    int [] itemarray = new int[2];
    int [] price = {260, 150};

    @FXML
    private Label Message;

    @FXML
    private ListView list;

    @FXML
    private TextField Payment;

    @FXML
    private Label Change;

    @FXML
    private CheckBox Gyoza;

    @FXML
    private CheckBox Curry;

    @FXML
    private TextField qCurry;

    @FXML
    private TextField qGyoza;

    @FXML
    private Label Total;


    @FXML
    private void BackToMenu() throws IOException{
        App.setRoot("FoodMenu");
    }

    @FXML
    private void OrderCurry(){
        String oc = qCurry.getText();
        if(Curry.isSelected()) {
            input = Integer.parseInt(String.valueOf(oc));
            item = 0;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Premium Japanese Curry Bento: " + itemarray[item]);
            Total.setText("Total: Php " + total);
        }

        if(!Curry.isSelected()){
            list.getItems().remove("Premium Japanese Curry Bento: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }
    }

    @FXML
    private void OrderGyoza(){
        String og = qGyoza.getText();
        if(Gyoza.isSelected()) {
            input = Integer.parseInt(String.valueOf(og));
            item = 1;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Pan-Seared Gyoza (5 pcs): " + itemarray[item]);
            Total.setText("Total: Php " + total);
        }

        if(!Gyoza.isSelected()){
            list.getItems().remove("Pan-Seared Gyoza (5 pcs): " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }
    }

    @FXML
    private void Payment(){
        String pay = Payment.getText();
        if (input < total){
            input = Integer.parseInt(String.valueOf(pay));
            Message.setText("Insufficient Funds!");
        }
        if(input >= total){
            change = input - total;
            Change.setText("Php " + change);
            Message.setVisible(false);
        }
    }

}
