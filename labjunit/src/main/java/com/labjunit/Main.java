package com.labjunit;

public class Main {
    public static void main(String[] args) {
        Calculatrice calculatrice = new Calculatrice();
        
        double s = calculatrice.addition(1, 2);
        System.out.println("1 + 2 = " + s);

        s = calculatrice.soustraction(1, 2);
        System.out.println("1 - 2 = " + s);
    }
}