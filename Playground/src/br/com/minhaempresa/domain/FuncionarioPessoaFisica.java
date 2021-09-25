package br.com.minhaempresa.domain;

public class FuncionarioPessoaFisica extends Funcionario {

    private String cpf;
    private String nit;

    public FuncionarioPessoaFisica(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
