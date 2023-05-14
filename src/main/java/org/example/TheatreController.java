package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheatreController {

    List<Theatre> theatres;
    Map<City, List<Theatre>> theatreMappings;

    public TheatreController() {
        this.theatres = new ArrayList<>();
        this.theatreMappings = new HashMap<City, List<Theatre>>();
    }

    public void addTheatres(City city, List<Theatre> theatres){

        List<Theatre> currentTheates = theatreMappings.getOrDefault(city, new ArrayList<>());
        this.theatres.addAll(theatres);
        currentTheates.addAll(theatres);
        theatreMappings.put(city, currentTheates);

    }

    Map<Theatre, List<Show>> getAllShow(Movie movie, City city) {

        //get all the theater of this city

        Map<Theatre, List<Show>> theatreVsShows = new HashMap<>();

        List<Theatre> theatres = theatreMappings.get(city);

        //filter the theatres which run this movie

        for(Theatre theatre : theatres) {

            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();

            for(Show show : shows) {
                if(show.movie.getMovieId() == movie.getMovieId()) {
                    givenMovieShows.add(show);
                }
            }
            if(!givenMovieShows.isEmpty()) {
                theatreVsShows.put(theatre, givenMovieShows);
            }
        }

        return theatreVsShows;
    }



}
