package com.bengonohugues.movies_service.service;


import com.bengonohugues.movies_service.model.Catalog;
import com.bengonohugues.movies_service.model.Movie;
import com.bengonohugues.movies_service.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MovieService {

    @Autowired
    private MovieRepository filmRepository;

    public List<Movie> getAllMovies() {
        return filmRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        return filmRepository.findById(id).orElse(null);
    }

    public Movie addMovie(Movie film) {
        return filmRepository.save(film);
    }

    public Movie updateMovie(Long id, Movie film) {
        if (filmRepository.existsById(id)) {
            film.setId(id);
            return filmRepository.save(film);
        }
        return null;
    }

    public void deleteMovie(Long id) {
        filmRepository.deleteById(id);
    }

    public Catalog getCatalog() {
        Catalog catalog = new Catalog();
        catalog.setMovies(filmRepository.findAll());
        return catalog;
    }
}