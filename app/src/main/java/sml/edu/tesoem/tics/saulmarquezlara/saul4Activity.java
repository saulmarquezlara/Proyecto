package sml.edu.tesoem.tics.saulmarquezlara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class saul4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saul4);
    }
    public void menu(View v){

        Intent principal= new Intent(this,saul2Activity.class);
        startActivity(principal);
        finish();
    }
}
