public class TrabalhandoComArrays {

    public static void main(String[] args) {


        int[] arrayDeInteiros = new int[10];
        String[] operacoes = {"soma", "subtração", "multiplicação", "divisão"};


        int[][] matrizDeInteiros = new int[5][5];


        for (int i = 0; i < 10; i++){
            System.out.println(arrayDeInteiros[i]);
        }


        for (int i = 0; i < 5; i++) {
            for (int y = 0; y < 5; y++){
                System.out.println(matrizDeInteiros[i][y]);
            }
        }


    }

}
