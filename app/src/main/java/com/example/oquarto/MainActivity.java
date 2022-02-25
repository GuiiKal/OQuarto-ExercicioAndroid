package com.example.oquarto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup groupLampada, groupPorta;
    private TextView textViewStatus;
    private String statusPorta, statusLampada;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        groupLampada= findViewById(R.id.RadioGroupLampada);
        groupPorta= findViewById(R.id.RadioGroupPorta);
        textViewStatus = findViewById(R.id.textViewStatus);
    }

    public void onAceitar(View v){
    int idLampada = groupLampada.getCheckedRadioButtonId();
    int idPorta = groupPorta.getCheckedRadioButtonId();
    if(idLampada==R.id.radioButtonAcesa) statusLampada = "Acesa";
    else statusLampada = "Apagada";
    if(idPorta==R.id.radioButtonAberta) statusPorta = "Aberta";
    if(idPorta==R.id.radioButtonFechada) statusPorta = "Fechada";
    if(idPorta==R.id.radioButtonTrancada) statusPorta = "Trancada";

    //criar um objeto da classe quarto
    Quarto q1 = new Quarto(statusLampada, statusPorta);

    //mostrar o resultado na tela
        textViewStatus.setText(q1.mostrarStatus());
    }
}