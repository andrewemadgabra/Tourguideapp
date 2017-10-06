package com.example.andrew.tourguideapp;

/**
 * Created by andrew on 10/4/2017.
 */

public class Place {
    private String namePlace;
    private String informationPlace;
    private int mImageResourceId;

    public Place (String name,int ImageResourceId,String minformationPlace){
        this.namePlace=name;
        this.mImageResourceId=ImageResourceId;
        this.informationPlace=minformationPlace;
    }
    public String getInformationPlace(){
        return informationPlace;
    }
    public String getNamePlace(){return namePlace;}
    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
