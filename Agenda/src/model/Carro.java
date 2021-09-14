package model;

public class Carro implements EmissorDeSom, Movimentador {

    @Override
    public String emitirSom() {
        return "Barulho do meu motor";
    }

    @Override
    public String movimentar() {
        return "Girando minhas rodas";
    }
}
