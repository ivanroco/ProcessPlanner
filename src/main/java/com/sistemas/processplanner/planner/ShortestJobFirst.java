package com.sistemas.processplanner.planner;

import com.sistemas.processplanner.Proceso;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ShortestJobFirst {

    private static ObservableList<Proceso> observableList =  FXCollections.observableArrayList();

    public static void sort(ObservableList<Proceso> list){
        observableList.clear();
        observableList.addAll(list);
        if(!observableList.isEmpty()){
            for (int i = 0; i < observableList.size() - 2; i++){
                for (int j = 0;  j < observableList.size() - 1; j++){
                    if(observableList.get(j).getBurst() > observableList.get(j + 1).getBurst()){
                        Proceso aux = observableList.get(j);
                        observableList.set(j, observableList.get(j + 1));
                        observableList.set(j + 1, aux);
                    }
                }
            }
        }
    }

    public static ObservableList<Proceso> getObservableList() {
        return observableList;
    }
}