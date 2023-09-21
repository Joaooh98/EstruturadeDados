package com.loiane.estruturadados.pilhas.ex;

import com.loiane.estruturadados.pilhas.Pilha;

public class ex06 {
    public static void main(String[] args) {
        resultado(" ");
        resultado("{[()]} ");
        resultado("{[()]}");
        resultado(" {[()]}");
        resultado("{}{}][}{][][[][][]]}]");
    }

    public static void resultado(String string) {
        System.out.println(string + "esta balanceado os simbolos? " + validarSimbolosBalanceados(string));
    }

    final static String ABRE = "([{";
    final static String FECHA = "]})";

    public static boolean validarSimbolosBalanceados(String string) {
        Pilha<Character> pilha = new Pilha<>();

        int index = 0;
        char simbolo, topo;

        while (index < string.length()) {
            simbolo = string.charAt(index);
            if (ABRE.indexOf(simbolo) > -1) {
                pilha.empilha(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                if (pilha.estaVazio()) {
                    return false;
                } else {
                    topo = pilha.desempilha();
                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {

                    }
                }
            }
            index++;
        }
        return true;
    }
}
