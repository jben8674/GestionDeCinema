package com.bengonohugues.movies_service.model;

import java.util.List;

public class Catalog {

    private Long id;
    private String title;
    private List<Movie> movies; // Liste de films associés à ce catalogue

    // Constructeur par défaut
    public Catalog() {
    }

    // Constructeur avec paramètres
    public Catalog(Long id, String title, List<Movie> movies) {
        this.id = id;
        this.title = title;
        this.movies = movies;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
