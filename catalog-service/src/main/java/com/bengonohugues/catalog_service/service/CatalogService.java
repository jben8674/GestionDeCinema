package com.bengonohugues.catalog_service.service;

import com.bengonohugues.catalog_service.dto.CatalogDto;
import com.bengonohugues.catalog_service.model.Catalog;
import com.bengonohugues.catalog_service.repository.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CatalogService {

    private final CatalogRepository catalogRepository;

    @Autowired
    public CatalogService(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public List<Catalog> getAllMovies() {
        return catalogRepository.findAll();
    }

    public Optional<Catalog> getMovieById(Long id) {
        return catalogRepository.findById(id);
    }

    public List<Catalog> filterMovies(String genre, String cinema, Integer duration) {
        List<Catalog> filteredMovies = new ArrayList<>(getAllMovies());

        if (genre != null) {
            filteredMovies.retainAll(catalogRepository.findByGenre(genre));
        }
        if (cinema != null) {
            filteredMovies.retainAll(catalogRepository.findByCinema(cinema));
        }
        if (duration != null && duration > 0) {
            filteredMovies.retainAll(catalogRepository.findByDuration(duration));
        }

        return filteredMovies;
    }

    public Catalog createMovie(Catalog catalog) {
        return catalogRepository.save(catalog);
    }

    public void deleteMovie(Long id) {
        catalogRepository.deleteById(id);
    }
}
