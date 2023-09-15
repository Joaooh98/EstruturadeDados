package com.loiane.javaBasico.loianeSynchronized;

public class MyThreadSum implements Runnable{

    private String name;

    private int[] nums;

    private static Calculator calc = new Calculator();
    
    
    public MyThreadSum(String name, int[] nums) {
        this.name = name;
        this.nums = nums;
    
        new Thread(this, name).start();
    }


    @Override
    public void run() {
        System.out.println(this.name + "iniciada");
        int sum =  calc.sumArray(this.nums);
        System.out.println("Resultado da soma para Thread "+ this.name + " e: " + sum);
        System.out.println(this.name + "terminando ");
    }
    
}
