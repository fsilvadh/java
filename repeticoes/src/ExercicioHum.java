import java.time.LocalDate;

public class ExercicioHum {

    public static void main(String[] args) {

        //entrada de dados
        int anoInicial = 2001;
        LocalDate dataAtual = LocalDate.now();

        int anoAtual = 2000;

        double salarioInicial = 1000;
        double aumentoInicial = 0.015;
        double salarioAtual = salarioInicial;
        double aumentoAtual = aumentoInicial;

        //lógica de processamento
        int ano = anoInicial + 1;

        //com o comando while
        //        while (ano <= dataAtual.getYear()) {
        //            aumentoAtual = (ano == 1996) ? aumentoAtual : aumentoAtual * 2;
        //            salarioAtual += salarioAtual * (aumentoAtual);
        //            ano++;
        //        }

        //com o comando do..while
        do {
            aumentoAtual = (ano == 1996) ? aumentoAtual : aumentoAtual * 2;
            salarioAtual += salarioAtual * (aumentoAtual);
            ano++;
        } while (ano <= anoAtual);


        //saída de dados
        System.out.println("O salário atual do funcionário é: " + salarioAtual);

    }

}
