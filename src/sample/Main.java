/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import utilDB.DBUtil;

/**
 *
 * @author kakashi
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
       Image iconApp = new Image(getClass().getResourceAsStream("/res/libIcon_32.png"));
            
        Parent root = FXMLLoader.load(getClass().getResource("/view/fxml/Connection.fxml"));
        Scene scene = new Scene(root);
                          
        primaryStage.getIcons().add(iconApp);
        primaryStage.setTitle("LibElec");
        primaryStage.setScene(scene);
        primaryStage.show(); 
        
        }catch(IOException ex) {
            System.out.println("file fxml not loaded / " + ex.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBUtil.toConnect();
        launch(args);
    }
    
}
