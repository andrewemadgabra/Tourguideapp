package com.example.andrew.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ABU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abu);
        String nameplace = getString(R.string.Buttom2);
        String abuinformation=getString(R.string.abuinformation);
        ArrayList<Place> place = new ArrayList<Place>();
        place.add(new Place(nameplace,R.drawable.abusimbeltemple,abuinformation));
        CustomAdapter placeAdapter = new CustomAdapter(this,place);
        ListView listView = (ListView) findViewById(R.id.listviewabu);
        listView.setAdapter(placeAdapter);
    }
}
