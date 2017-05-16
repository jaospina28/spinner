package com.example.jhonny.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    Spinner spinner;
    ToggleButton toggleButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = (ToggleButton)findViewById(R.id.toggle);
        spinner = (Spinner) findViewById(R.id.spinner);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    String[] apellido = { "Ospina", "Zuluaga", "Velez",
                            "Jurado", "Zapata", "Londoño" };

                    ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_dropdown_item_1line, apellido);
                    //arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
                    spinner.setAdapter(arrayAdapter);

                    Toast.makeText(MainActivity.this, "Oprimido", Toast.LENGTH_SHORT).show();
                }else{
                    String[] nombre = { "Jhonny", "Mauricio", "Pablo",
                            "Andres", "Maria", "Camilo" };
                    ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_dropdown_item_1line, nombre);
                    //arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
                    spinner.setAdapter(arrayAdapter);

                    Toast.makeText(MainActivity.this, "No oprimido", Toast.LENGTH_SHORT).show();
                }
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Nombre seleccionado: " + String.valueOf(spinner.getSelectedItem()), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
