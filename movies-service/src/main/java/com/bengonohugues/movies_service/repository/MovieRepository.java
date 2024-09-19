package com.bengonohugues.movies_service.repository;




import com.bengonohugues.movies_service.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByTitleContaining(String title);
    List<Movie> findByGenre(String genre);
}
