package com.example.chatty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;


public class Video implements Initializable {
    @FXML
    MediaView video;
    @FXML
    ImageView bk;
    MediaPlayer mpVideo;
    Media mediaVideo;
    String source = "vid.mp4";
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        InputStream stream = null;
        try {stream = new FileInputStream("src/main/resources/com/example/chatty/media/busy.jpg");
        } catch (FileNotFoundException e) {}
        Image image = new Image(stream);

        mediaVideo = new Media(new File("src/main/resources/com/example/chatty/vid.mp4").toURI().toString());
        mpVideo = new MediaPlayer(mediaVideo);
        video.setMediaPlayer(mpVideo);
        mpVideo.play();
        mpVideo.setCycleCount(MediaPlayer.INDEFINITE);

        Chat.groot.setDisable(true);

        mpVideo.setOnError(()-> {
            System.out.println("media error" + mpVideo.getError().toString());
            bk.setImage(image);
        });

    }

    public void Exit(ActionEvent event) {
        mpVideo.pause();
        Chat.groot.setDisable(false);
        Util.Exit(event);
    }
}
