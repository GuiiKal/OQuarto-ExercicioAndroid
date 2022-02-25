package com.example.oquarto;

import android.view.View;

public class Quarto {
    private String statusLampada, statusPorta;

    //construtor
    public Quarto(String statusLampada, String statusPorta) {
        this.statusLampada = statusLampada;
        this.statusPorta = statusPorta;
    }
    //metodo
    public String mostrarStatus(){
        return "Lampada: " + statusLampada + "\nPorta: " + statusPorta;
    }
}
