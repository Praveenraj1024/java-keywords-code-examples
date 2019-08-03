package com.stackroute.oops;

import java.util.ArrayList;
import java.util.List;

/**
 * This class as a main method.
 */
public class OopsMain {
    /**
     * @param args stores the String array,
     *             And this method pass the values and prints the value by using
     *             the getters method of that class.
     */
    public static void main(String[] args){
        CompleteActor completeActor = new CompleteActor();
        completeActor.setName("Vijay");
        completeActor.setRank(2);
        List<String> movies = new ArrayList<>();
        movies.add("khilli");
        movies.add("nanban");
        movies.add("kavalan");
        completeActor.setMovies(movies);
        System.out.println(completeActor.getName().concat(" ").
                concat(String.valueOf(completeActor.getRank())
                        .concat(" ").concat(completeActor.getmovies().get(0))));
    }
}
