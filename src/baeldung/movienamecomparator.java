package baeldung;

import java.util.Comparator;

public class movienamecomparator implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {

        if (o1.getMoviename().compareTo(o2.getMoviename()) > 1)
            return 1;
        if (o1.getMoviename().compareTo(o2.getMoviename()) < 1)
            return -1;
        else {
            return 0;
        }

    }

}