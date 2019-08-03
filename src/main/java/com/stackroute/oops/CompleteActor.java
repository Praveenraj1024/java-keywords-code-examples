package com.stackroute.oops;

import java.util.ArrayList;
import java.util.List;

/**
 * This class inherits Actor class and
 */
public class CompleteActor extends Actor {

    List<String> movies = new ArrayList<>();
    public List<String> getmovies(){
        return movies;
    }

    public void setMovies(List<String> movies){
        this.movies = movies;
    }
}
