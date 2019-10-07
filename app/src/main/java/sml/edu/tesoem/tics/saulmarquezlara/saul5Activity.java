package sml.edu.tesoem.tics.saulmarquezlara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class saul5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saul5);
    }
    public void menu(View v){

        Intent principal= new Intent(this,saul2Activity.class);
        startActivity(principal);
        finish();
    }
}
