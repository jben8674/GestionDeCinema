package com.bengonohugues.catalog_service.model;




import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "movies")
public class Catalog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private LocalDate releaseDate;

    @Column(nullable = false)
    private Integer duration; // Durée en minutes

    @Column(nullable = false)
    private String cinema; // Durée en minutes

    @Column(nullable = false)
    private Integer numbersOfPlaces; // D

    @Column(nullable = false)
    private Integer remainingPlaces; // D

    @Column(nullable = false)
    private String director;

    public Catalog() {}

    public Catalog(String title,Integer remainingPlaces, Integer numbersOfPlaces, String genre,String cinema, LocalDate releaseDate, Integer duration, String director) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.director = director;
        this.cinema = cinema;
        this.remainingPlaces = remainingPlaces;
        this.numbersOfPlaces = numbersOfPlaces;
    }




    // Getters and Setters

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
    public String getCinema() {
    return cinema;
}
    public void setCinema(String cinema) {
    this.cinema = cinema;
}
    public Integer getRemainingPlaces() {
        return remainingPlaces;
    }
    public void setRemainingPlaces(Integer remainingPlaces) {
        this.remainingPlaces= remainingPlaces;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

