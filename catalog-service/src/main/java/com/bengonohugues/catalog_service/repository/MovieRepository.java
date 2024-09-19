package com.bengonohugues.catalog_service.repository;




import com.bengonohugues.catalog_service.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    // Recherche de films par genre
    List<Movie> findByGenre(String genre);

    // Recherche de films par réalisateur
    List<Movie> findByDirector(String director);

    // Recherche de films sortis après une certaine date
    List<Movie> findByReleaseDateAfter(java.time.LocalDate releaseDate);
}



