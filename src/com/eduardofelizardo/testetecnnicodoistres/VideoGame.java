package com.eduardofelizardo.testetecnnicodoistres;
/**
 * Eduardo Felizardo Cândido
 */
public class VideoGame extends Produto implements Imposto{
    private String marca;
    private String modelo;
    private boolean isUsado;

    VideoGame () {}

    public VideoGame(String nome, double preco, int qdt, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qdt);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    @Override
    public double calcularImposto() {
        if (isUsado == true) {
            return getPreco() * 0.25;
        } else {
            return getPreco() * 0.45;
        }
    }
}