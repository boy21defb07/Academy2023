package PruebaUnitaria;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import prueba1.prueba;

public class pruebaTest {

	@Test		
	public void testMin() {
	        assertEquals(-110, prueba.Min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
	        assertEquals(0, prueba.Min(new int[]{42, 54, 65, 87, 0}));
	        
	    }
	@Test
	public void testMax() {
		
		assertEquals(566, prueba.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, prueba.max(new int[]{5}));
	}
	@Test
	public void testall() {
		//pruebas de todo 1
		assertEquals(56, prueba.max(new int[]{-52, 56, 30, 29, -54, 0, -110}));
		assertEquals(-110, prueba.Min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
		//pruebas de todo 2
        assertEquals(87, prueba.max(new int[]{42, 54, 65, 87, 0}));
        assertEquals(0, prueba.Min(new int[]{42, 54, 65, 87, 0}));
	}

}
