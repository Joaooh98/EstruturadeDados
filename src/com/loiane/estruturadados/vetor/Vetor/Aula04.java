package com.loiane.estruturadados.vetor.Vetor;

import com.loiane.estruturadados.vetor.domain.Vetor;


public class Aula04 {
    public static void main(String[] args) {
        
        var vetor = new Vetor(10);

        vetor.toAdd("elemento 01");
        vetor.toAdd("elemento 02");
        vetor.toAdd("elemento 03");

        System.out.println(vetor.tamanho());

        System.out.println(vetor.toString());
    }
}
