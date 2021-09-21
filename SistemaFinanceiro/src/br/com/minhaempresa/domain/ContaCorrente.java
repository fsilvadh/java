package br.com.minhaempresa.domain;

import br.com.minhaempresa.domain.Cliente;
import br.com.minhaempresa.domain.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente titular) {
        super(titular);
    }

    public ContaCorrente(Cliente titular, String numero) {
        super(titular, numero);
    }
}
