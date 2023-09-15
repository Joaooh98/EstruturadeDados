package com.loiane.estruturadados.vetor.Vetor.Exercicio;

import java.util.ArrayList;

import com.loiane.estruturadados.vetor.domain.DomainExecicos.ListaEX;

public class ex02 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(5);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        System.out.println(arrayList.lastIndexOf("A"));

        ListaEX<String> lista = new ListaEX<String>(5);

        lista.Add("A");
        lista.Add("B");
        lista.Add("C");

        System.out.println(lista.ultimoIndece("A"));

    }
}
