package com.screenMusic.screenMusic.model;

import jakarta.persistence.*;

//Atributos
@Entity
@Table(name = "")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
    private String nomeMusica;
    private String generoMusica;
    private int minutos;

    @ManyToOne
    @JoinColumn(name = "artista_id")
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

    public Musica(String nome) {
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

    @Override
    public String toString() {
        return "Musica{" +
                "id=" + id +
                ", nomeMusica='" + nomeMusica + '\'' +
                ", generoMusica='" + generoMusica + '\'' +
                ", minutos=" + minutos +
                ", artista=" + artista.getNome() +
                '}';
    }
}
