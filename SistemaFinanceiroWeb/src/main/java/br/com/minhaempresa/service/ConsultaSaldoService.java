package br.com.minhaempresa.service;

import br.com.minhaempresa.domain.Cliente;
import br.com.minhaempresa.domain.Conta;
import br.com.minhaempresa.domain.ContaCorrente;

public class ConsultaSaldoService {

    public double consultarSaldo(String nome, String sobrenome) {
        Cliente cliente = new Cliente(nome, sobrenome);
        Conta conta = new ContaCorrente(cliente);
        return conta.consultarSaldo();
    }

}
