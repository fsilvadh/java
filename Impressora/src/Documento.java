public class Documento extends DocumentoGenerico implements Imprimivel{

    @Override
    public void imprimir(){
        System.out.println("Nome: " + getNome() + ", Tipo: " + getTipo() + ", sou um docuemnto muito legal.");
    }

}
