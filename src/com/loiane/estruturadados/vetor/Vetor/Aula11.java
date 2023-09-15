package com.loiane.estruturadados.vetor.Vetor;

import com.loiane.estruturadados.vetor.domain.VetorObject;

public class Aula11 {
    public static void main(String[] args) {
        var vet = new VetorObject(3);

        vet.Add(1);
        vet.Add("elemento String");

        System.out.println(vet+"[1, elemento String]\n"+"isso quebrou o conceito da estrutura de dados com Vetor que e\n * um vetor ou array e a estrutura de dados mais simples que existe.\n * um vetor armazena uma sequencia de valores onde todos sao do mesmo tipo."); 
    }
}
