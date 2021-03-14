package com.example.gato02errores;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class resultados extends AppCompatActivity {
    TextView tvTituloV2;
    TextView tvResultados;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        tvTituloV2 = findViewById(R.id.tvTituloA2);
        tvResultados = findViewById(R.id.etmlResulatdos);

        Intent intent = getIntent();
        //Bundle paquete = intent.getBundleExtra("paquete");
        ArrayList<Ganadores> ganador = (ArrayList<Ganadores>) intent.getSerializableExtra("ganadores");

        String ganadores = "";
        for (int i = 0; i < ganador.size(); i++)
            ganadores = ganadores + "Ganador: " + ganador.get(i).getNombre() + " puntos ganados: " + ganador.get(i).getPuntuacion() + "\n";

        tvResultados.setText(ganadores);
    }
}