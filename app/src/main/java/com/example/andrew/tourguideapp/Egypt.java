package com.example.andrew.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class Egypt extends AppCompatActivity {
    //CustomAdapter test =new CustomAdapter(this,new ArrayList<Place>());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egypt);
        String nameplace = getString(R.string.Buttom2);
        String information = getString(R.string.egyptinformation);
        ArrayList<Place> place = new ArrayList<Place>();
        place.add(new Place(nameplace,R.drawable.museumegypt,information));
        CustomAdapter placeAdapter = new CustomAdapter(this,place);
        ListView listView = (ListView) findViewById(R.id.listviewEGYPT);
        listView.setAdapter(placeAdapter);
    }
}
