package br.com.minhaempresa.domain;

import java.time.LocalDate;

public class Ferias {

    private LocalDate dataInicio;
    private LocalDate dataFim;

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Ferias - " + "dataInicio: " + dataInicio + ", dataFim: " + dataFim;
    }
}
