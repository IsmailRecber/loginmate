package com.loginpage.loginmate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.util.EventObject;

public class SignUpController {
    UserDAO userDAO=new UserDAO();

    @FXML
    Label lbl_userName;

    @FXML
    Label lbl_password;

    @FXML
    Label lbl_email;

    @FXML
    TextField tf_userName;

    @FXML
    PasswordField pf_password;

    @FXML
    TextField tf_email;
    @FXML
    Hyperlink hl_logIn;

    public void onJoinHandler(){

        String userName=tf_userName.getText();
        String password= pf_password.getText();
        String email= tf_email.getText();
        User user1=new User(userName,password,email);

        try {
            userDAO.registerUser(user1);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void onLogInHandler2(ActionEvent event){

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("loginpage.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
