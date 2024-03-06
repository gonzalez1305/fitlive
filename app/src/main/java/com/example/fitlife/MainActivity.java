package com.example.fitlife;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.RemoteInput;

public class MainActivity extends AppCompatActivity {

    EditText nombre, apellido, edad, peso, altura;
    Spinner objetivo_fisico;
    RadioButton femenino, masculino;
    Button guardar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre=(EditText) findViewById(R.id.nombre);
        apellido=(EditText) findViewById(R.id.apellido);
        edad=(EditText) findViewById(R.id.edad);
        peso=(EditText) findViewById(R.id.peso);
        altura=(EditText) findViewById(R.id.altura);
    }
}
