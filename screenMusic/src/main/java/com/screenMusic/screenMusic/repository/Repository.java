package com.screenMusic.screenMusic.repository;

import com.screenMusic.screenMusic.model.Artista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Repository extends JpaRepository<Artista, Long> {
}
