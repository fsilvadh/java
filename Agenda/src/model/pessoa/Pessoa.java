package model.pessoa;

import model.EmissorDeSom;
import model.Movimentador;

public abstract class Pessoa implements EmissorDeSom, Movimentador {

    private String nome;
    private String email;

    public abstract String apresentarDocumento();


    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Meu nome é: " + nome + " e meu email é: " + email;
    }

    public String retornarUmaString() {
        return "Qualquer coisa";
    }

    @Override
    public String emitirSom() {
        return "Eu estou falando";
    }

    @Override
    public String movimentar(){
        return "Andando com as minhas duas pernas";
    }

    public void chamandoTeste(){
        this.teste();
    }

}