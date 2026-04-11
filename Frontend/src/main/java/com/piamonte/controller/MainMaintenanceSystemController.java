package com.piamonte.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class MainMaintenanceSystemController {
    @FXML
    private void OnCreate(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com.piamonte.maintenance/Create.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void OnEdit(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com.piamonte.maintenance/Edit.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void OnDelete(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com.piamonte.maintenance/Delete.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void OnClose(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
} 