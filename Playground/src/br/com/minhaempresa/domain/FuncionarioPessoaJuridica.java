package br.com.minhaempresa.domain;

public class FuncionarioPessoaJuridica extends Funcionario {

    private String cnpj;

    public FuncionarioPessoaJuridica(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCpnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
