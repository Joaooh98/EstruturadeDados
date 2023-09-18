package com.loiane.estruturadados.pilhas.test;

import com.loiane.estruturadados.pilhas.Pilha;

public class Aula17 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println(pilha.toString());

        System.out.println("desempilhando o elemento ".concat(pilha.desempilha().toString()));

        System.out.println(pilha.toString());
    }
}
