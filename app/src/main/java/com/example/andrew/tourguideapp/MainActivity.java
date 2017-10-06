package com.example.andrew.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button place1 = (Button) findViewById(R.id.Khan);

        place1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(MainActivity.this, Khan.class);
                startActivity(songIntent);
            }
        });
        Button place2 = (Button) findViewById(R.id.Egypt);

        place2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(MainActivity.this, Egypt.class);
                startActivity(songIntent);
            }
        });
        Button place3 = (Button) findViewById(R.id.Giza);

        place3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(MainActivity.this, Giza.class);
                startActivity(songIntent);
            }
        });
        Button place4 = (Button) findViewById(R.id.ABUSIMBEL);

        place4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songIntent = new Intent(MainActivity.this, ABU.class);
                startActivity(songIntent);
            }
        });
    }

}
