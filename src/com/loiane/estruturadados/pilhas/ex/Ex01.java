package com.loiane.estruturadados.pilhas.ex;

import java.util.Scanner;

import com.loiane.estruturadados.pilhas.Pilha;

public class Ex01 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        try 
        (var scan = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Entre com um numero: ");

                int num = scan.nextInt();

                if (num % 2 == 0) {
                    System.out.println("inserido o numero par na pilha:" + num);
                    pilha.empilha(num);
                } else {
                    if (pilha.estaVazio()) {
                        System.out.println("Pilha esta vazia");
                    } else {
                        System.out.println(num + "numero impar esta sendo removido da pilha");
                        pilha.desempilha();
                    }
                }
            }
        }

        while (!pilha.estaVazio()) {
            System.out.println("removendo elemento"+pilha+" da pilha");
            pilha.desempilha();
        }

        System.out.println("todos os elementos foi removido da pilha");
    }
}
