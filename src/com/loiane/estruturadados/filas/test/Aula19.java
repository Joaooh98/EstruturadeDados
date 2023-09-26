package com.loiane.estruturadados.filas.test;

import com.loiane.estruturadados.filas.domain.Fila;

public class Aula19 {
    public static void main(String[] args) {
        var fila = new Fila<Integer>();
        
        System.out.println(fila.estaVazio());
        System.out.println(fila.tamanho());

        System.out.println(fila);
    }
}
