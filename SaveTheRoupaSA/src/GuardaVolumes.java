import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {

    private Map<Integer, List<Peca>> secoes = new HashMap<>();
    private Integer identificadorAtual = 0;

    public Integer guardarPecas(List<Peca> listaDePecas) {
        identificadorAtual += 1;
        secoes.put(identificadorAtual , listaDePecas);
        return identificadorAtual;
    }

    public void mostrarPecas() {
        for (Integer chave : secoes.keySet()) {
            mostrarPecas(chave);
        }
    }

    public void mostrarPecas(Integer chave) {
        List<Peca> pecas = secoes.get(chave);
        System.out.println("Número da chave: " + chave);
        pecas.stream().forEach(System.out::println);

        //com lambda
        //        pecas.stream().forEach(peca -> System.out.println(peca));

        //com for
        //        for (Peca peca : pecas) {
        //            System.out.println(peca);
        //        }
    }

    public void devolverPecas(Integer chave){
        secoes.remove(chave);
    }

    public Integer mostrarQtdPecas() {
//        Integer totalPecas = 0;
//        for (Integer chave : secoes.keySet()) {
//            totalPecas += secoes.get(chave).size();
//        }

        Integer soma = Integer.sum(1, 2);


//        return secoes.keySet().stream()
//                .map(chave -> secoes.get(chave).size())
//                .reduce(0, (total, qtd) -> total + qtd);

        return secoes.keySet().stream()
                .map(chave -> secoes.get(chave).size())
                .reduce(0, Integer::sum);


        /*

                1, List<pecas> : 2
                2, List<pecas> : 8
            '   3, List<pecas> : 1

                map
                2
        '       8
                1
         */



    }

    public Integer getIdentificadorAtual() {
        return identificadorAtual;
    }

    public void setIdentificadorAtual(Integer identificadorAtual) {
        this.identificadorAtual = identificadorAtual;
    }
}
