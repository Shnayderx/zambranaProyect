package com.tesis.zambranaproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class camaraActivity extends AppCompatActivity {

    private Spinner spinner1, spinner2, spinner3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camara);



        spinner1 = (Spinner)findViewById(R.id.spinner);
        String [] marca = {"Seleccione la marca","Dahua", "Hikvisión"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item_zambrana, marca);
        spinner1.setAdapter(adapter);

        spinner2 = (Spinner)findViewById(R.id.spinner2);
        String [] tipo = {"Seleccione tipo","Metalica", "Plastica"};
        ArrayAdapter <String> adapter2 = new ArrayAdapter<String>(this, R.layout.spinner_item_zambrana, tipo);
        spinner2.setAdapter(adapter2);

        spinner3 = (Spinner)findViewById(R.id.spinner3);
        String [] kit = {"Seleccione el kit","Unidad", "Combo"};
        ArrayAdapter <String> adapter3 = new ArrayAdapter<String>(this, R.layout.spinner_item_zambrana, kit);
        spinner3.setAdapter(adapter3);

    }

    public void Volver (View View){
        Intent voler = new Intent(this, MainActivity.class);
        startActivity(voler);

    }
}