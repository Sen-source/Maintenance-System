package com.piamonte.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class DeleteController {
    @FXML
    private void OnDelete(ActionEvent event) throws Exception {
        // TODO: Implement delete logic (API call)
        Parent root = FXMLLoader.load(getClass().getResource("/com.piamonte.maintenance/Main maintenance system.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
    }

    @FXML
    private void OnCancel(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com.piamonte.maintenance/Main maintenance system.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
    }
} 