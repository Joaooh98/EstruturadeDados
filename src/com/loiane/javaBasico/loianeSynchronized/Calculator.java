package com.loiane.javaBasico.loianeSynchronized;

public class Calculator {

    private int soma;

    public synchronized int sumArray(int[] array) {
        soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
            System.out.println("Execute a soma " + Thread.currentThread().getName() + "soma o valor " + array[i]
                    + " com total de " + soma);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return soma;
    }
}
