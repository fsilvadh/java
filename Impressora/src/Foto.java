public class Foto extends DocumentoGenerico implements Imprimivel {

    @Override
    public void imprimir(){
        System.out.println("Nome: " + getNome() + ", Tipo: " + getTipo() + ", sou uma self.");
    }
}
