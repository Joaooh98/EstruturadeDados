package com.loiane.estruturadados.filas.test;

import com.loiane.estruturadados.filas.domain.Fila;

public class Aula22 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila);

        System.out.println("elemento removido da fila :"+fila.desenfileirar());

        System.out.println(fila);
    }
}
