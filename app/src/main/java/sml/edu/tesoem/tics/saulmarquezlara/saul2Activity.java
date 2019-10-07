package sml.edu.tesoem.tics.saulmarquezlara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class saul2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saul2);
    }

    public void cargaraccion(View v){

        Intent accion= new Intent(this,saul3Activity.class);
        startActivity(accion);
        finish();
    }
    public void cargarclasica(View v){

        Intent clasica= new Intent(this,saul5Activity.class);
        startActivity(clasica);
        finish();
    }
    public void cargarficcion(View v){

        Intent ficcion= new Intent(this,saul4Activity.class);
        startActivity(ficcion);
        finish();
    }
    public void cargarcomedia(View v){

        Intent comedia= new Intent(this,saul6Activity.class);
        startActivity(comedia);
        finish();
    }
    public void cargardrama(View v){

        Intent drama= new Intent(this,saul7Activity.class);
        startActivity(drama);
        finish();
    }
    public void cargarinfantil(View v){

        Intent infantil= new Intent(this,saul8Activity.class);
        startActivity(infantil);
        finish();
    }
    public void cargarromance(View v){

        Intent romance= new Intent(this,saul10Activity.class);
        startActivity(romance);
        finish();
    }
    public void cargarsuspenso(View v){

        Intent suspenso= new Intent(this,saul11Activity.class);
        startActivity(suspenso);
        finish();
    }
    public void cargarterror(View v){

        Intent terror= new Intent(this,saul12Activity.class);
        startActivity(terror);
        finish();
    }
    public void cargarmusical(View v){

        Intent musical= new Intent(this,saul9Activity.class);
        startActivity(musical);
        finish();
    }
}
