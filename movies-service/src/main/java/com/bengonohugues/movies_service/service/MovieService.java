package com.bengonohugues.movies_service.service;

import com.bengonohugues.movies_service.dto.CatalogDto;
import com.bengonohugues.movies_service.dto.MovieDto;
import com.bengonohugues.movies_service.model.Movie;
import com.bengonohugues.movies_service.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    @Autowired
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<MovieDto> getAllMovies() {
        List<Movie> movies = movieRepository.findAll();
        return movies.stream().map(this::mapToDto).collect(Collectors.toList());
    }

    public MovieDto getMovieById(Long id) {
        Movie movie = movieRepository.findById(id).orElseThrow(() -> new RuntimeException("Movie not found"));
        return mapToDto(movie);
    }

    public MovieDto createMovie(MovieDto movieDto) {
        Movie movie = mapToEntity(movieDto);
        Movie savedMovie = movieRepository.save(movie);
        return mapToDto(savedMovie);
    }

    public MovieDto updateMovie(Long id, MovieDto movieDto) {
        Movie movie = movieRepository.findById(id).orElseThrow(() -> new RuntimeException("Movie not found"));
        movie.setTitle(movieDto.getTitle());
        movie.setGenre(movieDto.getGenre());
        movie.setDirector(movieDto.getDirector());
        movie.setReleaseDate(movieDto.getReleaseDate());
        movie.setDuration(movieDto.getDuration());
        Movie updatedMovie = movieRepository.save(movie);
        return mapToDto(updatedMovie);
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

    // Méthodes pour convertir entre Movie et MovieDto
    private MovieDto mapToDto(Movie movie) {
        return new MovieDto(movie.getId(), movie.getTitle(), movie.getGenre(), movie.getDirector(), movie.getReleaseDate(), movie.getDuration());
    }

    private Movie mapToEntity(MovieDto movieDto) {
        return new Movie(movieDto.getTitle(), movieDto.getGenre(), movieDto.getDirector(), movieDto.getReleaseDate(), movieDto.getDuration());
    }

    public void CatalogService() {
        // Adding some sample movies
        CatalogDto movie1 = new CatalogDto();
        movie1.setId(1L);
        movie1.setTitle("Inception");
        movie1.setGenre("Science Fiction");
        movie1.setReleaseDate(LocalDate.of(2010, 7, 16));
        movie1.setDuration(148);
        movie1.setDirector("Christopher Nolan");


    }
}