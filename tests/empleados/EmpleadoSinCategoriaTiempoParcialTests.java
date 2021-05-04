package empleados;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoSinCategoriaTiempoParcialTests {

//	 * - planta permanente tienen un sueldo básico consistente en 1000 unidades
//	 * retributivas o UR (el valor de la unidad retributiva se actualiza
//	 * mensualmente)
	
//	 * - planta permanente a tiempo parcial el sueldo se calcula como 1/3 del sueldo
//	 * básico, más la cantidad de horas trabajadas en el mes a un valor de 10 UR la
//	 * hora (con un tope de 1000 UR, es decir si 1/3 del básico mas la cant. de
//	 * horas x 10 UR supera 1000 UR se toma solo 1000 UR), más salario familiar y
//	 * antigüedad como en el caso de los empleados a tiempo completo
	
	@Test
	public void familiaTipo() {
		Empleado empleado = new EmpleadoSinCategoriaTiempoParcial(2, true, 10, 2);
		assertEquals(10 * 100 + 333.33 + 10 * 2 + 200 * 2 + 100, empleado.liquidarSueldo(), 0.01);
	}

	@Test
	public void solteroSinExperiencia() {
		Empleado empleado = new EmpleadoSinCategoriaTiempoParcial(0, false, 0, 2);
		assertEquals(333.33 + 10 * 2, empleado.liquidarSueldo(), 0.01);
	}

	@Test
	public void familiaTipoMuchasHorasExtra() {
		Empleado empleado = new EmpleadoSinCategoriaTiempoParcial(2, true, 10, 999);
		assertEquals(1000 + 1000 + 200 * 2 + 100, empleado.liquidarSueldo(), 0.0);
	}

	
}
