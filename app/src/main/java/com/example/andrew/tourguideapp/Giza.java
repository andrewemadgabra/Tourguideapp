package com.example.andrew.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Giza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giza);
        ArrayList<Place> place = new ArrayList<Place>();
        String nameplace = getString(R.string.Buttom3);
        String gizainformation = getString(R.string.gizainformation);
        place.add(new Place(nameplace,R.drawable.pyramidsofgiza,gizainformation));
        CustomAdapter placeAdapter = new CustomAdapter(this,place);
        ListView listView = (ListView) findViewById(R.id.listviewgiza);
        listView.setAdapter(placeAdapter);
    }
}
