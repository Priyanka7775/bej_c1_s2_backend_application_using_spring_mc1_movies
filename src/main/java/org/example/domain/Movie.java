package org.example.domain;

public class Movie {
    private String movieName;
    private String movieGenre;
    private double duration;
    private double totalCollection;

    public Movie(String movieName, String movieGenre, double duration, double totalCollection) {
        this.movieName = movieName;
        this.movieGenre = movieGenre;
        this.duration = duration;
        this.totalCollection = totalCollection;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", movieGenre='" + movieGenre + '\'' +
                ", duration=" + duration +
                ", totalCollection=" + totalCollection +
                '}';
    }
}
