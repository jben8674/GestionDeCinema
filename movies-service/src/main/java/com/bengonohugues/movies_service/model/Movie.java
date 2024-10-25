package com.bengonohugues.movies_service.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @ElementCollection
    @Column(nullable = false)
    private List<String> genre;  // Genre ne peut pas être null

    @Column(nullable = false)
    private String director;

    @Column(nullable = false)
    private LocalDate releaseDate;

    @Column(nullable = false)
    private int duration;  // Durée en minutes

    private LocalDateTime dateHeure;
    private String salle;
    private String siege;

    // Constructeur par défaut
    public Movie() {
    }

    // Constructeur avec paramètres
    public Movie(String title, List<String> genre, String director, LocalDate releaseDate, int duration, LocalDateTime dateHeure, String salle, String siege) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.dateHeure = dateHeure;
        this.salle = salle;
        this.siege = siege;
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

    public LocalDateTime getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(LocalDateTime dateHeure) {
        this.dateHeure = dateHeure;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }

    public String getSiege() {
        return siege;
    }

    public void setSiege(String siege) {
        this.siege = siege;
    }
}
