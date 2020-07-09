package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AppTest {

	private App cut;
	
	@Before
	public void setUp() throws Exception {
		cut = new App();
	}

	@Test
	public void testGetTexto() {
		// Preparar 
		
		//Ejecutar
		
		String res=cut.getTexto();
		
		//Verificar
		assertEquals("El valor recibido no coincide con el esperado","Hola",res);
	}

}
