package com.loginpage.loginmate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import static com.loginpage.loginmate.UserUtils.hashPassword;

public class LoginController {

    @FXML
    Label lbl_userName;
    @FXML
    Label lbl_password;
    @FXML
    TextField tf_userName;
    @FXML
    PasswordField pf_password;
    @FXML
    Button btn_login;
    @FXML
    Hyperlink hl_signUp;

    @FXML
    public void onSignUpHandler(ActionEvent event){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("signuppage.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    public void onLoginHandler(){
        String userName = tf_userName.getText();
        String password = pf_password.getText();

        if (UserDAO.loginUser(userName, password)) {
            System.out.println("Giriş başarılı!");
            new Alert(Alert.AlertType.INFORMATION, "LOGIN...").showAndWait();
        } else {
            System.out.println("Giriş başarısız!");
            new Alert(Alert.AlertType.INFORMATION, "OOPS.").showAndWait();
        }
    }


}
