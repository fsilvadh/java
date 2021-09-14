public class Loop {

    public static void main(String[] args) {

        int i = 0;
        int par = 0;
        int impar = 0;

        for (int y = 0; y < 20; y++){
            if (y % 2 == 0){
                par += y;
            } else if (i % 2 != 0) {
                impar += y;
            }
        }

        while (i < 20){
            int resto = i % 2;
            if (resto == 0){
                par += i;
            } else {
                impar += i;
            }
            i++;
        }

        do {
            if (i % 2 == 0){
                par += i;
            } else if (i % 2 != 0) {
                impar += i;
            }
            i++;
        }while(i < 20);

        System.out.println(par);
        System.out.println(impar);
    }


    private static boolean retornaValorCondicao(int i) {
        return i < 10;
    }
}
