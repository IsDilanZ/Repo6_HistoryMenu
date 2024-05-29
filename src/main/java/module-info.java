module com.example.repo6_historymenu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repo6_historymenu to javafx.fxml;
    exports com.example.repo6_historymenu;
}