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
 *
 * @author user
 */
public class FXMLDocumentController implements Initializable {
    
    
    @FXML
    private Button lsubmit;
    @FXML
    private Label lpass;
    @FXML
    private TextField uname;
    @FXML
    private TextField upass;
    @FXML
    private Label lname;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void lsubmitaction(ActionEvent event) throws IOException {
        
        String username=uname.getText();
        String password=upass.getText();
        
        String reqUserName="Gunjan";
        String reqPassword="12345";  
        
        ////////////////////////      validation         ///////////////////////////////////////////////////
        if(password.length()==0)
        {
            lpass.setText("necessary");
        }
        if(username.length()==0)
        {
            lname.setText("necessary");
        }
        
        ///////////////////////       authentication         //////////////////////////////////
        
         
        else if(username.equals(reqUserName))
        {
            if(password.equals(reqPassword))
                //go to the next scence
            {
                Parent root = FXMLLoader.load(getClass().getResource("Index.fxml"));
        
                Scene scene = new Scene(root);
                Stage window;
                window = (Stage)((Node)event.getSource()).getScene().getWindow();
                window.setScene(scene);
                window.show();
            }
            
            //else password is wrong
            else
            {
                lpass.setText("wrong");
            }
            
        }
        
    }
    
}
