module exp.disk {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;
    opens exp.disk.Main to javafx.fxml;
    exports exp.disk.Main;
}