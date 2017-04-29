/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 *
 * @author kakashi
 */
public class ConnectionController implements Initializable {
    @FXML
    Button btnConnect, btnQuit;
    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
     btnQuit.setOnAction(e -> quitApp());
    }
    
    public void quitApp() {
        Platform.exit();
        System.exit(0);
        
    }


    
}
