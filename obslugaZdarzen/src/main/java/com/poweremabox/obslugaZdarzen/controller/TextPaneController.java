package com.poweremabox.obslugaZdarzen.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class TextPaneController {
    @FXML
    private TextArea text1TextArea;
    @FXML
    private TextArea text2TextArea;

    public TextArea getText1TextArea() {
        return text1TextArea;
    }

    public TextArea getText2TextArea() {
        return text2TextArea;
    }

    public void initialize() {

        text1TextArea.addEventFilter(KeyEvent.KEY_RELEASED, keyEvent ->
                text2TextArea.setText(new StringBuilder(text1TextArea.getText()).reverse().toString()));

        text2TextArea.addEventFilter(KeyEvent.KEY_TYPED, keyEvent -> {
            String text = text2TextArea.getText();
            StringBuilder stringBuilder = new StringBuilder();
            String string = stringBuilder.append(text).reverse().toString();
            text1TextArea.setText(string);
        });

    }

}
