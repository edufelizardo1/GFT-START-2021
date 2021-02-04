package com.eduardofelizardo.testetecnnicodoistres;

import java.util.List;

/**
 * Eduardo Felizardo Cândido
 */

public class Loja {

    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        setNome(nome);
        setCnpj(cnpj);
        setLivros(livros);
        setVideoGames(videoGames);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public void listaLivros() {
        if(!livros.isEmpty()){
            System.out.println("A loja Americanas possui estes livros para venda:");
            for (Livro livro : livros) {
                System.out.printf("Titulo: " + livro.getNome() + ", preço " + livro.getPreco() + ", Quantidade: " + livro.getQdt() + " em estoque\n");
            }
        } else{
            System.out.println("A loja não tem livros no seu estoque.");
        }
    }

    // listaVideoGames() -> todos os videos games que a loja tem
    public void listaVideoGames() {
        System.out.println("A loja Americanas possui estes video-games para venda:");
        if (!videoGames.isEmpty()) {
            for (VideoGame game : videoGames) {
                System.out.printf("Titulo: " + game.getNome() + ", preço " + game.getPreco() + ", Quantidade: " + game.getQdt() + " em estoque\n");
            }
        } else {
            System.out.println("A loja não tem video games no seu estoque.");
        }
    }

    // calculaPatrimonio() -> soma o (preco * qtd) de todos os produtos da loja e retorna o valor
    public double calculaPatrimonio() {
        double resultado = 0.0;

        if (!livros.isEmpty()) {
            for (Livro livro : livros) {
                resultado += (livro.getPreco() * livro.getQdt());
            }
        }

        if (!videoGames.isEmpty()) {
            for (VideoGame game : videoGames) {
                resultado += (game.getPreco() * game.getQdt());
            }
        }

        return resultado;
    }

}