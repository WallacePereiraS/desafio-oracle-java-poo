package com.objetos.a.orientacao.desafio.modelos;

import com.objetos.a.orientacao.desafio.acoes.PlayLike;

public class Musica extends Audio implements PlayLike {
    private String album;
    private String composicao;
    private String producao;
    private String interprete;
    private String genero;

    public void setAlbum(String album) {
        this.album = album;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }
    public void setProducao(String producao) {
        this.producao = producao;
    }
    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    @Override
    public void exibirFichaTecnica() {
        System.out.println("***************************************");
        System.out.println("Título: " + getTitulo());
        System.out.println("Intérprete: " + interprete);
        System.out.println("Album: " + album);
        System.out.println("Gênero: " + genero);
        System.out.println("Lançamento: " + getLancamento());
        System.out.println("Produção: " + producao);
        System.out.println("Composição: " + composicao);
        System.out.println("Duração: " + getDuracao());
        System.out.println("Reproduções: " + getTotalReproducoes());
        System.out.println("Curtidas: " + getCurtidas());
        System.out.println("Classificação: " + getClassificacao() + " estrelas");
        System.out.println("***************************************");
    }
}
