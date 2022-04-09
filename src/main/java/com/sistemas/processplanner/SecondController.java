package com.sistemas.processplanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class SecondController {

    @FXML
    private TableColumn<?, ?> ColumnPage;

    @FXML
    private Button btnExit;

    @FXML
    private TableColumn<?, ?> columnDirection;

    @FXML
    private TableColumn<?, ?> columnID;

    @FXML
    private TableColumn<?, ?> columnMemUsed;

    @FXML
    private Label lblFreeMemory;

    @FXML
    private Label lblTotalMemory;

    @FXML
    private TableView<?> tblMemory;

    @FXML
    void exit(ActionEvent event) {
        Stage stage = (Stage) this.btnExit.getScene().getWindow();
        stage.close();
    }

}
