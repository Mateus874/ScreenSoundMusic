package com.screenMusic.screenMusic.principal;

import com.screenMusic.screenMusic.model.Artista;
import com.screenMusic.screenMusic.model.Musica;
import com.screenMusic.screenMusic.repository.Repository;


import java.util.List;
import java.util.Optional;
import java.util.Scanner;


public class Principal {

    private final Scanner input = new Scanner(System.in);
    private final Artista artista = new Artista();
    private final Musica music = new Musica();
    private Repository repository;

    public Principal(Repository repository) {
        this.repository = repository;
    }

    public void exibeMenu() {
        var opcao = -1;

        while (opcao != 9) {
            var menu = """
                    *** Screen Sound Músicas ***                    
                                        
                    1- Cadastrar artistas
                    2- Cadastrar músicas
                    3- Listar músicas
                    4- Buscar músicas por artistas
                    5- Pesquisar dados sobre um artista
                                    
                    9 - Sair
                    """;

            System.out.println(menu);
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtistas();
                    break;
                case 2:
                    cadastrarMusicas();
                    break;
                case 3:
                    listarMusicas();
                    break;
//            case 4:
//                buscarMusicasPorArtista();
//                break;
//            case 5:
//                pesquisarDadosDoArtista();
//                break;
                case 9:
                    System.out.println("Encerrando a aplicação!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void listarMusicas() {
        List<Artista> artistas = repository.findAll();
        artistas.forEach(a -> a.getMusicas().forEach(System.out::println));
    }


    public void cadastrarArtistas() {
        System.out.println("Qual o nome do artista?");
        String nome = input.next();
        System.out.println("Qual o nome do gênero?");
        String genero = input.next();
        System.out.println("Qual o nome do local que esse artista nasceu?");
        String local = input.next();

        artista.setNome(nome);
        artista.setGenero(genero);
        artista.setLocal(local);

        repository.save(artista);

        System.out.println("Artista salvo com sucesso: " + artista.getNome());
    }

    public void cadastrarMusicas() {

        System.out.println("Qual o nome do artista?");
        String Artista = input.next();
        //Criar uma busca para verificar se existe o artista
        Optional<Artista> artista = repository.findBynomeArtistaContainingIgnoreCase(Artista);

        if (artista.isPresent()) {
            System.out.println("Qual o nome do gênero da música?");
            String genero = input.next();
            input.nextLine();

            System.out.println("Qual o nome da música?");
            String nome = input.nextLine();

            System.out.println("Qual sua duração?");
            int duracao = input.nextInt();
            input.nextLine();

            Musica musica = new Musica(nome);
            musica.setArtista(artista.get());
            artista.get().getMusicas().add(musica);
            musica.setGeneroMusica(genero);
            musica.setMinutos(duracao);
            repository.save(artista.get());

            System.out.println(genero);
            System.out.println(nome);
            System.out.println(duracao);


            System.out.println("Artista salvo com sucesso: " + music.getNomeMusica());
        } else {
            System.out.println("Artista não encontrado");

        }
    }
}
