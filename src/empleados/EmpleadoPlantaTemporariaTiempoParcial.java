package empleados;

public class EmpleadoPlantaTemporariaTiempoParcial extends EmpleadoPlantaTemporaria {
	
	
	public EmpleadoPlantaTemporariaTiempoParcial(int hijos, boolean conyuge, int horas) {
		super(hijos, conyuge);
		this.horas = horas;
	}

	private int horas;

//	- planta permanente a tiempo parcial el sueldo se calcula como 1/3 del sueldo
//	 * básico, más la cantidad de horas trabajadas en el mes a un valor de 10 UR la
//	 * hora (con un tope de 1000 UR, es decir si 1/3 del básico mas la cant. de
//	 * horas x 10 UR supera 1000 UR se toma solo 1000 UR), más salario familiar y
//	 * antigüedad como en el caso de los empleados a tiempo completo
	
	@Override
	protected double sueldoBasico() {
		return Math.min(super.sueldoBasico(), super.sueldoBasico() * 1/3 + horas * 10);
	}
}
