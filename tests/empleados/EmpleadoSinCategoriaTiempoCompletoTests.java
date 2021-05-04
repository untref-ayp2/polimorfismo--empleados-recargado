package empleados;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoSinCategoriaTiempoCompletoTests {

	
//	 * - planta permanente tienen un sueldo básico consistente en 1000 unidades
//	 * retributivas o UR (el valor de la unidad retributiva se actualiza
//	 * mensualmente)
	
//	 * - planta permanente a tiempo completo , al sueldo básico se le suma salario
//	 * familiar (200 UR por cada hijo y 100 UR por conyugue) y antigüedad (100 UR
//	 * por año cumplido hasta un tope de 2000 UR)
	
	@Test
	public void familiaTipo() {
		Empleado empleado = new EmpleadoSinCategoriaTiempoCompleto(2, true, 10);
		assertEquals(10 * 100 + 1000 + 200 * 2 + 100, empleado.liquidarSueldo(), 0.0);
	}

	@Test
	public void solteroSinExperiencia() {
		Empleado empleado = new EmpleadoSinCategoriaTiempoCompleto(0, false, 0);
		assertEquals(1000, empleado.liquidarSueldo(), 0.0);
	}

}
