package com.krakedev.aliens.test.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienJUnit {
	
	@Test
	public void testAlienCrear() {
		Alien a1 = new Alien(2, "Verde"); //tamaño minimo
		assertEquals(5, a1.getTamanio());
        assertEquals("Verde", a1.getColor());
        
        
        Alien a2 = new Alien(50, "Rojo");  //debe ajustarse a 30
        assertEquals(30, a2.getTamanio(), "El tamaño máximo debe ser 30");
        assertEquals("Rojo", a2.getColor());
        
        
	}
	

}
