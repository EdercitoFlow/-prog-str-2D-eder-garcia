module com.example.demologin {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.login to javafx.fxml;
    exports com.example.login;
}