package com.poweremabox.obslugaZdarzen.controller;

import javafx.fxml.FXML;

public class MainController {

    @FXML
    private TextPaneController textPaneController;
    @FXML
    private ButtonPaneController buttonPaneController;

    public void initialize(){
        System.out.println(textPaneController);
        System.out.println(buttonPaneController);

        buttonPaneController.getButton1Button().setOnAction(x->{
            textPaneController.getText1TextArea().clear();
            textPaneController.getText2TextArea().clear();
        });
    }



}
