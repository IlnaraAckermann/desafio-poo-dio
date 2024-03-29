package edu.ilnara.desafio.domino;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

    //atributos
    private String nome;
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    
    //construtor
    public Dev(String nome) {
        this.nome = nome;
    }
    public Dev(){
        
    }
    //getters e setter

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }
    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }
    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }
    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    //métodos


    public void increverBootcamp(Bootcamp bootcamp) {
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
    }

    public double calcularTotalXP() {
        return this.conteudoConcluidos
        .stream()
        .mapToDouble(Conteudo::calcularXP)
        .sum();
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não tem conteudos matriculados.");
        }
        }

  

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudoConcluidos == null) ? 0 : conteudoConcluidos.hashCode());
        result = prime * result + ((conteudoInscritos == null) ? 0 : conteudoInscritos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudoConcluidos == null) {
            if (other.conteudoConcluidos != null)
                return false;
        } else if (!conteudoConcluidos.equals(other.conteudoConcluidos))
            return false;
        if (conteudoInscritos == null) {
            if (other.conteudoInscritos != null)
                return false;
        } else if (!conteudoInscritos.equals(other.conteudoInscritos))
            return false;
        return true;
    }
}
