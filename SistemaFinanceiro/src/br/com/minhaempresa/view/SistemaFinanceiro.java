package br.com.minhaempresa.view;

import br.com.minhaempresa.domain.Cliente;
import br.com.minhaempresa.domain.Conta;
import br.com.minhaempresa.domain.ContaCorrente;
import br.com.minhaempresa.exception.SaldoInsuficienteException;

public class SistemaFinanceiro {

    public static void main(String[] args) {

        Cliente titular = new Cliente("Fábio", "Silva");
        Conta conta = new ContaCorrente(titular);
        Conta contaDestino = new ContaCorrente(titular);

        try {
            conta.sacar(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Valor inválido: " + e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println("Valor inválido: " + e.getMessage());
        }


        try {
            conta.sacar(1);
        } catch (IllegalArgumentException | SaldoInsuficienteException e) {
            System.out.println("Valor inválido: " + e.getMessage());
        }

    }

}
