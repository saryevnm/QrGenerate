package com.example.qrgenerator.framework.remote.dao;

import com.example.qrgenerator.data.local.Film;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FilmDao {

    @GET("/films/{id}")
    Call<Film> getFilm(@Path("id")String id);
}
