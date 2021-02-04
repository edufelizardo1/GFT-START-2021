package com.eduardofelizardo.testetecnnicodoistres;
/**
 * Eduardo Felizardo Cândido
 */
public abstract class Produto {
    private String nome;
    private double preco;
    private int qdt;


    Produto () {}
    Produto(String nome, double preco, int qdt) {
        this.nome = nome;
        setPreco(preco);
        //this.preco = preco;
        this.qdt = qdt;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        }
    }

    public int getQdt() {
        return qdt;
    }

    public void setQdt(int qdt) {
        if (qdt > 0) {
            this.qdt = qdt;
        }
    }

}
