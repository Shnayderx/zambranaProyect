package com.tesis.zambranaproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class alarmaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarma);
    }
    public void Volver (View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);

    }

}