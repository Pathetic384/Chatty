module com.example.chatty {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;
    requires org.json;
    requires javafx.media;
   // requires org.gnome.glib;

    opens com.example.chatty to javafx.fxml;
    exports com.example.chatty;
}