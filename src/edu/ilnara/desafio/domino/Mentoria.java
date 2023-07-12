package edu.ilnara.desafio.domino;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria() {
    }
    public Mentoria(String titulo, String descricao, LocalDate data){
            super(); 
            this.setTitulo(titulo);
            this.setDescricao(descricao);
            this.setData(data);
        }
    

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

}
