/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import controller.ConnectionController;
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
import utilDB.sqlserver.dao.DBUtilSQLS;

/**
 *
 * @author kakashi
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     Launcher launcher = new Launcher(primaryStage);
     


    }
    public static void main(String[] args) {
        //TODO ne pas oublier DBUtilSQLS.toConnec()
        //DBUtil.toConnect();
        launch(args);
    }
    
}
