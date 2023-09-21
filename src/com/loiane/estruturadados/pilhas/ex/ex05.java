package com.loiane.estruturadados.pilhas.ex;

import com.loiane.estruturadados.pilhas.Pilha;

public class ex05 {
    public static void main(String[] args) {       
        resultado("ADA");
        resultado("SOCOS");
        resultado("AJUDA");
    }

    public static void resultado(String string){
        System.out.println(string + " e palidromo? " + validadorPalidramo(string));
    }

    public static boolean validadorPalidramo(String string){
        Pilha<Character> pilha = new Pilha<>();

        for (int i = 0; i < string.length(); i++) {
            pilha.empilha(string.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.estaVazio()) {
            palavraInversa += pilha.desempilha();
        }

        if (palavraInversa.equalsIgnoreCase(string)) {
            return true;
        }
        return false;
    }

}
