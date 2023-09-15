package com.loiane.estruturadados.vetor.Vetor;

import com.loiane.estruturadados.vetor.domain.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        // B G D E F -> POSICAO A SER REMOVIDA E 1 (G)
        // 0 1 2 3 4 -> TAMANHO e 5 ou elementos[5]
        var vetor = new Vetor(5);

        vetor.toAdd("B");
        vetor.toAdd("G");
        vetor.toAdd("D");
        vetor.toAdd("E");
        vetor.toAdd("F");

        System.out.println(vetor);
        
        vetor.removeElement(1);
        
        System.out.println(vetor);

        System.out.println("remover o elemento E");

        int pos = vetor.busca("E");

        if (pos > -1) {
            vetor.removeElement(pos);
        } else{
            System.out.println("nao existe o elemento dentro do vetor ");
        }

        System.out.println(vetor);
    }
}
