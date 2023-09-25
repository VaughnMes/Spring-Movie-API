package com.Vaughn.SpringAPI.api.controller;

import com.Vaughn.SpringAPI.api.model.Movie;
import com.Vaughn.SpringAPI.service.MovieService;
import com.sun.source.tree.BreakTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MovieController {


    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movie")
    public Movie getMovie(@RequestParam String movieTitle) {
        Optional<Movie> movie = MovieService.getMovie(movieTitle);
        return (Movie) movie.orElse(null);
    }
}
