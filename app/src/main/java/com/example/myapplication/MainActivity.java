package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        // Creamos la Variable del Boton.
    private Button boton;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buscamos un componente visual por su id.

    boton = findViewById(R.id.asdfg);
    editText = findViewById(R.id.qwertyh);

        // Queremos asignar un escuchador.

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){


                //Imprimir una tostada.
                editText = findViewById(R.id.qwertyh);
                String nombre = editText.getText().toString();
                Toast.makeText(MainActivity.this,nombre,Toast.LENGTH_LONG).show();

            }





        });



    }
}
