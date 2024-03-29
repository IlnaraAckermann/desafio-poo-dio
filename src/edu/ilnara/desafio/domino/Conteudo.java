package edu.ilnara.desafio.domino;

public abstract class Conteudo {
    public static final double XP_PADRAO =10;
    private String titulo;
    private String descricao;

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXP();

    public static double getXpPadrao() {
        return XP_PADRAO;
    }

    
}
