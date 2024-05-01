package com.objetos.a.orientacao.desafio.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private double lancamento;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;

    public double getLancamento() {
        return lancamento;
    }
    public void setLancamento(double lancamento) {
        this.lancamento = lancamento;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }
    public int getCurtidas() {
        return curtidas;
    }

    public void avaliar(){
        if (totalReproducoes >= 50) {
            classificacao = 1;
        }
        if (totalReproducoes >= 100) {
            classificacao = 2;
        }
        if (totalReproducoes >= 200) {
            classificacao = 3;
        }
        if (totalReproducoes >= 400) {
            classificacao = 4;
        }
        if (totalReproducoes >= 800) {
            classificacao = 5;
        }
    }

    public void reproduzir() {
        this.totalReproducoes++;
    }

    public void curtir() {
        this.curtidas++;
    }

}
