package com.example.sergi.botones_ejemplo2;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.widget.Toast;
import android.support.design.widget.FloatingActionButton;
public class MainActivity extends Activity {
    FloatingActionButton jfab;
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        jfab = findViewById(R.id.xfab);
        jfab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Soy un botón Flotante!", Toast.LENGTH_LONG).show();
            }
        });
    }
}