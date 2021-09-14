import model.*;
import model.pessoa.Pessoa;
import model.pessoa.PessoaFisica;
import model.pessoa.PessoaJuridica;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa1 = new PessoaFisica("Fulano", "fulano@email.com.br", "123456");
        Pessoa pessoa2 = new PessoaJuridica("Beltrano", "beltrano@email.com.br");

        Pessoa[] pessoas = new Pessoa[2];

        pessoas[0] = pessoa1;
        pessoas[1] = pessoa2;

        imprimirPessoa(pessoa1);
        imprimirPessoa(pessoa2);

        System.out.println(pessoa1.retornarUmaString());
        System.out.println(pessoa2.retornarUmaString());
        System.out.println(((PessoaFisica) pessoa1).retornarUmaString("Teste"));

        Cachorro pet = new Cachorro();

        Carro carro1 = new Carro();

        identificarSom(pessoa1);
        identificarSom(pessoa2);
        identificarSom(pet);
        identificarSom(carro1);

        identificarMovimento(pessoa1);
        identificarMovimento(pet);
        identificarMovimento(carro1);

        carro1.teste();
    }

    public static void imprimirPessoa(Pessoa pessoa) {
        System.out.println(pessoa);
    }

    public static void identificarSom(EmissorDeSom emissom) {
        System.out.println(emissom.emitirSom());
    }

    public static void identificarMovimento(Movimentador movimentador) {
        System.out.println(movimentador.movimentar());
    }

    public static void indentificarDocumento(Pessoa pessoa) {
        System.out.println(pessoa.apresentarDocumento());
    }

}
