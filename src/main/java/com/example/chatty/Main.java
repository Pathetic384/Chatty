package com.example.chatty;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Main extends Application {


    public static void main(String[] args) throws Exception{

        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Util u = new Util();
        u.newStage(stage,"chat.fxml", "Chat", "src/main/resources/com/example/chatty/media/chat.png");
    }
}