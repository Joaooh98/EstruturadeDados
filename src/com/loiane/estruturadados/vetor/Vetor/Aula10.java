package com.loiane.estruturadados.vetor.Vetor;

import com.loiane.estruturadados.vetor.domain.Contato;
import com.loiane.estruturadados.vetor.domain.VetorObject;

public class Aula10 {
    public static void main(String[] args) {
        var vet = new VetorObject(3);

        vet.Add(3);
        vet.Add(4);
        vet.Add(5);

        System.out.println("\n Tamanho int = " + vet.tamanho());

        vet.Add("3");
        vet.Add("4");
        vet.Add("5");

        System.out.println("\n Tamanho String = " + vet.tamanho());

        var c1 = new Contato("joao", "45-998214609", "joao@gmail.com");
        var c2 = new Contato("joao carlos", "45-998214608", "joaoc@gmail.com");
        var c3 = new Contato("joao carlos de paiva", "45-998214607", "joaocp@gmail.com.br");

        var c4 = new Contato("joao carlos de paiva", "45-998214607", "joaocp@gmail.com.br");

        vet.Add(c1);
        vet.Add(c2);
        vet.Add(c3);

        System.out.println("adicionando objeto "+vet.tamanho());
        System.out.println(vet);

        int pos = vet.busca(c1);
        if (pos > -1) {
            System.out.println("Elemento existe no vetor ");
        } else {
            System.out.println("Elemento nao existe no vetor ");
        }

        int pos1 = vet.busca(c4);
        if (pos1 > -1) {
            System.out.println("Elemento existe no vetor ");
        } else {
            System.out.println("Elemento nao existe no vetor ");
        }

    }
}
