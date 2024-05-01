package com.objetos.a.orientacao.desafio.modelos;

import com.objetos.a.orientacao.desafio.acoes.PlayLike;

public class Podcast extends Audio implements PlayLike {
    private String convidado;
    private String host;
    private String descricao;

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }
    public void setHost(String host) {
        this.host = host;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void exibirFichaTecnica() {
        System.out.println("***************************************");
        System.out.println("Título: " + getTitulo());
        System.out.println("Convidado: " + convidado);
        System.out.println("Descrição: " + descricao);
        System.out.println("Host: " + host);
        System.out.println("Duração: " + getDuracao());
        System.out.println("Lançamento: " + getLancamento());
        System.out.println("Reproduções: " + getTotalReproducoes());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Classificação: " + getClassificacao() + " estrelas");
        System.out.println("***************************************");
    }
}
