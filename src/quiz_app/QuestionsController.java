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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author user
 */

public class QuestionsController implements Initializable {

    
    public int count=0;  
    static String[][] qpa = new String[5][5];
    static String[] qans =new String[5];
    
    @FXML
    private Button q1a;
    @FXML
    private Button q1b;
    @FXML
    private Button q1c;
    @FXML
    private Button q1d;
    @FXML
    private Button q2a;
    @FXML
    private Button q2b;
    @FXML
    private Button q2c;
    @FXML
    private Button q2d;
    @FXML
    private Button q3a;
    @FXML
    private Button q3b;
    @FXML
    private Button q3c;
    @FXML
    private Button q3d;
    @FXML
    private Button q4a;
    @FXML
    private Button q4b;
    @FXML
    private Button q4c;
    @FXML
    private Button q4d;
    @FXML
    private Button q5a;
    @FXML
    private Button q5b;
    @FXML
    private Button q5c;
    @FXML
    private Button q5d;
    @FXML
    private Label score;
    @FXML
    private Button start;
    
    
    //////////////////////////   Storing all the qsns and answers in arrays   as database is not used  ///////////////////////////
         public void qpainit()
         {
         qpa[0][0]="What is the default value of the local variables?";
         qpa[0][1]="Null";
         qpa[0][2]="0";
         qpa[0][3]="Depends on data type";
         qpa[0][4]="No default value";
        
         qpa[1][0]="What is the size of a Char in Java?";
         qpa[1][1]="4 bits";
         qpa[1][2]="7 bits";
         qpa[1][3]="8 bits";
         qpa[1][4]="16 bits";
         
         qpa[2][0]="Which of the following will not directly cause a thread to stop?";
         qpa[2][1]="notify()";
         qpa[2][2]="wait()";
         qpa[2][3]="InputStream access";
         qpa[2][4]="sleep()";
         
         qpa[3][0]="Following code will result in: int a1 = 5; double a2 = (float)a1;";
         qpa[3][1]="Compilation error";
         qpa[3][2]="Runtime error";
         qpa[3][3]="No errors";
         qpa[3][4]="None of above";
         
         qpa[4][0]="Java runs on -------";
         qpa[4][1]="Windows";
         qpa[4][2]="Unix/Linux";
         qpa[4][3]="Mac";
         qpa[4][4]="All of the above";
         
         }
         
         ////////////////////// storing all the correct ans in qans array/////////////////////////////
         public void qansinit()
         {
             qans[0]="No default value for local variables";
             qans[1]="16 bits";     
             qans[2]="notify()";
             qans[3]="No errors";
             qans[4]="All of the above";
                
         }
     
         
    @FXML
    private Label q1;
    @FXML
    private Label q2;
    @FXML
    private Label q3;
    @FXML
    private Label q4;
    @FXML
    private Label q5;
    
    /////////////////loading qsn and optn on the scene///////////////////
    public void labelinit()
    {
        
        q1.setText(qpa[0][0]);
        q2.setText(qpa[1][0]);
        q3.setText(qpa[2][0]);
        q4.setText(qpa[3][0]);
        q5.setText(qpa[4][0]);
        
        q1a.setText(qpa[0][1]);
        q1b.setText(qpa[0][2]);
        q1c.setText(qpa[0][3]);
        q1d.setText(qpa[0][4]);
        
        q2a.setText(qpa[1][1]);
        q2b.setText(qpa[1][2]);
        q2c.setText(qpa[1][3]);
        q2d.setText(qpa[1][4]);
        
        q3a.setText(qpa[2][1]);
        q3b.setText(qpa[2][2]);
        q3c.setText(qpa[2][3]);
        q3d.setText(qpa[2][4]);
        
        q4a.setText(qpa[0][1]);
        q4b.setText(qpa[0][2]);
        q4c.setText(qpa[0][3]);
        q4d.setText(qpa[0][4]);
        
        q5a.setText(qpa[0][1]);
        q5b.setText(qpa[0][2]);
        q5c.setText(qpa[0][3]);
        q5d.setText(qpa[0][4]);     
    }
    
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }  
    
    /////////////// clicking the start button initialises al the question and answer on all the pages////////////////
    @FXML
    private void startaction(ActionEvent event) {
        qpainit();
        qansinit();
        labelinit();
        
    }
    ////////////////////////////////////             1st qsn          ////////////////////////////////////////////////////////////////////////////////
    @FXML
    private void q1aaction(ActionEvent event)  {
        if((qpa[0][1]).equals(qans[0]))
        {
            count++;
        }   
       
    }

    @FXML
    private void q1baction(ActionEvent event)  {
        if((qpa[0][2]).equals(qans[0]))
        {
            count++;
        } 
    }

    @FXML
    private void q1caction(ActionEvent event)  {
        if((qpa[0][3]).equals(qans[0]))
        {
            count++;
        } 
        
    }

    @FXML
    private void q1daction(ActionEvent event)  {
        if((qpa[0][4]).equals(qans[0]))
        {
            count++;
        }
        
    }
    
    /////////////////////////////////////2nd qsn//////////////////////////////////
    @FXML
    private void q2aaction(ActionEvent event)  {
        if((qpa[1][1]).equals(qans[1]))
        {
            count++;
        }   
      
    }
    @FXML
    private void q2baction(ActionEvent event)  {
        if((qpa[1][2]).equals(qans[1]))
        {
            count++;
        } 
       
    }
    @FXML
    private void q2caction(ActionEvent event)  {
        if((qpa[1][3]).equals(qans[1]))
        {
            count++;
        } 
       
    }
    @FXML
    private void q2daction(ActionEvent event)  {
        if((qpa[1][4]).equals(qans[1]))
        {
            count++;
        }
        
    }
    
    ///////////////////////////////3rd qsn////////////////////////////////////////////////////////////
    @FXML
    private void q3aaction(ActionEvent event)  {
        if((qpa[2][1]).equals(qans[2]))
        {
            count++;
        }   
        
    }
    @FXML
    private void q3baction(ActionEvent event)  {
        if((qpa[2][2]).equals(qans[2]))
        {
            count++;
        } 
        
    }
    @FXML
    private void q3caction(ActionEvent event)  {
        if((qpa[2][3]).equals(qans[2]))
        {
            count++;
        } 
        
    }
    @FXML
    private void q3daction(ActionEvent event)  {
        if((qpa[2][4]).equals(qans[2]))
        {
            count++;
        }
       
    }
    ///////////////////////////////////////////////4th qsn ////////////////////////////////////////////////////4
    @FXML
    private void q4aaction(ActionEvent event)  {
        if((qpa[3][1]).equals(qans[3]))
        {
            count++;
        }   
        
    }
    @FXML
    private void q4baction(ActionEvent event)  {
        if((qpa[3][2]).equals(qans[3]))
        {
            count++;
        } 
       
    }
    @FXML
    private void q4caction(ActionEvent event)  {
        if((qpa[3][3]).equals(qans[3]))
        {
            count++;
        } 
        
    }
    @FXML
    private void q4daction(ActionEvent event)  {
        if((qpa[3][4]).equals(qans[3]))
        {
            count++;
        }
        
    }
    //////////////////////////////5th qsn//////////////////////////////////////
    @FXML
    private void q5aaction(ActionEvent event) throws IOException {
        if((qpa[4][1]).equals(qans[4]))
        {
            count++;
        }   
        Parent root = FXMLLoader.load(getClass().getResource("result.fxml"));
        
        Scene scene = new Scene(root);
        Stage window;
        window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    @FXML
    private void q5baction(ActionEvent event) throws IOException {
        if((qpa[4][2]).equals(qans[4]))
        {
            count++;
        } 
        Parent root = FXMLLoader.load(getClass().getResource("result.fxml"));
        Scene scene = new Scene(root);
        Stage window;
        window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    @FXML
    private void q5caction(ActionEvent event) throws IOException {
        if((qpa[4][3]).equals(qans[4]))
        {
            count++;
        } 
        Parent root = FXMLLoader.load(getClass().getResource("result.fxml"));
        Scene scene = new Scene(root);
        Stage window;
        window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    @FXML
    private void q5daction(ActionEvent event) throws IOException {
        if((qpa[4][4]).equals(qans[4]))
        {
            count++;
        }
        Parent root = FXMLLoader.load(getClass().getResource("result.fxml"));
        Scene scene = new Scene(root);
        Stage window;
        window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }
    
    
    @FXML
    private void homeaction(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("index.fxml"));
        Scene scene = new Scene(root);
        Stage window;
        window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
                
    }

    ////////////////////////////////////////////////////////////////////////
                   //   controller for the result page  //
    ////////////////////////////////////////////////////////////////////////
    
    
    
    //////////////////////// to display the final result in the result page/////////////////////
    private void getscoreaction(ActionEvent event) {
        score.setText(Integer.toString(count));
    }

    
}
