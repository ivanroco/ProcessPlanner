package com.sistemas.processplanner;

import genprocess.ProcessGenerator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    int numProcess;
    String name;
    int identified;
    float memory;
    String priority;
    int burst;
    int inputTime;
    @FXML
    private Button btnPlay;
    @FXML
    private Button btnProcess;
    @FXML
    private ComboBox<String> cmbxPlanner;
    @FXML
    private TableColumn<Proceso, Integer> column1;
    @FXML
    private TableColumn<Proceso, String> column2;
    @FXML
    private TableColumn<Proceso, Integer> column3;
    @FXML
    private TableColumn<Proceso, Float> column4;
    @FXML
    private TableColumn<Proceso, String> column5;
    @FXML
    private TableColumn<Proceso, Integer> column6;
    @FXML
    private TableColumn<Proceso, Integer> column7;
    @FXML
    private TableView<Proceso> tblProcess;
    private ObservableList<Proceso> observableListProcess;

    @FXML
    void gnerateProcess(ActionEvent event) {
        ProcessGenerator.generator();
        numProcess = ProcessGenerator.getCount();
        name = ProcessGenerator.getName();
        identified = ProcessGenerator.getIdentified();
        memory = ProcessGenerator.getMemory();
        priority = ProcessGenerator.getPriority();
        burst = ProcessGenerator.getBurst();
        inputTime = ProcessGenerator.getInputTime();
        Proceso process = new Proceso(numProcess, name, identified, memory, priority, burst, inputTime);
        observableListProcess.add(process);
        tblProcess.setItems(observableListProcess);
    }

    @FXML
    void play(ActionEvent event) {
        if(!cmbxPlanner.getItems().isEmpty()){
            if (!tblProcess.getItems().isEmpty()){
                observableListProcess.remove(0);
            }
        }
    }

    @FXML
    void selectPlanner(ActionEvent event){
        if(cmbxPlanner.getValue().equalsIgnoreCase("Shortest Job First")){
            ShortestJobFirst.sort(observableListProcess);
            observableListProcess.clear();
            observableListProcess.addAll(ShortestJobFirst.getObservableList());
            tblProcess.setItems(observableListProcess);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> observableListPlanners = FXCollections.observableArrayList();
        observableListProcess = FXCollections.observableArrayList();
        observableListPlanners.add("Shortest Job First");
        observableListPlanners.add("Default");
        cmbxPlanner.setItems(observableListPlanners);
        column1.setCellValueFactory(new PropertyValueFactory<>("numProcess"));
        column2.setCellValueFactory(new PropertyValueFactory<>("name"));
        column3.setCellValueFactory(new PropertyValueFactory<>("identified"));
        column4.setCellValueFactory(new PropertyValueFactory<>("memory"));
        column5.setCellValueFactory(new PropertyValueFactory<>("priority"));
        column6.setCellValueFactory(new PropertyValueFactory<>("burst"));
        column7.setCellValueFactory(new PropertyValueFactory<>("inputTime"));
    }
}

