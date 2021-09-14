public class HelloWorld {

    private String mensagem;

    public void exibirMensagem() {
        mensagem = "HelloWolrd";
        System.out.println(mensagem);
    }

    public static void main(String[] args) {
        HelloWorld programa = new HelloWorld();
        programa.exibirMensagem();
    }

}
