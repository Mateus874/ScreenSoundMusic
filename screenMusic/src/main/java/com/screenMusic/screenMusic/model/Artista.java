package com.screenMusic.screenMusic.model;

import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Entity
public class Artista {
    //Atributos
    private Long id;
    private String nomeArtista;
    private String genero;
    private String local;
    private List<Musica> musicas;

    //Construtor padrao
    public Artista(Long id, String nomeArtista, String genero, String local, List<Musica> musicas) {
        this.id = id;
        this.nomeArtista = nomeArtista;
        this.genero = genero;
        this.local = local;
        this.musicas = musicas;
    }


    //Construtor vázio
    public Artista(Long id) {
        this.id = id;
    }


    //Getter e setter
    public String getNome() {
        return nomeArtista;
    }

    public void setNome(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }
}
