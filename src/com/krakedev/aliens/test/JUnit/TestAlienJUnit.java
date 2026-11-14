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
        
        
        Alien a3 = new Alien(20, "Morado"); // Precio cuerpo = 20 * 0.20 = 4.0
        assertEquals(4.0, a3.getPrecioCuerpo(), 0.001);
                
        assertEquals(2.0, a3.getPrecioExtremidad(), 0.001); // Precio extremidad = 20 * 0.10 = 2.0        
        assertEquals(1.0, a3.getPrecioOjo(), 0.001); // Precio ojo = 20 * 0.05 = 1.0
        
        
	}
	

}
