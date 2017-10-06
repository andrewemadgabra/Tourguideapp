package com.example.andrew.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by andrew on 10/4/2017.
 */

public class CustomAdapter extends ArrayAdapter<Place> {
    private static final String LOG_TAG = Place.class.getSimpleName();

    public CustomAdapter(Activity context, ArrayList<Place> Place) {
        super(context, 0, Place);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_list, parent, false);
        }
        Place currentAndroid = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.TextLIST);
        nameTextView.setText(currentAndroid.getNamePlace());
        TextView informaionTextView = (TextView) listItemView.findViewById(R.id.TextInformation);
        informaionTextView.setText(currentAndroid.getInformationPlace());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imageLIST);
        iconView.setImageResource(currentAndroid.getmImageResourceId());
        return listItemView;
    }
}
