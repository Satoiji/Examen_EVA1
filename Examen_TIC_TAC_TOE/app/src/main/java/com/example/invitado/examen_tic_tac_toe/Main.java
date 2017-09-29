package com.example.invitado.examen_tic_tac_toe;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reinicio;
    TextView ganador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button_1);
        b2 = (Button)findViewById(R.id.button_2);
        b3 = (Button)findViewById(R.id.button_3);
        b4 = (Button)findViewById(R.id.button_4);
        b5 = (Button)findViewById(R.id.button_5);
        b6 = (Button)findViewById(R.id.button_6);
        b7 = (Button)findViewById(R.id.button_7);
        b8 = (Button)findViewById(R.id.button_8);
        b9 = (Button)findViewById(R.id.button_9);
        reinicio = (Button)findViewById(R.id.button_restart);
        ganador = (TextView)findViewById(R.id.textView_ganador);
        restart(findViewById(R.id.textView_ganador));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_main);
            b1 = (Button)findViewById(R.id.button_1);
            b2 = (Button)findViewById(R.id.button_2);
            b3 = (Button)findViewById(R.id.button_3);
            b4 = (Button)findViewById(R.id.button_4);
            b5 = (Button)findViewById(R.id.button_5);
            b6 = (Button)findViewById(R.id.button_6);
            b7 = (Button)findViewById(R.id.button_7);
            b8 = (Button)findViewById(R.id.button_8);
            b9 = (Button)findViewById(R.id.button_9);
            reinicio = (Button)findViewById(R.id.button_restart);
            ganador = (TextView)findViewById(R.id.textView_ganador);
            restart(findViewById(R.id.textView_ganador));

        } else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.layout_landscape);
            b1 = (Button) findViewById(R.id.button_1l);
            b2 = (Button) findViewById(R.id.button_2l);
            b3 = (Button) findViewById(R.id.button_3l);
            b4 = (Button) findViewById(R.id.button_4l);
            b5 = (Button) findViewById(R.id.button_5l);
            b6 = (Button) findViewById(R.id.button_6l);
            b7 = (Button) findViewById(R.id.button_7l);
            b8 = (Button) findViewById(R.id.button_8l);
            b9 = (Button) findViewById(R.id.button_9l);
            reinicio = (Button) findViewById(R.id.button_restartl);
            ganador = (TextView) findViewById(R.id.textView_ganadorl);
            restart(findViewById(R.id.textView_ganadorl));
        }
    }

    boolean X = true;
    boolean winner = false;

    public void toggleButton(View v){
        if(!winner) {
            if (v.getId() == R.id.button_1 || v.getId() == R.id.button_1l) {
                b1.setEnabled(!b1.isEnabled());
                if (X) b1.setText("X");
                else b1.setText("O");
            }
            if (v.getId() == R.id.button_2 || v.getId() == R.id.button_2l) {
                b2.setEnabled(!b2.isEnabled());
                if (X) b2.setText("X");
                else b2.setText("O");
            }
            if (v.getId() == R.id.button_3 || v.getId() == R.id.button_3l) {
                b3.setEnabled(!b3.isEnabled());
                if (X) b3.setText("X");
                else b3.setText("O");
            }
            if (v.getId() == R.id.button_4 || v.getId() == R.id.button_4l) {
                b4.setEnabled(!b4.isEnabled());
                if (X) b4.setText("X");
                else b4.setText("O");
            }
            if (v.getId() == R.id.button_5 || v.getId() == R.id.button_5l) {
                b5.setEnabled(!b5.isEnabled());
                if (X) b5.setText("X");
                else b5.setText("O");
            }
            if (v.getId() == R.id.button_6 || v.getId() == R.id.button_6l) {
                b6.setEnabled(!b6.isEnabled());
                if (X) b6.setText("X");
                else b6.setText("O");
            }
            if (v.getId() == R.id.button_7 || v.getId() == R.id.button_7l) {
                b7.setEnabled(!b7.isEnabled());
                if (X) b7.setText("X");
                else b7.setText("O");
            }
            if (v.getId() == R.id.button_8 || v.getId() == R.id.button_8l) {
                b8.setEnabled(!b8.isEnabled());
                if (X) b8.setText("X");
                else b8.setText("O");
            }
            if (v.getId() == R.id.button_9 || v.getId() == R.id.button_9l) {
                b9.setEnabled(!b9.isEnabled());
                if (X) b9.setText("X");
                else b9.setText("O");
            }

            X = !X;
            winner();
        }

    }

    private void winner(){
        //fuerza bruta bien a la brava yolo
        if (b1.getText() == b2.getText() && b2.getText() == b3.getText() && b1.getText().toString() != "-"){
            winner = true;
            if (b1.getText() == "X") ganador.setText("GANA X"); else ganador.setText("GANA O");
        }
        if (b4.getText() == b5.getText() && b5.getText() == b6.getText() && b4.getText().toString() != "-"){
            winner = true;
            if (b4.getText() == "X") ganador.setText("GANA X"); else ganador.setText("GANA O");
        }
        if (b7.getText() == b8.getText() && b8.getText() == b9.getText() && b7.getText().toString() != "-"){
            winner = true;
            if (b7.getText() == "X") ganador.setText("GANA X"); else ganador.setText("GANA O");
        }
        if (b1.getText() == b4.getText() && b4.getText() == b7.getText() && b1.getText().toString() != "-"){
            winner = true;
            if (b1.getText() == "X") ganador.setText("GANA X"); else ganador.setText("GANA O");
        }
        if (b2.getText() == b5.getText() && b5.getText() == b8.getText() && b2.getText().toString() != "-"){
            winner = true;
            if (b2.getText() == "X") ganador.setText("GANA X"); else ganador.setText("GANA O");
        }
        if (b3.getText() == b6.getText() && b6.getText() == b9.getText() && b3.getText().toString() != "-"){
            winner = true;
            if (b3.getText() == "X") ganador.setText("GANA X"); else ganador.setText("GANA O");
        }
        if (b1.getText() == b5.getText() && b5.getText() == b9.getText() && b1.getText().toString() != "-"){
            winner = true;
            if (b1.getText() == "X") ganador.setText("GANA X"); else ganador.setText("GANA O");
        }
        if (b3.getText() == b5.getText() && b5.getText() == b7.getText() && b3.getText().toString() != "-"){
            winner = true;
            if (b3.getText() == "X") ganador.setText("GANA X"); else ganador.setText("GANA O");
        }
    }

    public void restart(View v){
        b1.setText("-");
        b1.setEnabled(true);
        b2.setText("-");
        b2.setEnabled(true);
        b3.setText("-");
        b3.setEnabled(true);
        b4.setText("-");
        b4.setEnabled(true);
        b5.setText("-");
        b5.setEnabled(true);
        b6.setText("-");
        b6.setEnabled(true);
        b7.setText("-");
        b7.setEnabled(true);
        b8.setText("-");
        b8.setEnabled(true);
        b9.setText("-");
        b9.setEnabled(true);
        winner = false;
        ganador.setText("JUGANDO");
        X = true;
    }
}
