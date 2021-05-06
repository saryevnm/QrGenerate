package com.example.qrgenerator;

import android.app.Application;

import com.example.qrgenerator.data.repo.FilmRepository;
import com.example.qrgenerator.framework.remote.RetrofitFactory;
import com.example.qrgenerator.framework.remote.RetrofitFilmDataSource;

public class App extends Application {

    private static FilmRepository filmRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        RetrofitFilmDataSource source= new RetrofitFilmDataSource(RetrofitFactory.getInstance());
        filmRepository = new FilmRepository(source);
    }

    public static FilmRepository getFilmRepository(){
        return filmRepository;
    }

}
