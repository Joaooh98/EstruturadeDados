package com.loiane.estruturadados.vetor.Vetor;

import com.loiane.estruturadados.vetor.domain.Vetor;

public class Aula08 {
    public static void main(String[] args) {
        var vetor = new Vetor(3);

        vetor.toAdd("B");
        vetor.toAdd("C");
        vetor.toAdd("E");
        vetor.toAdd("F");
        vetor.toAdd("G");
        
        System.out.println(vetor);
    }
}
