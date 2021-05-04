package empleados;

import static org.junit.Assert.*;

import org.junit.Test;

public class GerenteTests {

//	 * - planta permanente tienen un sueldo básico consistente en 1000 unidades
//	 * retributivas o UR (el valor de la unidad retributiva se actualiza
//	 * mensualmente)
	
//	- gerentes su sueldo se calcula como el de un empleado a tiempo completo y se
//	le suma un adicional fijo por personal a cargo de 2000 UR

	@Test
	public void familiaTipo() {
		Empleado gerente = new Gerente(2, true, 10);
		assertEquals(2000 + 10 * 100 + 1000 + 200 * 2 + 100, gerente.liquidarSueldo(), 0.0);
	}

	@Test
	public void solteroSinExperiencia() {
		Empleado gerente = new Gerente(0, false, 0);
		assertEquals(2000 + 1000, gerente.liquidarSueldo(), 0.0);
	}

}
