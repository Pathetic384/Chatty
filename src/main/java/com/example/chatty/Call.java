package com.example.chatty;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Call implements Initializable {
    MediaPlayer player;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String uriString = new File("src/main/resources/com/example/chatty/mus.mp3").toURI().toString();
        player = new MediaPlayer( new Media(uriString));
        player.play();
        player.setCycleCount(MediaPlayer.INDEFINITE);

        Chat.groot.setDisable(true);
    }

    public void Exit(ActionEvent event) {
        player.pause();
        Chat.groot.setDisable(false);
        Util.Exit(event);
    }
}
