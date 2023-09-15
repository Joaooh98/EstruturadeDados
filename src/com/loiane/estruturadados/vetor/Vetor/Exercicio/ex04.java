package com.loiane.estruturadados.vetor.Vetor.Exercicio;

import com.loiane.estruturadados.vetor.domain.Lista;

public class ex04 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(5);

        lista.Add("A");
        lista.Add("B");
        lista.Add("C");
        lista.Add("D");
        lista.Add("E");
        
        System.out.println("--------------------");

        System.out.println(lista.obtem(0));
        System.out.println(lista.obtem(1));
        System.out.println(lista.obtem(4));
    }
}
