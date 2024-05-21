module com.example.demo1111 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo1111 to javafx.fxml;
    exports com.example.demo1111;
}