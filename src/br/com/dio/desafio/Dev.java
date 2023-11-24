
package br.com.dio.desafio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteudoIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();
    

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudoIncritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevesInscritos().add(this);
    }
    
    public void progredir(){

        Optional<Conteudo> conteudo = this.conteudoIncritos.stream().findFirst();
        
        if(conteudo.isPresent()){
          this.conteudoConcluidos.add(conteudo.get());
          this.getConteudoIncritos().remove(conteudo.get());
        }else{
            System.err.println("Voce nao esta matriculado em nenhum conteudo!");
        }
         
    }

    public double calcularTotalXp(){
     
        return this.conteudoConcluidos
        .stream()
        .mapToDouble(Conteudo::calcularXp)
        .sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoIncritos() {
        return conteudoIncritos;
    }

    public void setConteudoIncritos(Set<Conteudo> conteudoIncritos) {
        this.conteudoIncritos = conteudoIncritos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudoIncritos == null) ? 0 : conteudoIncritos.hashCode());
        result = prime * result + ((conteudoConcluidos == null) ? 0 : conteudoConcluidos.hashCode());
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
        if (conteudoIncritos == null) {
            if (other.conteudoIncritos != null)
                return false;
        } else if (!conteudoIncritos.equals(other.conteudoIncritos))
            return false;
        if (conteudoConcluidos == null) {
            if (other.conteudoConcluidos != null)
                return false;
        } else if (!conteudoConcluidos.equals(other.conteudoConcluidos))
            return false;
        return true;
    }
    

    
}