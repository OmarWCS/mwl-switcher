package fr.wcs.monster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bestiaire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bestiaire);
        Button buttonSwitch = (Button)findViewById(R.id.buttonSwitch);

        buttonSwitch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent toSwitcher = new Intent(Bestiaire.this, Switcher.class);
                startActivity(toSwitcher);

            }
        });

    }
}