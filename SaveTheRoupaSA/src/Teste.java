import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        GuardaVolumes guardaVolumes = new GuardaVolumes();

        List<Peca> lista = new ArrayList<>();
        Peca peca1 = new Peca();
        peca1.setMarca("Hering");
        peca1.setModelo("Camiseta");
        Peca peca2 = new Peca();
        peca2.setMarca("Hering");
        peca2.setModelo("Bermuda");
        lista.add(peca1);
        lista.add(peca2);

        List<Peca> lista2 = new ArrayList<>();
        Peca peca3 = new Peca();
        peca3.setMarca("Hering");
        peca3.setModelo("Top");
        Peca peca4 = new Peca();
        peca4.setMarca("Hering");
        peca4.setModelo("Saia");
        lista2.add(peca3);
        lista2.add(peca4);

        System.out.println("Chave: " + guardaVolumes.guardarPecas(lista));
        System.out.println("Chave: " + guardaVolumes.guardarPecas(lista2));

        System.out.println("Qtd de peças armazenadas: " + guardaVolumes.mostrarQtdPecas());

        guardaVolumes.mostrarPecas();
        guardaVolumes.mostrarPecas(1);
        guardaVolumes.mostrarPecas(2);

        System.out.println("Removendo peças");
        guardaVolumes.devolverPecas(1);
        guardaVolumes.mostrarPecas();

        System.out.println("Qtd de peças armazenadas: " + guardaVolumes.mostrarQtdPecas());

    }


}
