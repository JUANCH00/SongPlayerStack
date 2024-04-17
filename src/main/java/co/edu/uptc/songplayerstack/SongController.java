package co.edu.uptc.songplayerstack;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.Collections;
import java.util.Random;
import java.util.Stack;

public class SongController {
    private Stack<Song> playList = new Stack<Song>();

    @FXML
    private Label resultLabel;

    @FXML
    private TextField songField;

    @FXML
    private TextField artistField;

    @FXML
    public ListView myListView;



    @FXML
    public void onAddToPlaylistClick(){
        Song song = new Song();
        song.setName(songField.getText());
        song.setArtist(artistField.getText());
        playList.push(song);
        clearFields();
        orderPlayList();
    }

    public void clearFields(){
        songField.clear();
        artistField.clear();
    }

    public void orderPlayList(){
        ObservableList<Song> reversedList = FXCollections.observableArrayList(playList);
        Collections.reverse(reversedList);
        myListView.getItems().clear();
        myListView.getItems().addAll(reversedList);
    }


    @FXML void onPlaySongClick(){
        Random random = new Random();
        if(!playList.isEmpty()){
            Song actualSong = playList.pop();
            myListView.getItems().remove(actualSong);

            int reproductionTime = new Random().nextInt(5)+1;
            try{
                Thread.sleep(reproductionTime* 1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            resultLabel.setText(actualSong.getName() + " by " + actualSong.getArtist() + " has been reproduced");
        }
    }

}
