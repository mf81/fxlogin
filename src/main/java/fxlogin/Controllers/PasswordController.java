package fxlogin.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class PasswordController {

    @FXML
    private TextField login;
    @FXML
    private TextField password;
    @FXML
    private Label message;

    @FXML
    private void loginBooton() throws IOException {
        if(login.getText().equals("user") && password.getText().equals("user")){
            login.getScene().getWindow().hide();

            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("mainWindow.fxml"));
            primaryStage.setTitle("App");
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        }
        else
        {
            login.clear();;
            password.clear();
            message.setText("Bad login or password - try again!!!");
        }


    }
}
