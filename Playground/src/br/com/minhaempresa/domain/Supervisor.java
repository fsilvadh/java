package br.com.minhaempresa.domain;

import java.time.LocalDate;

public class Supervisor extends FuncionarioPessoaFisica implements Demitidor {

    private static final double BONIFICACAO = 1.08;

    public Supervisor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void demitir(Funcionario funcionario) throws Exception {
        if ((funcionario instanceof Supervisor) || (funcionario instanceof Gerente)) {
            throw new Exception("Você não pode demitir este funcionário");
        } else {
            funcionario.setDataDemissao(LocalDate.now());
        }
    }

    @Override
    public double consultarContraCheque() {
        return super.consultarContraCheque() * BONIFICACAO;
    }
}
