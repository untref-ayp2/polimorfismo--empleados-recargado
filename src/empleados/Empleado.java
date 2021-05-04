package empleados;

public abstract class Empleado {

//	 * - planta permanente a tiempo completo , al sueldo básico se le suma salario
//	 * familiar (200 UR por cada hijo y 100 UR por conyugue) y antigüedad (100 UR
//	 * por año cumplido hasta un tope de 2000 UR)
	
	private boolean conyuge;
	private int hijos;
	
	public Empleado(int hijos, boolean conyuge) {
		this.hijos = hijos;
		this.conyuge = conyuge;
	}

	public double liquidarSueldo() {
		return sueldoBasico() + salarioFamiliar();
	}
	
	protected double salarioFamiliar() {
		return 200 * hijos + 100 * ( conyuge ? 1 : 0);
	}
	
	protected double sueldoBasico() {
		return 1000;
	}
	
}
