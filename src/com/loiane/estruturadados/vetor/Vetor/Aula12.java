package com.loiane.estruturadados.vetor.Vetor;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        arrayList.add(1, "B");

        System.out.println(arrayList);

        boolean exist = arrayList.contains("A");

        if (exist) {
            System.out.println("existe esse elemento no array");
        } else {
            System.out.println("nao existe esse elemento no array");
        }

        if (arrayList.contains("D")) {
            System.out.println("existe esse elemento no array");
        } else {
            System.out.println("nao existe esse elemento no array");
        }
        
        int pos = arrayList.indexOf("A");
        if (pos > -1) {
            System.out.println("existe esse elemento no array");
        } else {
            System.out.println("nao existe esse elemento no array");
        }

        System.out.println(arrayList.get(1)); //  e apresentado uma excepition caso nao tenha nada na posicao informada.

        arrayList.remove(0);
        arrayList.remove("C");

        System.out.println(arrayList);
        System.out.println(arrayList.size());

        /*
         * codigo fonte para mais informacoes sobre arrayList
         */

        // https://developer.classpath.org/doc/java/util/ArrayList-source.html
    }
}
