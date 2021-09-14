public class SistemaFinanceiro {

    public static void main(String[] args) {

        Cliente destinatario = new Cliente();
        destinatario.setNome("Beltrano");
        destinatario.setSobrenome("de Tal");
        Conta contaDestino = new ContaCorrente(destinatario);

        CaixaEletronico caixaEletronico = new CaixaEletronico();
        caixaEletronico.autenticar("2");
        caixaEletronico.exibirSaldo();
        caixaEletronico.efetuarDeposito(1000);
        caixaEletronico.efetuarSaque(20);
        caixaEletronico.efetuarTransferencia(contaDestino, 40);
        caixaEletronico.encerrarUtilizacao();

    }

}
