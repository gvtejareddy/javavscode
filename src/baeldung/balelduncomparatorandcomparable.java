package baeldung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class balelduncomparatorandcomparable {

    public static void main(String[] args) {

        List<Movie> newMovie = new ArrayList<Movie>();

        newMovie.add(new Movie("bb2", 2016, 7));

        newMovie.add(new Movie("bb1", 2013, 9));

        newMovie.add(new Movie("ad", 2018, 6));

        newMovie.add(new Movie("ddlj", 1994, 9));

        newMovie.forEach((c) -> {
            System.out.println(c.getMoviename());
        });

        Collections.sort(newMovie);

        newMovie.forEach((c) -> {
            System.out.println(c.getMoviename() + " : " + c.getReleaseyear());
        });

        RatingComparator ratingComparator = new RatingComparator();

        Collections.sort(newMovie, ratingComparator);

        newMovie.forEach((c) -> {
            System.out.println(c.getMoviename() + " : " + c.getReleaseyear() + " :" + c.getRating());
        });

        movienamecomparator movienameComparator = new movienamecomparator();
        Collections.sort(newMovie, movienameComparator);
        newMovie.forEach((c) -> {
            System.out.println(c.getMoviename() + " : " + c.getReleaseyear() + " :" + c.getRating());
        });

    }

}