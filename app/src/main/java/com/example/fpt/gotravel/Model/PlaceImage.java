package com.example.fpt.gotravel.Model;

/**
 * Created by PhuongBee on 10/27/2017.
 */

public class PlaceImage {

    private String mimageRef ;
    private int mimageWidth;
    private int mimageHeight;

    public PlaceImage(String imageref, int imageWidth, int imageHeight){

        mimageRef       = imageref;
        mimageWidth     = imageWidth;
        mimageHeight    = imageHeight;
    }

    public String getImageRef(){ return mimageRef; }

    public int getImageWidth(){ return mimageWidth; }

    public int getImageHeight(){ return mimageHeight; }

    public boolean hasImageRef(){
        return getImageRef() != null;
    }
    public boolean hasImageWidth(){
        return getImageWidth() != -1;
    }
    public boolean hasImageHeight(){
        return getImageHeight() != -1;
    }
}
