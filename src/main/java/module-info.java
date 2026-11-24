module com.example.java_assignment_6_1 {

    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.java_assignment_6_1;
    exports view;

    opens com.example.java_assignment_6_1 to javafx.fxml;
}