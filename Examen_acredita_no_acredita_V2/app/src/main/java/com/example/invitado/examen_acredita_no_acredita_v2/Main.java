package com.example.invitado.examen_acredita_no_acredita_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    TextView numAcreditar;
    TextView numCalifa;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SeekBar acreditar = (SeekBar)findViewById(R.id.seekBar);
        SeekBar calificacion = (SeekBar)findViewById(R.id.seekBar2);
        numAcreditar = (TextView)findViewById(R.id.textView3);
        numCalifa = (TextView)findViewById(R.id.textView6);
        display = (TextView)findViewById(R.id.textView7);

        acreditar.setOnSeekBarChangeListener(this);
        calificacion.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (seekBar.getId() == R.id.seekBar) 
            numAcreditar.setText("" + progress);
        else if (seekBar.getId() == R.id.seekBar2)
            numCalifa.setText("" + progress);
        if (Integer.parseInt(numCalifa.getText().toString()) - Integer.parseInt(numAcreditar.getText().toString()) >= 0)
            display.setText("acreditadeichon!!!");
        else display.setText("No pasas, morro. Suerte la proxima");
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
