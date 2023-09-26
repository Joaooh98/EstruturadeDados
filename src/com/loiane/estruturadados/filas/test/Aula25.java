package com.loiane.estruturadados.filas.test;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.loiane.estruturadados.filas.domain.Paciente;

public class Aula25 {
    public static void main(String[] args) {
        Queue<Paciente> filaComPrioridade = new PriorityQueue<>(

                new Comparator<Paciente>() {
                    @Override
                    public int compare(Paciente pacienteOne, Paciente pacienteTwo) {
                        return Integer.valueOf(pacienteOne.getPrioridade()).compareTo(pacienteTwo.getPrioridade());
                    }
                });

        filaComPrioridade.add(new Paciente("Maria", 2));
        filaComPrioridade.add(new Paciente("Jose", 4));
        filaComPrioridade.add(new Paciente("Josue", 3));
        filaComPrioridade.add(new Paciente("Vanessa", 1));

        System.out.println(filaComPrioridade);
    }
}
