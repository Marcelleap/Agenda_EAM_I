package com.example;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    // Método que permite que o EntradaFragment envie compromissos para a VisualizacaoFragment
    public void adicionarCompromisso(Compromisso compromisso) {
        VisualizacaoFragment fragment = (VisualizacaoFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_visualizacao);
        if (fragment != null) {
            fragment.adicionarCompromisso(compromisso);
        }
    }
}
