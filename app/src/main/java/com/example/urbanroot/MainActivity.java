package com.example.urbanroot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonIniciarSesion,buttonRegistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button iniciarSesion = findViewById(R.id.buttonIniciarSesion);
        iniciarSesion.setOnClickListener(this::cambiarInicio);

        Button Registrarse = findViewById(R.id.buttonRegistrar);
        Registrarse.setOnClickListener(this::cambiarRegistrarse);


    }

    public void cambiarInicio(View view){

        Intent intent = new Intent(this, Inicio.class);;
        startActivity(intent);
    }

    public void cambiarRegistrarse(View view){

        Intent intent = new Intent(this, Registrarse.class);;
        startActivity(intent);
    }
}