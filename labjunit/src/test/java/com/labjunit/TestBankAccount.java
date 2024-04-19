package com.labjunit;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestBankAccount {

    @Test
    public void debiter() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.crediter(200);
        bankAccount.debiter(50);
        assertEquals(150, bankAccount.getSolde(), 0);
    }

    @Test
    public void crediter() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.crediter(200);
        assertEquals(200, bankAccount.getSolde(), 0);
    }

    @Test
    public void debiterNegatif() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.crediter(600);
        try {
            bankAccount.debiter(-600);
            fail("Exception not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(600, bankAccount.getSolde(), 0);
        }
    }

    @Test
    public void debiterSuperieur() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.crediter(100);
        try {
            bankAccount.debiter(150);
            fail("Exception not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(100, bankAccount.getSolde(), 0);
        }
    }

    @Test
    public void crediterNegatif() {
        BankAccount bankAccount = new BankAccount();
        try {
            bankAccount.crediter(-100);
            fail("Exception not thrown");
        } catch (IllegalArgumentException e) {
            assertEquals(0, bankAccount.getSolde(), 0);
        }
    }

    @Test
    public void getSolde() {
        BankAccount bankAccount = new BankAccount();
        assertEquals(0, bankAccount.getSolde(), 0);
    }
}
