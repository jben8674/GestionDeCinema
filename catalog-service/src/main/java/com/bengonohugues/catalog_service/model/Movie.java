package com.bengonohugues.catalog_service.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class Movie {

    private Long id;

    private String title;

    private List<String> genre;

    private String director;


    private LocalDate releaseDate;


    private int duration; // Durée en minutes

    // Constructeurs, Getters et Setters
    public Movie() {
    }

    public Movie(String title, List<String> genre, String director, LocalDate releaseDate, int duration) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
        this.duration = duration;
    }

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

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}


