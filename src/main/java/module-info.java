module com.loginpage.loginmate {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jbcrypt;


    opens com.loginpage.loginmate to javafx.fxml;
    exports com.loginpage.loginmate;
}