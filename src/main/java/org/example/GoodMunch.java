package org.openjfx;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.example.App;

import java.io.IOException;

public class GoodMunch {
    int total =0, input, change;
    int item;
    int [] itemarray = new int[9];
    int [] price = {109, 109, 109, 109, 109, 109, 109, 12, 15};

    @FXML
    private Label Message;

    @FXML
    private TextField qBeefsalpicao;

    @FXML
    private TextField qHoneygarlicfish;

    @FXML
    private TextField qSignatureegg;

    @FXML
    private TextField qMarblepotatoes;

    @FXML
    private TextField qFragrantrice;

    @FXML
    private CheckBox smokedbacon;

    @FXML
    private CheckBox marblepotatoes;

    @FXML
    private CheckBox fragrantrice;

    @FXML
    private TextField qSmokedbacon;

    @FXML
    private CheckBox beefsalpicao;

    @FXML
    private CheckBox honeygarlicfish;

    @FXML
    private CheckBox signatureegg;

    @FXML
    private Label Change;

    @FXML
    private TextField Payment;

    @FXML
    private TextField qExtradirtyporkchop;

    @FXML
    private TextField qDirtyporkchop;

    @FXML
    private CheckBox extradirty;

    @FXML
    private CheckBox dirtyporkchop;

    @FXML
    private CheckBox rosemarychicken;

    @FXML
    private TextField qRosemarychicken;

    @FXML
    private ListView list;

    @FXML
    private Label Total;

    @FXML
    public void BackToMenu() throws IOException {
        App.setRoot("FoodMenu");
    }

    @FXML
    private void OrderRose(){
        String rm = qRosemarychicken.getText();

        if(rosemarychicken.isSelected()) {
            input = Integer.parseInt(String.valueOf(rm));
            item = 0;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("RoseMary Chicken: " + itemarray[item]);
            Total.setText("Total: Php " + total);
        }

        if(!rosemarychicken.isSelected()){
            list.getItems().remove("RoseMary Chicken: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }

    }
    @FXML
    private void OrderDirty(){
        String dt = qDirtyporkchop.getText();
        if(dirtyporkchop.isSelected()){
            input = Integer.parseInt(String.valueOf(dt));
            item = 1;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Dirty Porkchop: " + itemarray[item]);
            Total.setText("Total: Php " + total);
        }

        if(!dirtyporkchop.isSelected()){
            list.getItems().remove("Dirty Porkchop: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }
    }

    @FXML
    private void OrderExtra(){
        String ed = qExtradirtyporkchop.getText();

        if(extradirty.isSelected()) {
            input = Integer.parseInt(String.valueOf(ed));
            item = 2;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Extra Dirty Porkchop: " + itemarray[item]);
            Total.setText("Total: Php " + total);
        }

        if(!extradirty.isSelected()){
            list.getItems().remove("Extra Dirty Porkchop: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }
    }
    @FXML
    private void OrderBeef(){
        String bs = qBeefsalpicao.getText();

        if(beefsalpicao.isSelected()) {
            input = Integer.parseInt(String.valueOf(bs));
            item = 3;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Beef Salpicao: " + itemarray[item]);
            Total.setText("Total: Php " + total);
        }

        if(!beefsalpicao.isSelected()){
            list.getItems().remove("Beef Salpicao: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }
    }

    @FXML
    private void OrderFish(){
        String hg = qHoneygarlicfish.getText();

        if(honeygarlicfish.isSelected()) {
            input = Integer.parseInt(String.valueOf(hg));
            item = 4;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Honey Garlic Fish: " + itemarray[item]);
            Total.setText("Total: Php " + total);
        }

        if(!honeygarlicfish.isSelected()){
            list.getItems().remove("Honey Garlic Fish: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);

        }

    }

    @FXML
    private void OrderSmoked(){
        String sb = qSmokedbacon.getText();

        if(smokedbacon.isSelected()) {
            input = Integer.parseInt(String.valueOf(sb));
            item = 5;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Smoked Bacon: " + itemarray[item]);
            Total.setText("Total: Php " + total);
        }

        if(!smokedbacon.isSelected()){
            list.getItems().remove("Smoked Bacon: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }

    }

    @FXML
    private void OrderMarbled(){
        String om = qMarblepotatoes.getText();

        if(marblepotatoes.isSelected()) {
            input = Integer.parseInt(String.valueOf(om));
            item = 6;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Marble Potatoes: " + itemarray[item]);
            Total.setText("Total: Php " + total);
        }

        if(!marblepotatoes.isSelected()){
            list.getItems().remove("Marble Potatoes: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }

    }
    @FXML
    private void OrderEgg(){
        String oe = qSignatureegg.getText();

        if(signatureegg.isSelected()) {
            input = Integer.parseInt(String.valueOf(oe));
            item = 7;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Signature Egg: " + itemarray[item]);
            Total.setText("Total: Php " + total);
        }

        if(!signatureegg.isSelected()){
            list.getItems().remove("Signature Egg: " + itemarray[item]);
            total -= itemarray[item];
            Total.setText("Total: Php " + total);
        }

    }

    @FXML
    private void OrderFragrant(){
        String of = qFragrantrice.getText();

        if(fragrantrice.isSelected()) {
            input = Integer.parseInt(String.valueOf(of));
            item = 8;

            itemarray[item] = input * price[item];
            total += itemarray[item];

            list.getItems().add("Fragrant Rice: " + itemarray[item]);
            Total.setText("Total: Php " + total);
        }

        if(!fragrantrice.isSelected()){
            list.getItems().remove("Fragrant Rice: " + itemarray[item]);
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