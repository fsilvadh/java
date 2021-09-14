package model.pessoa;

public class PessoaXyz extends Pessoa {

    private String xyz;

    public PessoaXyz(String nome, String email) {
        super(nome, email);
    }

    public String getXyz() {
        return xyz;
    }

    public void setXyz(String xyz) {
        this.xyz = xyz;
    }

    @Override
    public String apresentarDocumento() {
        return "Meu documento é: " + xyz;
    }
}
