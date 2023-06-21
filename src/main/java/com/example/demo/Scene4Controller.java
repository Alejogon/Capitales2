package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class Scene4Controller {
    @FXML
    private AnchorPane Scene4AnchorPane;


    String answer;

    @FXML
    private Label labelSC4;

    @FXML
    protected void initialize(){
        answer = (String) Scene4AnchorPane.getUserData();
        labelSC4.setText(answer);
        System.out.println("Respuesta almacenada - "+ answer);
    }




}
