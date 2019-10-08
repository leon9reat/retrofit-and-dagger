package com.medialink.dagger1;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApiModule.class, AppModule.class})
public interface ApiComponent {
    void inject(MainActivity activity);
}
