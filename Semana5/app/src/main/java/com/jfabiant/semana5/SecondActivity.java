package com.jfabiant.semana5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView txtNombres;
    private TextView txtOcupacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        /*
        txtNombres = (TextView)findViewById(R.id.txtNombres);

        //Recibe el valor:
        Bundle bundle = getIntent().getExtras();
        String nombres = bundle.getString("nombres");

        //Agrega el valor a la caja de texto:
        txtNombres.setText(nombres);
        */
    }
}
