package com.bignerdranch.android.photogallery;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;


public class FlickrFetchrApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
