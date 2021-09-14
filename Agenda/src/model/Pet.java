package model;

public abstract class Pet implements EmissorDeSom, Movimentador{

    private double peso;
    private double altura;


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String emitirSom() {
        return "Estou emitindo meu som específico";
    }

    @Override
    public String movimentar() {
        return "Caminhando com minhas patinhas";
    }
}
