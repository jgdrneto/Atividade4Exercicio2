package com.example.neto.atividade4exercicio2;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class CounterTask extends AsyncTask<Integer,Integer,Void>{

    private Button button;
    private ProgressBar progressBar;

    public CounterTask(Button nButton, ProgressBar nProgressBar) {
        this.button = nButton;
        this.progressBar = nProgressBar;
    }

    @Override
    protected void onPreExecute() {
        button.setEnabled(false);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        button.setEnabled(true);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {

        this.progressBar.setProgress(values[0]);
    }

    @Override
    protected Void doInBackground(Integer... params) {

        int sleep = params[0];

        for(int i=0; i<=progressBar.getMax();i++){
            SystemClock.sleep(sleep);
            publishProgress(i);
        }

        return null;

    }
}
