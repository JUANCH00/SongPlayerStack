package co.edu.uptc.songplayerstack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class SongApp extends Application {


    @Override
    public void start(Stage primarystage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(SongApp.class.getResource("song-view.fxml"));

    Scene scene = new Scene(fxmlLoader.load(), 800,600);
    primarystage.setTitle("Music");
    primarystage.setScene(scene);
    primarystage.show();
    }

    public static void main(String[] args){
        launch(args);
    }

}
