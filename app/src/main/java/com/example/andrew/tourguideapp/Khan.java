package com.example.andrew.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Khan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khan);
        String nameplace = getString(R.string.Buttom1);
        String information = getString(R.string.khaninformation);
        String informationother = getString(R.string.khaninformation1);
        ArrayList<Place> place = new ArrayList<Place>();
        place.add(new Place(nameplace,R.drawable.khan,information));
        place.add(new Place(nameplace,  R.drawable.cairokhan,informationother));
        CustomAdapter placeAdapter = new CustomAdapter(this,place);
        ListView listView = (ListView) findViewById(R.id.listviewKhan);
        listView.setAdapter(placeAdapter);
    }
}
