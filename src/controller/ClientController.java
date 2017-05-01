package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.*;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import view.scene.ClientScene;
import sample.Launcher;


public class ClientController implements Initializable {
    private Parent rootClient;
    private Stage primaryStage;
    private FXMLLoader fxmlClient;
   
    
    public ClientController(Stage primaryStage) {
        this.primaryStage = primaryStage;
 
     initComponents();
        updateToClientScene();
    }
    
    public void initComponents() {
        try {
            
            fxmlClient = new FXMLLoader(getClass().getResource("/view/fxml/Client.fxml"));
            fxmlClient.setController(this);
            rootClient = (Parent) fxmlClient.load();
            
        }catch(IOException ex) {
            System.out.println("fxml client: " + ex.getMessage());
        }
    }
    
    public void updateToClientScene() {
        
        ClientScene clientScene = new ClientScene(rootClient);
        primaryStage.setScene(null);
        primaryStage.setScene(clientScene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
    
   
    // FXML Components 
    
    @FXML
    FlowPane flowpaneClient;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //TODO makea thread for separator flowpane for resizing screen
//        float fpSeparator = ( (float) flowpaneClient.getWidth() ) - 100;
//        System.out.println("fpseparator: " + fpSeparator);
//        flowpaneClient.setHgap(530);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}