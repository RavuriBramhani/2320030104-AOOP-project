package com.movie;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		List<movie> movies = new ArrayList<>();
        movies.add(new movie("Inception", 8.8, 2010));
        movies.add(new movie("The Dark Knight", 9.0, 2008));
        movies.add(new movie("Interstellar", 8.6, 2014));
        movies.add(new movie("Parasite", 8.6, 2019));
        movies.add(new movie("The Matrix", 8.7, 1999));

        Collections.sort(movies);

        for (movie movie : movies) {
            System.out.println(movie);
        }

	}

}
