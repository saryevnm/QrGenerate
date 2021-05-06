package com.example.qrgenerator.data.source;

import com.example.qrgenerator.data.local.Film;

import java.util.List;

public interface FilmSource {

   Film getFilm(String id);
}
