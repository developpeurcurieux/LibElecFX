/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import controller.*;
import javafx.scene.image.Image;
import javafx.stage.Stage;
        
public class Launcher {
    private Stage primaryStage;
    private ConnectionController connectionController;
    private MenuController menuController;
    
    public Launcher(Stage primaryStage) {
        this.primaryStage = primaryStage;
        connectionController = new ConnectionController(primaryStage, this);
    }
    
    public void loadMenuScene() {
        menuController = new MenuController(primaryStage, this);
    }
    
    

    
}
