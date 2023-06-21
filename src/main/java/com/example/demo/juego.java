package com.example.demo;

public class juego {
    //constructor
    public juego(){}
    int preguntasRealizadas = 0;
    int aciertos = 0;
    String Respuesta;
    public pregunta generarPregunta(){
        pregunta nuevaPregunta = new pregunta();
        return nuevaPregunta;
    }

    public void sumarPreguntaRealizada (){
        preguntasRealizadas++;

    }
    public void sumaracierto (){
        aciertos++;
    }
    public int getPreguntasRealizadas(){
        return preguntasRealizadas;
    }
    public int getAciertos(){
        return aciertos;
    }

}


