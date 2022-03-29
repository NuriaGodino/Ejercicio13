package entidades;

public class Jefe extends Empleado{

	private Double incentivo;
	
	public Jefe(String nombre, double sueldoBase, Double incentivo) {
		super(nombre, sueldoBase);
		this.incentivo = incentivo;
	}
	
	/**
	 * @author Nuria Godino
	 * Le suma al salario base los incentivos
	 * @return Sueldo base mas complemento salarial segun incentivos
	 */

	@Override
	public Double calcularSalarioF() {
		return getSueldoBase() + incentivo;
	}
	
}
