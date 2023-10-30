package com.example.urbanroot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Categorias extends AppCompatActivity {

    Button RegistrarCultivo,RegistrarAgua,RegistrarAbono,
            buttoninicio,buttonSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorias);

        Button RegistrarCultivo = findViewById(R.id.RegistrarCultivo);
        RegistrarCultivo.setOnClickListener(this::cambiarRegistrarCultivo);

        Button registrarAgua = findViewById(R.id.RegistrarAgua);
        registrarAgua.setOnClickListener(this::cambiarregistrarAgua);

        Button registrarAbono = findViewById(R.id.RegistrarAbono);
        registrarAbono.setOnClickListener(this::cambiarRegistrarAbono);

        Button Salir = findViewById(R.id.buttonSalir);
        Salir.setOnClickListener(this::cambiarSalir);

        Button Inicio = findViewById(R.id. buttoninicio);
        Inicio.setOnClickListener(this::cambiarInicio);

    }

    public void cambiarRegistrarCultivo(View view) {
        Intent intent = new Intent(this, Cultivos.class);
        ;
        startActivity(intent);
    }

    public void cambiarregistrarAgua(View view) {
        Intent intent = new Intent(this, registro_agua.class);
        ;
        startActivity(intent);
    }

    public void cambiarRegistrarAbono(View view) {
        Intent intent = new Intent(this, RegistroAbono.class);
        ;
        startActivity(intent);
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