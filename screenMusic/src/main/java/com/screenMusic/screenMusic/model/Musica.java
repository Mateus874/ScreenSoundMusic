package com.screenMusic.screenMusic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

    //Atributos
@Entity
@Table(name = "")
public class Musica {
    private String nomeMusica;
    private String generoMusica;
    private int minutos;
    @ManyToOne
    private Artista artista;

    //Construtores
    public Musica() {
    }

    public Musica(int minutos, Artista artista, String nomeMusica, String generoMusica) {
        this.minutos = minutos;
        this.artista = artista;
        this.nomeMusica = nomeMusica;
        this.generoMusica = generoMusica;
    }




    //Getter e setter
    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getGeneroMusica() {
        return generoMusica;
    }

    public void setGeneroMusica(String generoMusica) {
        this.generoMusica = generoMusica;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
