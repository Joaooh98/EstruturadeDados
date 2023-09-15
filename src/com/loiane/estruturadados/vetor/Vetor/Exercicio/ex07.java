package com.loiane.estruturadados.vetor.Vetor.Exercicio;

import java.util.ArrayList;
import java.util.List;

import com.loiane.estruturadados.vetor.domain.Contato;

public class ex07 {
    // utilize a classe ArrayList e desenvolva os seguintes items:

    // 1. crie uma lista

    // 2. passe todos os contatos do vetor para o arrayList

    // 3. crie um exemplo para utilizar cada metodo da classe ArrayList(somente os
    // metodos que implementamos de forma similar a clase lista )

    public static void main(String[] args) {
        ArrayList<Contato> arrayList = new ArrayList<>();

        criarContatosDinamicamente(5, arrayList);

        System.out.println(arrayList);

    }

    private static void criarContatosDinamicamente(int quantidade, List<Contato> lista) {
        Contato contato;

        for (int i = 1; i <= quantidade; i++) {

            contato = new Contato();
            contato.setName("Contato " + i);
            contato.setEmail("new" + i + "@gmail.com");
            contato.setTelefone("(45) 3657-" + i);

            lista.add(contato);
        }
    }
}
