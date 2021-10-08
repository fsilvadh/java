package br.com.minhaempresa.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tb_conta_conjunta")
public class ContaConjunta extends Conta {

//    private List<Cliente> outrosTitulares = new ArrayList<>();

    public ContaConjunta(Cliente titular) {
        super(titular);
    }

//    public List<Cliente> getOutrosTitulares() {
//        return outrosTitulares;
//    }
//
//    public void setOutrosTitulares(List<Cliente> outrosTitulares) {
//        this.outrosTitulares = outrosTitulares;
//    }
}
