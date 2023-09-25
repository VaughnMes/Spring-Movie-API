package com.Vaughn.SpringAPI.service;

import com.Vaughn.SpringAPI.api.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    // Simulating a movie database
    private static List<Movie> movieList;

    public MovieService() {
        movieList = new ArrayList<>();

        Movie movie1 = new Movie("One Piece",
                "In a seafaring world, " +
                        "a young pirate captain sets out with his " +
                        "crew to attain the title of Pirate King, " +
                        "and to discover the mythical treasure known " +
                        "as 'One Piece.'", 1, 8);

        Movie movie2 = new Movie("The Equalizer 3",
                "Robert McCall finds himself at home in " +
                        "Southern Italy but he discovers his friends are under " +
                        "the control of local crime bosses. As events turn deadly, " +
                        "McCall knows what he has to do: become his friends' protector " +
                        "by taking on the mafia.", 2, 7);

        movieList.addAll(Arrays.asList(movie1,movie2));
    }

    public static Optional getMovie(String movieTitle) {
        Optional<Object> optional = Optional.empty();
        for (Movie movie : movieList) {
            if (movieTitle.equals(movie.getMovieTitle())) {
                optional = Optional.of(movie);
                return optional;
            }
        }
        return optional;
    }
}
