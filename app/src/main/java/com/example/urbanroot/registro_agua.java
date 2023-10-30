package com.example.urbanroot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registro_agua extends AppCompatActivity {

    Button buttoninicio,buttonSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_agua);

        Button Salir = findViewById(R.id.buttonSalir);
        Salir.setOnClickListener(this::cambiarSalir);

        Button Inicio = findViewById(R.id. buttoninicio);
        Inicio.setOnClickListener(this::cambiarInicio);
    }

    public void cambiarSalir(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        ;
        startActivity(intent);
    }

    public void cambiarInicio(View view) {
        Intent intent = new Intent(this, Home.class);
        ;
        startActivity(intent);
    }

}