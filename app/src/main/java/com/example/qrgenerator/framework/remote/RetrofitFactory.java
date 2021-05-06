package com.example.qrgenerator.framework.remote;

import com.example.qrgenerator.framework.remote.dao.FilmDao;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {

    private static FilmDao API;

    public static FilmDao getInstance() {
        if (API == null) {
            API = new Retrofit.Builder()
                    .baseUrl("https://ghibliapi.herokuapp.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(FilmDao.class);
        }
        return API;
    }
}
