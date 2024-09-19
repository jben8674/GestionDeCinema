package com.bengonohugues.movies_service.dto;
import java.time.LocalDate;

public class MovieDto {

    private Long id;
    private String title;
    private String genre;
    private String director;
    private LocalDate releaseDate;
    private int duration;

    // Constructeurs, Getters et Setters
    public MovieDto() {
    }

    public MovieDto(Long id, String title, String genre, String director, LocalDate releaseDate, int duration) {
        this.id = id;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
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
