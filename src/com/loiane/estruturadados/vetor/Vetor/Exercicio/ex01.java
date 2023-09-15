package com.loiane.estruturadados.vetor.Vetor.Exercicio;

import com.loiane.estruturadados.vetor.domain.DomainExecicos.ListaEX;
@SuppressWarnings("all")
public class ex01 {
    public static void main(String[] args) {
        ListaEX<String> lista = new ListaEX(5);

        lista.Add("A");       
        lista.Add("B");       
        lista.Add("C");       
        lista.Add("D"); 

        System.out.println(lista.contem("C"));     
        System.out.println(lista.contem("B"));     
        System.out.println(lista.contem("F"));
    }
}
