package com.example.neto.atividade4exercicio2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button button;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn_iniciar);
        progressBar = findViewById(R.id.progressBar);

    }

    public void iniciar(View view) {
        CounterTask task = new CounterTask(button,progressBar);
        task.execute(100);
    }
}
