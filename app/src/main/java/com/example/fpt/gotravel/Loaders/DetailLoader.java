package com.example.fpt.gotravel.Loaders;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import com.example.fpt.gotravel.Model.Details;
import com.example.fpt.gotravel.Networking.QueryUtils;
import com.example.fpt.gotravel.Networking.UrlUtils;

/**
 * Created by PhuongBee on 10/27/2017.
 */

public class DetailLoader extends AsyncTaskLoader<Details> {
    private String mplaceid, url;

    public DetailLoader(Context context, String a){
        super(context);
        mplaceid = a;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public Details loadInBackground() {
        url = UrlUtils.createDetailsUrl(mplaceid);
        if(url==null)
            return null;
        Details place = QueryUtils.fetchPlacedata(url);
        return place;
    }
}
