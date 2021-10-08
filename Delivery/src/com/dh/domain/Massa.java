package com.dh.domain;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Massa extends Lanche {

    private final static int TEMPO_PREPARO = 30;

    public final static List<String> CARDAPIO_DE_MASSAS = Arrays.asList("MACARRÃO", "PIZZA", "LAZANHA");

    private String molho;
    private String tipo;

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Massa massa = (Massa) o;
        return Objects.equals(this.molho, massa.molho) && Objects.equals(this.tipo, massa.tipo);
    }

}
