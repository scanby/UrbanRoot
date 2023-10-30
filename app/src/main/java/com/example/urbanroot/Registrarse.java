package com.example.urbanroot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registrarse extends AppCompatActivity {

    Button buttonRegister, buttonSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        Button Registrado = findViewById(R.id.buttonRegister);
        Registrado.setOnClickListener(this::cambiarRegistrado);

        Button Salir = findViewById(R.id.buttonSalir);
        Salir.setOnClickListener(this::cambiarSalir);

    }
    public void cambiarSalir(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        ;
        startActivity(intent);
    }

    public void cambiarRegistrado(View view) {

        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}