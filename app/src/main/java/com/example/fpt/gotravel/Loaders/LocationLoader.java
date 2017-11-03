package com.example.fpt.gotravel.Loaders;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import com.example.fpt.gotravel.Model.BasicLocation;
import com.example.fpt.gotravel.Networking.QueryUtils;
import com.example.fpt.gotravel.Networking.UrlUtils;

import java.util.List;

/**
 * Created by PhuongBee on 10/27/2017.
 */

public class LocationLoader extends AsyncTaskLoader<List<BasicLocation>> {

    private String url;
    private int typemain,type;

    public LocationLoader(Context context, int a,int b){
        super(context);
        typemain = a;
        type = b;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<BasicLocation> loadInBackground() {
        url = UrlUtils.createUrl(typemain,type);
        if(url==null)
            return null;
        List<BasicLocation> locations = QueryUtils.fetchLocationdata(url);

        return locations;
    }
}
