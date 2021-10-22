package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("9TuVEEr6sK2OSQc3P428QC62h9XLgZHkED88s9rW")
                .clientKey("N6roEBjVamV7NbfnsVMZdTTFgHRTwkBFvralSUEC")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
