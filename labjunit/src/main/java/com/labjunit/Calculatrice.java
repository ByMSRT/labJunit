package com.labjunit;

public class Calculatrice {

    public int addition(int a, int b) {
        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("les nombres doivent être positifs");
        }
        return a + b;
    }

    public int soustraction(int a, int b) {
        if(a < 0 || b < 0) {
            throw new IllegalArgumentException("les nombres doivent être positifs");
        }
        return a - b;
    }

    

}
