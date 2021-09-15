public class Memorando extends DocumentoGenerico {

    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public void imprimir() {
        System.out.println(this.numero);
    }
}
