package com.example.urbanroot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button buttonRegisterCategorias,buttonEstadisticas,
            buttonCosecha,buttonConsejos,
            buttonSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button RegistrarCategorias = findViewById(R.id.buttonRegisterCategorias);
        RegistrarCategorias.setOnClickListener(this::cambiarRegistrarCategorias);

        Button RegistrarEstadistica = findViewById(R.id.buttonEstadisticas);
        RegistrarEstadistica.setOnClickListener(this::cambiarRegistrarEstadistica);

        Button RegistrarCosecha = findViewById(R.id. buttonCosecha);
        RegistrarCosecha.setOnClickListener(this::cambiarRegistrarCosecha);

        Button Consejos = findViewById(R.id. buttonConsejos);
        Consejos.setOnClickListener(this::cambiarConsejos);

        Button Salir = findViewById(R.id.buttonSalir);
        Salir.setOnClickListener(this::cambiarSalir);

    }

    public void cambiarRegistrarCategorias(View view) {
        Intent intent = new Intent(this, Categorias.class);
        startActivity(intent);
    }

    public void cambiarRegistrarEstadistica(View view) {
        Intent intent = new Intent(this, Estadisticas.class);
        startActivity(intent);
    }

    public void cambiarRegistrarCosecha(View view) {
        Intent intent = new Intent(this, Cosecha.class);
        startActivity(intent);
    }

    public void cambiarConsejos(View view) {
        Intent intent = new Intent(this, Consejos.class);
        startActivity(intent);
    }

    public void cambiarSalir(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        ;
        startActivity(intent);
    }

}