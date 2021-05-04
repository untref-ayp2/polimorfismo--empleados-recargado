package empleados;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoPlantaTemporariaTiempoParcialTests {

//	 * - planta temporaria, el sueldo se calcula igual que en el caso de empleados
//	 * en planta permanente pero no cobran el adicional por antigüedad

	@Test
	public void familiaTipo() {
		Empleado empleado = new EmpleadoPlantaTemporariaTiempoParcial(2, true, 2);
		assertEquals(333.33 + 10 * 2 + 200 * 2 + 100, empleado.liquidarSueldo(), 0.01);
	}

	@Test
	public void solteroSinExperiencia() {
		Empleado empleado = new EmpleadoPlantaTemporariaTiempoParcial(0, false, 2);
		assertEquals(333.33 + 10 * 2, empleado.liquidarSueldo(), 0.01);
	}

	@Test
	public void familiaTipoMuchasHorasExtra() {
		Empleado empleado = new EmpleadoPlantaTemporariaTiempoParcial(2, true, 999);
		assertEquals(1000 + 200 * 2 + 100, empleado.liquidarSueldo(), 0.0);
	}

	
}
