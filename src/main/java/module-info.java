module co.edu.uptc.songplayerstack {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uptc.songplayerstack to javafx.fxml;
    exports co.edu.uptc.songplayerstack;
}