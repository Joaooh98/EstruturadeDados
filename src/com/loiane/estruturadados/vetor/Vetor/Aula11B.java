package com.loiane.estruturadados.vetor.Vetor;

import com.loiane.estruturadados.vetor.domain.Contato;
import com.loiane.estruturadados.vetor.domain.Lista;

public class Aula11B {
    public static void main(String[] args) {
        Lista<String> vetor = new Lista<>(1);

        vetor.Add("Elemento");
        
        Lista<Contato> vetore = new Lista<Contato>(1);

        var c1 = new Contato("joao", "45-998214609", "joao@gmail.com");
        var c2 = new Contato("joao carlos", "45-998214608", "joaoc@gmail.com");
        var c3 = new Contato("joao carlos de paiva", "45-998214607", "joaocp@gmail.com.br");

        vetore.Add(c1);
        vetore.Add(c2);
        vetore.Add(c3);

    }
}
