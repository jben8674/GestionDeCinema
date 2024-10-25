package com.bengonohugues.catalog_service.controller;

import com.bengonohugues.catalog_service.dto.CatalogDto;
import com.bengonohugues.catalog_service.model.Catalog;
import com.bengonohugues.catalog_service.service.CatalogService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Tag(name = "CRUD APIs for Gestion de Cinema",
        description = "CRUD APIs to Create, Read, Update, and Delete details"
)
@RestController
@RequestMapping("/api/catalog")
public class CatalogController {

    private final CatalogService catalogService;

    @Autowired
    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    // Récupérer tous les films
    @GetMapping
    public List<Catalog> getAllMovies() {
        return catalogService.getAllMovies();
    }

    // Récupérer un film par ID
    @GetMapping("/{id}")
    public Catalog getMovieById(@PathVariable Long id) {
        return catalogService.getMovieById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found with id: " + id));
    }

    // Récupérer des films par genre, cinéma ou durée
    @GetMapping("/catalog")
    public List<Catalog> getCatalog(@RequestParam(required = false) String genre,
                                    @RequestParam(required = false) String cinema,
                                    @RequestParam(required = false) Integer duration) {
        return catalogService.filterMovies(genre, cinema, duration);
    }

    // Créer un nouveau film
    @PostMapping
    public Catalog createMovie(@RequestBody Catalog catalog) {
        return catalogService.createMovie(catalog);
    }

    // Supprimer un film par ID
    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id) {
        Catalog movie = catalogService.getMovieById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found with id: " + id));
        catalogService.deleteMovie(id);
    }
}
