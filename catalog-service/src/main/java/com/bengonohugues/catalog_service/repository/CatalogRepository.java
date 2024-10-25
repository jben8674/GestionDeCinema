package com.bengonohugues.catalog_service.repository;




import com.bengonohugues.catalog_service.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog, Long> {

    // Recherche de films par genre
    List<Catalog> findByGenre(String genre);


    List<Catalog> findByCinema(String cinema);

    List<Catalog> findByDuration(Integer duration);


    // Recherche de films par réalisateur
    List<Catalog> findByDirector(String director);

    // Recherche de films sortis après une certaine date
    List<Catalog> findByReleaseDateAfter(java.time.LocalDate releaseDate);
}



