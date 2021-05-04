package empleados;

public class EmpleadoPlantaPermanente extends Empleado {

	private int antiguedad;

	public EmpleadoPlantaPermanente(int hijos, boolean conyuge, int antiguedad) {
		super(hijos, conyuge);
		this.antiguedad = antiguedad;
	}

	protected int antiguedad() {
		return Math.min(2000, 100 * antiguedad);
	}

	@Override
	public double liquidarSueldo() {
		return super.liquidarSueldo() + antiguedad();
	}
}
