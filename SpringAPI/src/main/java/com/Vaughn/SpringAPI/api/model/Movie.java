package com.Vaughn.SpringAPI.api.model;

public class Movie {

    private String movieTitle;
    private String movieDesc;
    private int movieDuration;
    private int movieRating;

    public Movie(String movieTitle, String movieDesc, int movieDuration, int movieRating) {
        this.movieTitle = movieTitle;
        this.movieDesc = movieDesc;
        this.movieDuration = movieDuration;
        this.movieRating = movieRating;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    public int getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(int movieRating) {
        this.movieRating = movieRating;
    }
}
