package com.loiane.estruturadados.filas.test;

import com.loiane.estruturadados.filas.domain.Fila;

public class Aula20 {
    public static void main(String[] args) {
        var fila = new Fila<Integer>();

        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila.estaVazio());
        System.out.println(fila.tamanho());

        System.out.println(fila);
    }
}
