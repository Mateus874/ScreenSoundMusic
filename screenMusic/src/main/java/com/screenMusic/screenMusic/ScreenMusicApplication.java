package com.screenMusic.screenMusic;

import com.screenMusic.screenMusic.principal.Principal;
import com.screenMusic.screenMusic.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMusicApplication implements CommandLineRunner {

    public ScreenMusicApplication(Repository repositorio) {
        this.repositorio = repositorio;
    }

    public static void main(String[] args) {
		SpringApplication.run(ScreenMusicApplication.class, args);
	}

	@Autowired
	private Repository repositorio;



	@Override
	public void run(String... args) throws Exception {
		Principal principal1 = new Principal(repositorio);
		System.out.println(principal1);
		principal1.exibeMenu();
	}
}
