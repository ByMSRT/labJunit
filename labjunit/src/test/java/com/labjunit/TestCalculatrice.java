package com.labjunit;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculatrice {
    
    @Test
    public void testAddition() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(3, calculatrice.addition(1, 2));

    }
    
    @Test
    public void testSoustraction() {
        Calculatrice calculatrice = new Calculatrice();
        assertEquals(-1, calculatrice.soustraction(1, 2));
    }
    
}
