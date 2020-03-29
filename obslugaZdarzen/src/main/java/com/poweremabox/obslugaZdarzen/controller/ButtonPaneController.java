package com.poweremabox.obslugaZdarzen.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ButtonPaneController {

    @FXML
    private Button button1Button;

    public Button getButton1Button() {
        return button1Button;
    }

    public void initialize() {

        button1Button.setText("Clear Windows");

    }
}
