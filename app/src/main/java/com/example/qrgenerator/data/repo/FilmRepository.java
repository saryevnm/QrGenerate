package com.example.qrgenerator.data.repo;

import com.example.qrgenerator.data.local.Film;
import com.example.qrgenerator.data.source.FilmSource;

import java.util.List;

public class FilmRepository {

    private final FilmSource filmSource;

    public FilmRepository(FilmSource filmSource){
        this.filmSource = filmSource;
    }

    public Film getFilms(String id){
        return filmSource.getFilm(id);
    }
}
