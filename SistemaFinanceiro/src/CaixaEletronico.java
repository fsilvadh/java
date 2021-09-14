public class CaixaEletronico {

    private Conta conta;

    public void autenticar(String numeroConta) {
        Cliente cliente = new Cliente();
        cliente.setNome("Fulano");
        cliente.setSobrenome("Fulano de Tal");

        ContaCorrente contaCorrente = new ContaCorrente(cliente, numeroConta);
        this.conta = contaCorrente;

        System.out.println("Bem vindo cliente: " + cliente.getNome());
    }

    public void exibirSaldo() {
        if (this.conta == null) {
            System.out.println("Faça primeiro sua autenticação!");
        } else {
            System.out.println("O seu saldo é " + this.conta.consultarSaldo());
        }
    }

    public void efetuarSaque(double valor) {
        if (this.conta == null) {
            System.out.println("Faça primeiro sua autenticação!");
        } else {
            this.conta.sacar(valor);
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("O seu novo saldo é " + this.conta.consultarSaldo());
        }
    }

    public void efetuarDeposito(double valor) {
        if (this.conta == null) {
            System.out.println("Faça primeiro sua autenticação!");
        } else {
            this.conta.depositar(valor);
            System.out.println("Depósito realizado com sucesso!");
            System.out.println("O seu novo saldo é " + this.conta.consultarSaldo());
        }
    }

    public void efetuarTransferencia(Conta destino, double valor){
        if (this.conta == null) {
            System.out.println("Faça primeiro sua autenticação!");
        } else {
            this.conta.transferir(valor, destino);
            System.out.println("Transferência realizada com sucesso!");
            System.out.println("O seu novo saldo é " + this.conta.consultarSaldo());
        }
    }

    public void encerrarUtilizacao(){
        this.conta = null;
    }

}
