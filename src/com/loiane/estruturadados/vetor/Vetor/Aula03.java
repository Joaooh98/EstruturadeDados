package com.loiane.estruturadados.vetor.Vetor;

import com.loiane.estruturadados.vetor.domain.Vetor;

public class Aula03 {
    public static void main(String[] args) {

        var vetor = new Vetor(2);
        
        // vetor.adicionar("elemento 01");
        // vetor.adicionar("elemento 02");
        
        vetor.toAdd("elemento 01");
        vetor.toAdd("elemento 02");
        vetor.toAdd("elemento 03");
      
        // try {
        //     vetor.to_add("elemento");
        //     vetor.to_add("elemento");
        //     vetor.to_add("elemento");
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
    }
}
