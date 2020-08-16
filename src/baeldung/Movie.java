package baeldung;

public class Movie implements Comparable<Movie> {

    private String moviename;
    private Integer releaseyear;
    private Integer rating;

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public Integer getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(Integer releaseyear) {
        this.releaseyear = releaseyear;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Movie(String moviename, Integer releaseyear, Integer rating) {
        this.moviename = moviename;
        this.releaseyear = releaseyear;
        this.rating = rating;
    }

    @Override
    public int compareTo(Movie movie) {
        return this.releaseyear-movie.releaseyear;
    }

}
