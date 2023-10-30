package com.example.urbanroot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {

    Button buttonLogin, buttonRegistrar, buttonSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button Login = findViewById(R.id.buttonLogin);
        Login.setOnClickListener(this::cambiarLogin);

        Button Registrarse = findViewById(R.id.buttonRegistrar);
        Registrarse.setOnClickListener(this::cambiarRegistrarse);

        Button Salir = findViewById(R.id.buttonSalir);
        Salir.setOnClickListener(this::cambiarSalir);


    }

    public void cambiarLogin(View view) {
        Intent intent = new Intent(this, Home.class);
        ;
        startActivity(intent);
    }

    public void cambiarSalir(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        ;
        startActivity(intent);
    }

    public void cambiarRegistrarse(View view) {

        Intent intent = new Intent(this, Registrarse.class);
        startActivity(intent);
    }





}