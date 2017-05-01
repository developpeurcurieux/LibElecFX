/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import view.scene.MenuScene;
import sample.Launcher;

public class MenuController implements Initializable {
    private Parent rootMenu;
    private Stage primaryStage;
    private FXMLLoader fxmlMenu;
   
    
    public MenuController(Stage primaryStage) {
        this.primaryStage = primaryStage;
        
        initComponents();
        updateToMenuScene();
    }
    
    public void initComponents() {
        try {
            
            fxmlMenu = new FXMLLoader(getClass().getResource("/view/fxml/Menu.fxml"));
            fxmlMenu.setController(this);
            rootMenu = (Parent) fxmlMenu.load();
            
        }catch(IOException ex) {
            System.out.println("fxml menu: " + ex.getMessage());
        }
    }
    
    public void updateToMenuScene() {
        
        MenuScene menuScene = new MenuScene(rootMenu);
        primaryStage.setScene(null);
        primaryStage.setScene(menuScene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
    
    // FXML components
    //TODO actions btn menu
    @FXML
    Button btnClient;
    
    @FXML
    Button btnQuit;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnQuit.setOnAction(e -> quitApp());
        btnClient.setOnAction(e -> updateToClient());
        
        
    }
    
    public void quitApp() {
        Platform.exit();
        System.exit(0);
        
    }
    
    public void updateToClient() {
        ClientController clientController = new ClientController(primaryStage);
    }
    
    
}
