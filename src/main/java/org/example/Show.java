package org.example;

import java.util.ArrayList;
import java.util.List;

public class Show {

    int showId;
    Screen screen;
    Movie movie;
    List<Integer> bookedSeatIds;

    public Show() {
        this.screen = new Screen();
        this.movie = new Movie();
        this.bookedSeatIds = new ArrayList<>();
    }

    public int getShowStartTime() {
        return showStartTime;
    }

    public void setShowStartTime(int showStartTime) {
        this.showStartTime = showStartTime;
    }

    int showStartTime;



    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public List<Integer> getBookedSeatIds() {
        return bookedSeatIds;
    }

    public void setBookedSeatIds(List<Integer> bookedSeatIds) {
        this.bookedSeatIds = bookedSeatIds;
    }

}
