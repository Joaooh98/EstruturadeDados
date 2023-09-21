package com.loiane.estruturadados.pilhas.ex;

import java.util.Stack;

public class Ex07 {
    public static void main(String[] args) {
        resultado(0);
        resultado(10);
        resultado(34);
        resultado(1998);
     
        resultadoBase(0,16);
        resultadoBase(10, 8);
        resultadoBase(34, 16);
        resultadoBase(1998, 8);
    }

    public static void resultado(int numero){
        System.out.println(numero + " em binario : "+decimalBinario(numero));
    }
    
    public static void resultadoBase(int numero, int base){
        System.out.println(numero + " na base "+base+" : "+decimalBinarioBase(numero, base));
    }

    public static String decimalBinario(int numero){
        Stack<Integer> pilha = new Stack<>();
        String numBinario = "";
        int resto;

        while(numero > 0){
            resto = numero % 2;
            pilha.push(resto);
            numero /= 2; 
        }
        while (!pilha.isEmpty()) {
            numBinario += pilha.pop(); // desenpilha e adiciona na minha String;
        }
        return numBinario;
    }

    public static String decimalBinarioBase(int numero, int base){
        if (base > 16) {
            throw new IllegalArgumentException();
        }
        Stack<Integer> pilha = new Stack<>();
        String numBinario = "";
        int resto;
        String baseS = "0123456789ABCDEF";

        while(numero > 0){
            resto = numero % base;
            pilha.push(resto);
            numero /= base; 
        }
        while (!pilha.isEmpty()) {
            numBinario += baseS.charAt(pilha.pop()); // desenpilha e adiciona na minha String;
        }
        return numBinario;
    }
}
