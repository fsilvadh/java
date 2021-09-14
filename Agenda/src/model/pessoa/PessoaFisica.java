package model.pessoa;

public class PessoaFisica extends Pessoa {

    private String cpf;

    @Override
    public String apresentarDocumento() {
        return "Meu cpf é: " + cpf;
    }

    public PessoaFisica(String nome, String email) {
        super(nome, email);
    }

    public PessoaFisica(String nome, String email, String cpf) {
        super(nome, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Meu nome é: " + getNome() + " e meu email é: " + getEmail() + " e meu cpf é: " + cpf;
    }

    @Override
    public String retornarUmaString() {
        return "Qualquer coisa de pessoa física: ";
    }

    public String retornarUmaString(String mensagem) {
        return retornarUmaString() + ". " + mensagem;
    }
}
