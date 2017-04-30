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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import view.scene.ConnectionScene;
import java.io.IOException;

import view.scene.*;
import sample.Launcher;


public class ConnectionController implements Initializable {
    private Launcher launcher;
    private Parent root;
    private Stage primaryStage;
    private FXMLLoader fxmlConnect;
    private ConnectionScene connectionScene;
    
    public ConnectionController(Stage primaryStage, Launcher launcher) {
        this.primaryStage = primaryStage;
        this.launcher = launcher;
        initComponents();
        loadConnectionScene();
    }
    
    public void initComponents() {
        try {
            fxmlConnect = new FXMLLoader(getClass().getResource("/view/fxml/Connection.fxml"));
            fxmlConnect.setController(this);
            root = (Parent) fxmlConnect.load();
        }catch(IOException ex) {
            System.out.println("connection fxml /"  + ex.getMessage());
        }
        
    }
    
    public void loadConnectionScene() {
        connectionScene = new ConnectionScene(root);
        Image iconApp = new Image(getClass().getResourceAsStream("/res/libIcon_32.png"));
        
        primaryStage.setTitle("LibElec");
        primaryStage.getIcons().add(iconApp);
        primaryStage.setScene(connectionScene);
        primaryStage.show();
        
    }
    
    public void updateToMenu() {
        
//        fxmlConnect.setRoot(null);
//        fxmlConnect.setController(null);
//        fxmlConnect.setResources(null);
//        fxmlConnect.getNamespace().clear();
        primaryStage.close();
        launcher.loadMenuScene();
        
    }
    
    
    public void quitApp() {
        Platform.exit();
        System.exit(0);
        
    }
    
    
    // composants Fxml
    
    @FXML
            Button btnConnect, btnQuit;
    
    
    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        btnConnect.setOnAction(e -> updateToMenu());
        btnQuit.setOnAction(e -> quitApp());
    }
    
    
    
    
    
    
}
