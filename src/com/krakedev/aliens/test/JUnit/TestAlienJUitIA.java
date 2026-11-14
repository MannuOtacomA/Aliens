package com.krakedev.aliens.test.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.krakedev.aliens.Alien;

public class TestAlienJUitIA {
	
	@Test
	public void TestAlienJUnitIA(){
		Alien a1 = new Alien(10, "Verde");
	    assertTrue(a1.agregarBrazos(0));  // Agregar 0 debería ser válido
	    assertEquals(0, a1.getNumeroBrazos());
	    
	    
	    Alien a2 = new Alien(10, "Verde");
        assertTrue(a2.agregarBrazos(5));
        assertEquals(5, a2.getNumeroBrazos());  // Debería ser 5
        
        
        Alien a3 = new Alien(10, "Verde");
        assertFalse(a3.agregarBrazos(11));  // 11 > 10, debe fallar
        assertEquals(0, a3.getNumeroBrazos());  // No cambia
	}	

}
