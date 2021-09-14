package model.pessoa;

public class PessoaJuridica extends Pessoa {

    private String cnpj;

    @Override
    public String apresentarDocumento() {
        return "Meu cnpj é: " + cnpj;
    }

    public PessoaJuridica(String nome, String email) {
        super(nome, email);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString(){
        return "Meu nome é: " + getNome() + " e meu email é: " + getEmail() + " e meu cnpj é: " + cnpj;
    }

}
