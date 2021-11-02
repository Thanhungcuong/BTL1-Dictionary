module com.example.btl1_6 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.btl1_6 to javafx.fxml;
    exports com.example.btl1_6;
}