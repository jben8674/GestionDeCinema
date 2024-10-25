package com.bengonohugues.movies_service.controller;


import com.bengonohugues.movies_service.model.Catalog;
import com.bengonohugues.movies_service.model.Movie;
import com.bengonohugues.movies_service.service.MovieService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/movies")
@Tag(name = "Movies", description = "API pour la gestion des films")
public class MovieController {

    @Autowired
    private MovieService moviesService;

    @GetMapping
    public List<Movie> getAllMovies() {
        return moviesService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id) {
        return moviesService.getMovieById(id);
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie film) {
        return moviesService.addMovie(film);
    }

    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable Long id, @RequestBody Movie film) {
        return moviesService.updateMovie(id, film);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id) {
        moviesService.deleteMovie(id);
    }

    @GetMapping("/catalog")
    public Catalog getCatalog() {
        return moviesService.getCatalog();
    }
}