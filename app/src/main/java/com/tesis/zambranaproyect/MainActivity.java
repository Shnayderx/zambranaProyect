package com.tesis.zambranaproyect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //METODO PARA EL OVERFLOW

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menuoverflow, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId(); //para almacenar el item del id

        if(id == R.id.camara){
            Toast.makeText(this, "Redirigiendo al menu de camaras", Toast.LENGTH_SHORT).show();
            Intent siguiente = new Intent(this, camaraActivity.class);
            startActivity(siguiente);
        } else if(id == R.id.red){
            Toast.makeText(this, "Redirigiendo a redes", Toast.LENGTH_SHORT).show();
            Intent siguiente1 = new Intent(this, camaraActivity.class);
            startActivity(siguiente1);
        }else if(id == R.id.acceso){
            Toast.makeText(this, "Redirigiendo al menú de accesos", Toast.LENGTH_SHORT).show();
            Intent siguiente2 = new Intent(this, camaraActivity.class);
            startActivity(siguiente2);
        }else if(id == R.id.alarma){
            Toast.makeText(this, "Redirigiendo al menú de alarma", Toast.LENGTH_SHORT).show();
            Intent siguiente3 = new Intent(this, camaraActivity.class);
            startActivity(siguiente3);
        }
        return super.onOptionsItemSelected(item);
    }
}