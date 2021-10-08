package com.dh.view;

import com.dh.domain.Massa;
import com.dh.domain.Sanduiche;

public class PraticaDeEquals {

    public static void main(String[] args) {

        Massa massa1 = new Massa();
        massa1.setTipo("Macarrão");
        massa1.setMolho("Pesto");

        Massa massa2 = new Massa();
        massa2.setTipo("Macarrão");
        massa2.setMolho("Pesto");

        Sanduiche sanduiche= new Sanduiche();

        System.out.println(massa1.equals(massa2));
        System.out.println(massa1.equals(massa1));
        System.out.println(massa1.equals(null));
        System.out.println(massa1.equals(sanduiche));

    }

}
