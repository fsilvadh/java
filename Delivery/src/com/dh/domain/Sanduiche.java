package com.dh.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sanduiche extends Lanche {

    private final static int TEMPO_PREPARO = 15;

    public final static List<String> INGREDIENTES_DISPONIVEIS =
            Arrays.asList("Pão", "Queijo", "Presunto", "Ovo de Codorna", "Carne", "Alface", "Tomate");

    private List<String> ingredientes = new ArrayList<>();

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
