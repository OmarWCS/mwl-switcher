package fr.wcs.monster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonCreation = (Button)findViewById(R.id.buttonCreation);
        Button buttonBestiaire = (Button)findViewById(R.id.buttonBestiaire);

        buttonCreation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toSearch = new Intent(MainActivity.this, Creation.class);
                startActivity(toSearch);

            }
        });

        buttonBestiaire.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toSearch = new Intent(MainActivity.this, Bestiaire.class);
                startActivity(toSearch);

            }
        });
    }
}
