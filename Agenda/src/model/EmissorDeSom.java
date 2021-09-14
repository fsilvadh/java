package model;

public interface EmissorDeSom {

    public String emitirSom();

    default void teste() {
        System.out.println("passando pelo teste");
    }

}
