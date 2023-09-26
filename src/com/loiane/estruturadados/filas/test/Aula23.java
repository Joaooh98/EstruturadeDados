package com.loiane.estruturadados.filas.test;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>(); // necessario declar a interface para garantir o padrao FIFO
        fila.add(1);
        fila.add(2);

        System.out.println(fila);
        System.out.println(fila.peek()); // espiar 
        System.out.println(fila.remove()); // remover

        System.out.println(fila); // remover
    }
}
