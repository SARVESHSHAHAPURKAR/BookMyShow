package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieController {

    List<Movie> allMovies;
    Map <City, List<Movie> > cityVsMovies;

    public MovieController() {
        this.allMovies = new ArrayList<>();
        this.cityVsMovies = new HashMap<City, List<Movie>>();
    }

    public void addMovies(City city, List<Movie> movies){

        List<Movie> currentMovies = cityVsMovies.getOrDefault(city, new ArrayList<>());
        this.allMovies.addAll(movies);
        currentMovies.addAll(movies);
        cityVsMovies.put(city, currentMovies);

    }

    Movie getMovieByName(String movieName) {

        for(Movie movie : allMovies) {
            if((movie.getMovieName()).equals(movieName)) {
                return movie;
            }
        }
        return null;
    }


    List<Movie> getMoviesByCity(City city) {
        return cityVsMovies.get(city);
    }

}
