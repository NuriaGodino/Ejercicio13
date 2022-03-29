package entidades;

import java.util.List;

public  class Directivo extends Empleado{

	private List<Empleado> empleadosCargo;
	
	public Directivo(String nombre, double sueldoBase, List<Empleado> empleadosCargo) {
		super(nombre, sueldoBase);
		this.empleadosCargo = empleadosCargo;
	}

	public List<Empleado> getEmpleadosCargo() {
		return empleadosCargo;
	}



	public void setEmpleadosCargo(List<Empleado> empleadosCargo) {
		this.empleadosCargo = empleadosCargo;
	}

	/**
	 * @author Nuria Godino
	 * Metodo que calcula el salario final de un directivo, este se obtiene multiplicando el numero 
	 * de empleados que tenga a su cargo por cien.
	 * @return sueldo base más complementos salarial por empleado a cargo
	 */
	
	@Override
	public Double calcularSalarioF() {
		Double res = 0.0;
		if(this.empleadosCargo.size() != 0) {
			res = this.empleadosCargo.size() * 100.0;
		}
		return res + getSueldoBase();
	}

}
