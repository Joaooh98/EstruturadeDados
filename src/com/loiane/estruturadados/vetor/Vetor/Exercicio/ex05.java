package com.loiane.estruturadados.vetor.Vetor.Exercicio;

import java.util.ArrayList;

import com.loiane.estruturadados.vetor.domain.Lista;

public class ex05 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println(arrayList);

        arrayList.clear();

        System.out.println(arrayList);

        Lista<String> lista = new Lista<>(5);

        lista.Add("A");
        lista.Add("B");
        lista.Add("C");
        lista.Add("D");
        lista.Add("E");

        System.out.println("--------------------");

        lista.limpar();

        System.out.println(lista);

        lista.limparOpTwo();

        System.out.println(lista);
    }
}
