package com.medialink.dagger1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiHeroes {
    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
