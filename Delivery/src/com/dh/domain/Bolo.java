package com.dh.domain;

import java.util.Arrays;
import java.util.List;

public class Bolo extends Lanche {

    private final static int TEMPO_PREPARO = 10;

    public final static List<String> CARDAPIO_DE_BOLOS = Arrays.asList("Chocolate", "Cenoura com Chocolate", "Côco Gelado");

    private String massa;
    private String recheio;
    private String cobertura;

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }
}
