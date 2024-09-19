package com.bengonohugues.booking_service.movie;

public class Movie {
    private String title;
    private String director;
    private int releaseYear;
    private String genre;
    private double rating;

    // Constructeur
    public Movie(String title, String director, int releaseYear, String genre, double rating) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.rating = rating;
    }

    // Getters et Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("Rating must be between 0 and 10.");
        }
    }

    // Méthode pour afficher les détails du film
    @Override
    public String toString() {
        return String.format("Title: %s%nDirector: %s%nRelease Year: %d%nGenre: %s%nRating: %.1f",
                title, director, releaseYear, genre, rating);
    }
}
