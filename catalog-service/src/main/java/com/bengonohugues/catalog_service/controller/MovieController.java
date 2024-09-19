package com.bengonohugues.catalog_service.controller;


import com.bengonohugues.catalog_service.dto.MovieDto;
import com.bengonohugues.catalog_service.model.Movie;
import com.bengonohugues.catalog_service.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/catalog")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // Récupérer tous les films
    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    // Récupérer un film par ID
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id) {
        Optional<Movie> movie = movieService.getMovieById(id);
        return movie.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Récupérer des films par genre
    @GetMapping("/genre/{genre}")
    public List<MovieDto> getMoviesByGenre(@PathVariable String genre) {
        return movieService.getMoviesByGenre(genre);
    }

    // Créer un nouveau film
    @PostMapping
    public MovieDto createMovie(@RequestBody MovieDto movieDto) {
        return movieService.createMovie(movieDto);
    }

    // Supprimer un film par ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        Optional<Movie> movie = movieService.getMovieById(id);
        if (movie.isPresent()) {
            movieService.deleteMovie(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
