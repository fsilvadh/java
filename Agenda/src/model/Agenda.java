package model;

import model.pessoa.Pessoa;
import model.pessoa.PessoaFisica;

public class Agenda {

    public String exibirDadosContato(String nome) {
        //localizar um contato e retornou um objeto do tipo pessoa.

        Pessoa pessoa = new PessoaFisica("Fábio", "fabio@email.com.br", "1234");
        System.out.println(pessoa);
        System.out.println(pessoa.apresentarDocumento());

        return pessoa + ":" + pessoa.apresentarDocumento();
    }


}
