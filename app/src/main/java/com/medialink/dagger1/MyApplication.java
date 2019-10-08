package com.medialink.dagger1;

import android.app.Application;

public class MyApplication extends Application {
    private ApiComponent mApiComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApiComponent = DaggerApiComponent.builder()
                .apiModule(new ApiModule("https://simplifiedcoding.net/demos/"))
                .appModule(new AppModule(this))
                .build();
    }

    public ApiComponent getNetComponent() {
        return mApiComponent;
    }
}
