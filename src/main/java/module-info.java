module com.sistemas.processplanner {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sistemas.processplanner to javafx.fxml;
    exports com.sistemas.processplanner;
    exports com.sistemas.processplanner.planner;
    opens com.sistemas.processplanner.planner to javafx.fxml;
}