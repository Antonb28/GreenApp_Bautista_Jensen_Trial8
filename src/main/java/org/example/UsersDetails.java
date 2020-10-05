package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class UsersDetails {
    @FXML
    Label Name;
    @FXML
    Label ID;
    @FXML
    Label Occupation;
    @FXML
    Label PassPrompt;
    @FXML
    PasswordField Password;
    @FXML
    ImageView Picture;
    User us = new User();
    UsersAnton ant = new UsersAnton();
    UsersJeremiah jr = new UsersJeremiah();
    UsersJohn jos =  new UsersJohn();

    public String name, id, occupation, Pic;

    @FXML
    private void verify() throws IOException{
        String pass = Password.getText();
        int indicator = us.CheckDetails(pass);

        if(indicator == 2){
            name = jos.Uname();
            id = jos.Uid();
            occupation = jos.Uoccupation();
            Pic = jos.Upic();
            PassPrompt.setText(" ");
        }
        else if(indicator == 3){
            name = ant.Uname();
            id = ant.Uid();
            occupation = ant.Uoccupation();
            Pic = ant.Upic();
            PassPrompt.setText(" ");
        }
        else if(indicator == 4){
            name = jr.Uname();
            id = jr.Uid();
            occupation = jr.Uoccupation();
            Pic = jr.Upic();
            PassPrompt.setText(" ");
        }
        else{
            PassPrompt.setText("Wrong Password, Try Again");
        }

        setDetails(name, id, occupation, Pic);
    }

    private void setDetails(String name, String id, String occupation, String Pic){
        Name.setText(name);
        ID.setText(id);
        Occupation.setText(occupation);
        Image image = new Image(Pic);
        Picture.setImage(image);
    }

    @FXML
    private void Back() throws IOException{
        App.setRoot("MainMenu");
    }

    @FXML
    private void Help() throws IOException{
        App.setRoot("HelpMenu");
    }

    @FXML
    private void LogOut() throws IOException {
        App.setRoot("LogIn");
    }
}
