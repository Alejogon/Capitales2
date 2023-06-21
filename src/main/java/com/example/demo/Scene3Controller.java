package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.RadioButton;

import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.scene.control.Button;
import java.io.IOException;
import java.util.Arrays;


public class Scene3Controller {

    @FXML
    private Button btnResponder;

    @FXML
    private Button btnSiguiente;
    @FXML
    private Label labelInit;
    @FXML
    private Label score;
    @FXML
    private Label respuesta;
    @FXML
    private ImageView mapa;
    @FXML
    private RadioButton respuesta1;
    @FXML
    private RadioButton respuesta2;
    @FXML
    private RadioButton respuesta3;
    @FXML
    private RadioButton respuesta4;
    @FXML
    private TextFlow labelDescripcion;

    juego game = new juego();
    pregunta question = game.generarPregunta();
    String RandomMap;
    String respuestaUsuario;
    String respuestaCorrecta;
    Text Desc;

    @FXML
    protected void initialize(){
        labelInit.setText(question.getDepartamento());

        Desc = new Text(question.getDescripcion());

        labelDescripcion.getChildren().clear();
        labelDescripcion.getChildren().add(Desc);
        RandomMap = question.getCodigo() + ".png";
        Image mapaMostrar = new Image(getClass().getResourceAsStream(RandomMap));
        mapa.setImage(mapaMostrar);
        String Respuestas[] = question.generarOpciones();
        Arrays.sort(Respuestas);
        respuestaCorrecta = question.getCapital();
        labelDescripcion.setVisible(false);
        btnSiguiente.setVisible(false);


        respuesta1.setText(Respuestas[0]);
        respuesta2.setText(Respuestas[1]);
        respuesta3.setText(Respuestas[2]);
        respuesta4.setText(Respuestas[3]);
        score.setText(Integer.toString(game.getAciertos())+" / " + Integer.toString(game.getPreguntasRealizadas()));
    }
    @FXML
    protected void nuevaPregunta(){
        pregunta question = game.generarPregunta();
        labelInit.setText(question.getDepartamento());

        Desc = new Text(question.getDescripcion());

        labelDescripcion.getChildren().clear();
        labelDescripcion.getChildren().add(Desc);


        //System.out.println(question.getDescripcion());
        RandomMap = question.getCodigo() + ".png";
        Image mapaMostrar = new Image(getClass().getResourceAsStream(RandomMap));
        mapa.setImage(mapaMostrar);
        respuestaCorrecta = question.getCapital();
        String Respuestas[] = question.generarOpciones();
        Arrays.sort(Respuestas);

        respuesta1.setText(Respuestas[0]);
        respuesta1.setVisible(true);
        respuesta2.setText(Respuestas[1]);
        respuesta2.setVisible(true);
        respuesta3.setText(Respuestas[2]);
        respuesta3.setVisible(true);
        respuesta4.setText(Respuestas[3]);
        respuesta4.setVisible(true);
        respuesta.setVisible(false);
        labelDescripcion.setVisible(false);
        btnResponder.setVisible(true);
        btnSiguiente.setVisible(false);
        score.setText(Integer.toString(game.getAciertos())+" / " + Integer.toString(game.getPreguntasRealizadas()));

    }

    @FXML
    protected void responder(ActionEvent event) throws IOException {
        if(respuesta1.isSelected()){

            respuestaUsuario = respuesta1.getText();
            respuesta1.setVisible(false);
            respuesta2.setVisible(false);
            respuesta3.setVisible(false);
            respuesta4.setVisible(false);
            if(respuestaUsuario.equals(respuestaCorrecta)){
                respuesta.setText("respuesta correcta");
                respuesta.setStyle("-fx-text-fill: green;");

                labelDescripcion.setVisible(true);
                btnResponder.setVisible(false);
                btnSiguiente.setVisible(true);
                game.sumaracierto();
                game.sumarPreguntaRealizada();
            }
            else {
                respuesta.setText("respuesta incorrecta");
                respuesta.setStyle("-fx-text-fill: red;");

                labelDescripcion.setVisible(true);

                btnResponder.setVisible(false);
                btnSiguiente.setVisible(true);

                game.sumarPreguntaRealizada();

            }
            respuesta.setVisible(true);

        }
        if(respuesta2.isSelected()){

            respuestaUsuario = respuesta2.getText();

            respuesta1.setVisible(false);
            respuesta2.setVisible(false);
            respuesta3.setVisible(false);
            respuesta4.setVisible(false);
            if(respuestaUsuario.equals(respuestaCorrecta)){
                respuesta.setText("respuesta correcta");
                respuesta.setStyle("-fx-text-fill: green;");
                labelDescripcion.setVisible(true);


                btnResponder.setVisible(false);
                btnSiguiente.setVisible(true);
                game.sumaracierto();
                game.sumarPreguntaRealizada();


            }
            else {
                respuesta.setText("respuesta incorrecta");
                respuesta.setStyle("-fx-text-fill: red;");
                labelDescripcion.setVisible(true);


                btnResponder.setVisible(false);
                btnSiguiente.setVisible(true);
                game.sumarPreguntaRealizada();

            }
            respuesta.setVisible(true);
        }
        if(respuesta3.isSelected()){

            respuestaUsuario = respuesta3.getText();

            respuesta1.setVisible(false);
            respuesta2.setVisible(false);
            respuesta3.setVisible(false);
            respuesta4.setVisible(false);
            if(respuestaUsuario.equals(respuestaCorrecta)){
                respuesta.setText("respuesta correcta");
                respuesta.setStyle("-fx-text-fill: green;");

                labelDescripcion.setVisible(true);

                btnResponder.setVisible(false);
                btnSiguiente.setVisible(true);
                game.sumaracierto();
                game.sumarPreguntaRealizada();

            }
            else {
                respuesta.setText("respuesta incorrecta");
                respuesta.setStyle("-fx-text-fill: red;");
                labelDescripcion.setVisible(true);


                btnResponder.setVisible(false);
                btnSiguiente.setVisible(true);
                game.sumarPreguntaRealizada();

            }
            respuesta.setVisible(true);
        }
        if(respuesta4.isSelected()){

            respuestaUsuario = respuesta4.getText();

            respuesta1.setVisible(false);
            respuesta2.setVisible(false);
            respuesta3.setVisible(false);
            respuesta4.setVisible(false);
            if(respuestaUsuario.equals(respuestaCorrecta)){
                respuesta.setText("respuesta correcta");
                respuesta.setStyle("-fx-text-fill: green;");

                labelDescripcion.setVisible(true);

                btnResponder.setVisible(false);
                btnSiguiente.setVisible(true);
                game.sumaracierto();
                game.sumarPreguntaRealizada();

            }
            else {
                respuesta.setText("respuesta incorrecta");
                respuesta.setStyle("-fx-text-fill: red;");


                labelDescripcion.setVisible(true);

                btnResponder.setVisible(false);
                btnSiguiente.setVisible(true);
                game.sumarPreguntaRealizada();
            }
            respuesta.setVisible(true);
        }

    }




}
