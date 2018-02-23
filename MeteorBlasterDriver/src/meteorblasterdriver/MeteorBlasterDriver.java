/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteorblasterdriver;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import MeteorBlasterGUI2.ProfilePane;

/**
 *
 * @author kelvin
 */
public class MeteorBlasterDriver extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       Parameters params = this.getParameters();
        
        //GamePane root = new GamePane(params.getRaw().get(0), params.getRaw().get(1));
        
        ProfilePane root = new ProfilePane(params.getRaw().get(1), 
            params.getRaw().get(0), primaryStage);
        
        Scene scene = new Scene(root, 400, 400);
        
        primaryStage.setTitle("Meteor Blaster");
        primaryStage.setScene(scene);
        primaryStage.show();
        root.requestFocus();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
