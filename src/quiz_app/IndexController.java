/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class IndexController implements Initializable {

    @FXML
    private Button nis;
    @FXML
    private Button java;
    @FXML
    private Button osp;
    @FXML
    private Button dmt;



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void javaaction(ActionEvent event) throws IOException {
        
                Parent root = FXMLLoader.load(getClass().getResource("questions.fxml"));
        
                Scene scene = new Scene(root);
                Stage window;
                window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.show();
    }

    @FXML
    private void opsaction(ActionEvent event) throws IOException {
                Parent root = FXMLLoader.load(getClass().getResource("questions.fxml"));
                Scene scene = new Scene(root);
                Stage window;
                window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.show();
    }

    @FXML
    private void dmtaction(ActionEvent event) throws IOException {
                Parent root = FXMLLoader.load(getClass().getResource("questions.fxml"));
                Scene scene = new Scene(root);
                Stage window;
                window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.show();
    }

    @FXML
    private void nisaction(ActionEvent event) throws IOException {
                Parent root = FXMLLoader.load(getClass().getResource("questions.fxml"));
                Scene scene = new Scene(root);
                Stage window;
                window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.show();
    }

    

    
}
