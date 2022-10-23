module exp.disk {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens exp.disk to javafx.fxml;
    exports exp.disk;
}