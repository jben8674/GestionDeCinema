package com.bengonohugues.catalog_service.service;

import com.bengonohugues.catalog_service.dto.MovieDto;
import com.bengonohugues.catalog_service.model.Movie;
import com.bengonohugues.catalog_service.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();

    }

    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);

    }

    public List<MovieDto> getMoviesByGenre(String genre) {
        return movieRepository.findByGenre(genre)
                .stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

    public MovieDto createMovie(MovieDto movieDto) {
        Movie movie = convertToEntity(movieDto);
        movieRepository.save(movie);
        return convertToDto(movie);
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

    // Méthode pour convertir une entité en DTO
    private MovieDto convertToDto(Movie movie) {
        return new MovieDto(
                movie.getId(),
                movie.getTitle(),
                movie.getGenre(),
                movie.getReleaseDate(),
                movie.getDuration(),
                movie.getDirector()
        );
    }

    // Méthode pour convertir un DTO en entité
    private Movie convertToEntity(MovieDto movieDto) {
        return new Movie(
                movieDto.getTitle(),
                movieDto.getGenre(),
                movieDto.getReleaseDate(),
                movieDto.getDuration(),
                movieDto.getDirector()
        );
    }
}
