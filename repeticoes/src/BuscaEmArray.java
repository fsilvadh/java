public class BuscaEmArray {

    public static void main(String[] args) {

        //entrada de dados
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int elemento = 10;
        int posicao;

        //processamento
        posicao = buscarPosicaoElemento(numeros, elemento);

        //saída de dados
        if (posicao == -1) {
            System.out.println("O elemento " + elemento + " não foi localizado");
        } else {
            System.out.println("O elemento " + elemento + " está na posição " + posicao);
        }

    }

    public static int buscarPosicaoElemento(int[] numeros, int elemento) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == elemento) {
                return i;
            }
        }

        return -1;
    }


}
