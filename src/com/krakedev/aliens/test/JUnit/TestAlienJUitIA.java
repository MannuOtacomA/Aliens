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
        
        
        Alien a4 = new Alien(10, "Verde");
        a4.agregarBrazos(6);  // Agrega 6 brazos (válido)
        assertFalse(a4.agregarBrazos(5));  // 6 + 5 = 11 > 10, debe fallar
        assertEquals(6, a4.getNumeroBrazos());  // Debe permanecer en 6, no cambiar
        
        
        //precio
        Alien a5 = new Alien(15, "Rojo");
     // Alien de 15 cm: precioCuerpo = 15 * 0.20 = 3.0
        a5.calcularPrecioTotal();
        assertEquals(3.0, a5.getPrecioTotal(), 0.001,"El precio total debe ser igual al precio del cuerpo cuando no hay extremidades ni ojos");
    
        
     // Alien de 15 cm: cuerpo=3.0, extremidad=1.5
        a5.agregarBrazos(2);
        a5.agregarPiernas(3);
        a5.calcularPrecioTotal();
        
        // Total = 3.0 + (5 * 1.5) = 3.0 + 7.5 = 10.5
        assertEquals(10.5, a5.getPrecioTotal(), 0.001,
                "El precio total debe incluir el cuerpo más las extremidades");
        
        
	}	

}
