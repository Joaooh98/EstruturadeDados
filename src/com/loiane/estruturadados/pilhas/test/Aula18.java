package com.loiane.estruturadados.pilhas.test;

import java.util.Stack;

import com.loiane.estruturadados.pilhas.Pilha;

public class Aula18 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        Stack<Integer> stack = new Stack<>();

        System.out.println(pilha.estaVazio());
        System.out.println(stack.isEmpty());

        System.out.println(pilha.tamanho());
        System.out.println(stack.size());

        pilha.empilha(1);
        stack.push(1);
        pilha.empilha(2);
        stack.push(2);
        pilha.empilha(3);
        stack.push(3);

        System.out.println(stack);
        System.out.println(pilha);

        System.out.println(pilha.desempilha());
        System.out.println(stack.pop());

        System.out.println(stack);
        System.out.println(pilha);

        System.out.println(pilha.tamanho());
        System.out.println(stack.peek());

        System.out.println(stack);
        System.out.println(pilha);
    }
}
