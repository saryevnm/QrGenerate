package com.example.qrgenerator.framework.remote;

import com.example.qrgenerator.data.local.Film;
import com.example.qrgenerator.data.source.FilmSource;
import com.example.qrgenerator.framework.remote.dao.FilmDao;

public class RetrofitFilmDataSource implements FilmSource {

    private final FilmDao filmDao;


    public RetrofitFilmDataSource(FilmDao filmDao){
        this.filmDao = filmDao;
    }

    @Override
    public Film getFilm(String id) {

    }


}
