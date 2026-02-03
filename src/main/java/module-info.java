module com.example.demo2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo2.controller to javafx.fxml;
    exports com.example.demo2;
}