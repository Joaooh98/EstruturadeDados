package com.loiane.estruturadados.pilhas.ex;

import java.util.Scanner;

import com.loiane.estruturadados.pilhas.Pilha;

public class Ex02 {
    // Escreva um progama que leia 10 numeros. Para cada numero lido, verifique e
    // codifique de acordo com as regras a seguir:

    // 1. Se o numero for par, empilhe na pilha chamada par;
    // 2. Se o numro for impar, empilhe na pilha chamada impar;
    // 3. Se o numero for 0, desempilhe um elemento de cada pilha, caso alguma pilha
    // esteja vazia, mostre uma mensagem de erro na tela;

    // Ao finaldo program desenpilhe todos os elementos das duas pilhas,
    // imprimindo-os na tela
    public static void main(String[] args) {
        Pilha<Integer> impar = new Pilha<>();
        Pilha<Integer> par = new Pilha<>();

        try (var scan = new Scanner(System.in)) {

            for (int i = 0; i <= 10; i++) {
                System.out.println("Informe um numero: ");
                int num = scan.nextInt();
                
                if (num % 2 == 0) {
                    System.out.println("numero par"+num);
                    
                    par.empilha(num);
                }
                if (num % 2 != 0) {
                    System.out.println("numero impa"+num);
                    impar.empilha(num);
                } 
                if (num == 0) {
                    removerUmDeCadaPilha(impar, par);
                } 
                if (i == 10) {
                    System.out.println(impar);
                    System.out.println(par);
                    limparPilha(impar, par);;
                } 
            }
        }
    }

    private static void limparPilha(Pilha<Integer> impar, Pilha<Integer> par) {

        while (!impar.estaVazio() || !par.estaVazio()) {
            impar.desempilha();
            par.desempilha();
        }
        System.out.println("todos os elementos foi removido da pilha");
    }

    private static void removerUmDeCadaPilha(Pilha<Integer> impar, Pilha<Integer> par) {
        try {
            if (impar.estaVazio() || par.estaVazio()) {
                throw new Exception();
            }
            
            System.out.println("removendo um elemento de cada pilha");
            impar.desempilha();
            par.desempilha();
    
            System.out.println("todos os elementos foi removido da pilha");

        } catch (Exception e) {
            System.out.println("nao e possivel remover um elemento de uma pilha vazia");
        }
    }
}