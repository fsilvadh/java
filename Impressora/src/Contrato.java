public class Contrato extends DocumentoGenerico implements Imprimivel {

    @Override
    public void imprimir(){
        System.out.println("Nome: " + getNome() + ", Tipo: " + getTipo() + ", sou um contrato muito legal também.");
    }

}
