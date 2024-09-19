package com.bengonohugues.movies_service.controller;

import com.bengonohugues.movies_service.dto.CatalogDto;
import com.bengonohugues.movies_service.dto.MovieDto;
import com.bengonohugues.movies_service.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    @Autowired
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // Obtenir tous les films
    @GetMapping
    public ResponseEntity<List<MovieDto>> getAllMovies() {
        List<MovieDto> movies = movieService.getAllMovies();
        return ResponseEntity.ok(movies);
    }

    // Obtenir un film par ID
    @GetMapping("/{id}")
    public ResponseEntity<MovieDto> getMovieById(@PathVariable Long id) {
        MovieDto movie = movieService.getMovieById(id);
        return ResponseEntity.ok(movie);
    }

    // Créer un nouveau film
    @PostMapping
    public ResponseEntity<MovieDto> createMovie(@RequestBody MovieDto movieDto) {
        MovieDto newMovie = movieService.createMovie(movieDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newMovie);
    }

    // Mettre à jour un film existant
    @PutMapping("/{id}")
    public ResponseEntity<MovieDto> updateMovie(@PathVariable Long id, @RequestBody MovieDto movieDto) {
        MovieDto updatedMovie = movieService.updateMovie(id, movieDto);
        return ResponseEntity.ok(updatedMovie);
    }

    // Supprimer un film
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }



    }


