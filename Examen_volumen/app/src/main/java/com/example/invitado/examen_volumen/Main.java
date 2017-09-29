package com.example.invitado.examen_volumen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Main extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{

    TextView angulo;
    EditText radio;
    SeekBar seekAngulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angulo = (TextView)findViewById(R.id.textView_angulo);
        radio = (EditText)findViewById(R.id.editText_radio);
        seekAngulo = (SeekBar)findViewById(R.id.seekBar_angulo);
        seekAngulo.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        angulo.setText(""+progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    public void calcular(View v){
        //V = (2/3)(angulo * radio * 3)
        try {
            int ang = Integer.parseInt(angulo.getText().toString());
            float rad = Float.parseFloat(radio.getText().toString());
            float volumen = 0;
            if (rad > 0)
                volumen = (2f / 3f) * (ang * rad * 3);
            Toast.makeText(this, "" + volumen, Toast.LENGTH_SHORT).show();
        } catch(Exception e){
            Toast.makeText(this, "Ingresa un radio, morrotl", Toast.LENGTH_SHORT).show();
        }
    }
}
