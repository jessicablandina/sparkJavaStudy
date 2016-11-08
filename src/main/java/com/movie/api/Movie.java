package com.movie.api;

import lombok.Data;

import java.util.List;

@Data
public class Movie {

    private String name;
    private List<String> actors;
    private Integer year;
    private Movie movie;

    public Movie get(String id) {
        return movie;
    }

    public Movie createMovie(String name, List<String> actors, Integer year) {
        Movie movie = new Movie();
        movie.setActors(actors);
        movie.setName(name);
        movie.setYear(year);
        return movie;
    }

}
