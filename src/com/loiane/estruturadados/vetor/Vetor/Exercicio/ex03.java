package com.loiane.estruturadados.vetor.Vetor.Exercicio;

import com.loiane.estruturadados.vetor.domain.Lista;

public class ex03 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.Add("A");
        lista.Add("B");
        lista.Add("C");
        lista.Add("D");
        lista.Add("E");

        System.out.println(lista);

        lista.removeElement("A");
        
        System.out.println(lista);

    }
}
