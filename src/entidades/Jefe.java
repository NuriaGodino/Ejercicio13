package entidades;

public class Jefe extends Empleado{

	private Double incentivo;
	
	public Jefe(String nombre, double sueldoBase, Double incentivo) {
		super(nombre, sueldoBase);
		this.incentivo = incentivo;
	}
	

	@Override
	public Double calcularSalarioF() {
		return getSueldoBase() + incentivo;
	}
	
}
