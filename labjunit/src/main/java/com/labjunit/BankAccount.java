package com.labjunit;

public class BankAccount {
    private double solde;
    
    public void debiter(double montant) {
        
        if(montant < 0) {
            throw new IllegalArgumentException("Le montant doit être positif");
        }
        
        if(montant > solde) {
            throw new IllegalArgumentException("Le montant à débiter est supérieur au solde du compte");
        }
        /* Test */
        solde -= montant;
    }

    public void crediter(double montant) {
        
        if(montant < 0) {
            throw new IllegalArgumentException("Le montant doit être positif");
        }
        solde += montant;
    }

    public double getSolde() {
        return solde;
    }
}
