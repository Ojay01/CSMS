module csms {
    requires javafx.controls;
    requires javafx.fxml;

    opens csms to javafx.fxml;
    exports csms;
}
