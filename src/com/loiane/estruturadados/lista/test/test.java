package com.loiane.estruturadados.lista.test;

import com.loiane.estruturadados.lista.ListaEncadeada;

public class test {
    public static void main(String[] args) {
        ListaEncadeada<Integer> list = new ListaEncadeada<>();
        
        System.out.println("tamanho = "+ list.getTamanho());
        list.adiciona(1);
        System.out.println(list);
        System.out.println("tamanho = "+ list.getTamanho());

        list.adiciona(2);
        System.out.println(list);
        
        list.adiciona(3);
        System.out.println(list);
    }
}
