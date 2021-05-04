package empleados;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpleadoPlantaTemporariaTiempoCompletoTests {

//	 * - planta temporaria, el sueldo se calcula igual que en el caso de empleados
//	 * en planta permanente pero no cobran el adicional por antigüedad
	
	@Test
	public void familiaTipo() {
		Empleado empleado = new EmpleadoPlantaTemporariaTiempoCompleto(2, true);
		assertEquals(1000 + 200 * 2 + 100, empleado.liquidarSueldo(), 0.0);
	}

	@Test
	public void solteroSinExperiencia() {
		Empleado empleado = new EmpleadoPlantaTemporariaTiempoCompleto(0, false);
		assertEquals(1000, empleado.liquidarSueldo(), 0.0);
	}

}
