package com.screenMusic.screenMusic.repository;

import com.screenMusic.screenMusic.model.Artista;
import com.screenMusic.screenMusic.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;


public interface Repository extends JpaRepository<Artista, Long> {


    Optional<Artista> findBynomeArtistaContainingIgnoreCase(String nome);

    @Query("SELECT m FROM Artista a JOIN a.musica m WHERE a.nome ILIKE %:nome%")
    List<Musica> buscaMusicasPorArtista(String nome);
}
