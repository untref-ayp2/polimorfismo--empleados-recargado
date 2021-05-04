package empleados;

public class Gerente extends EmpleadoPlantaPermanente {

//	
//	 gerentes su sueldo se calcula como el de un empleado a tiempo completo y se
//	 * le suma un adicional fijo por personal a cargo de 2000 U
	
	public Gerente(int hijos, boolean conyuge, int antiguedad) {
		super(hijos, conyuge, antiguedad);
	}

	@Override
	public double liquidarSueldo() {
		return super.liquidarSueldo() + 2000;
	}
	
}
