package com.example.sergi.barra_busqueda;

import android.app.*;
import android.os.*;
import android.support.v7.app.AppCompatActivity;
import android.widget.SeekBar.*;
import android.widget.*;
public class MainActivity extends AppCompatActivity{
    private SeekBar sb = null;
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        sb = (SeekBar) findViewById(R.id.xsb2);
        sb.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            int i = 0;
            public void onProgressChanged(SeekBar sb, int n, boolean b){
                i = n;
            }
            public void onStartTrackingTouch(SeekBar sb) { }
            public void onStopTrackingTouch(SeekBar sb) {
                Toast.makeText(MainActivity.this,"Volumen: " + i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

