package br.com.minhaempresa.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="tb_conta_poupanca")
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente titular) {
        super(titular);
    }

}
