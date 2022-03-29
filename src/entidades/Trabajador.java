package entidades;

public class Trabajador extends Empleado{

	private Integer valoracion;
	
	public Trabajador(String nombre, double sueldoBase, Integer valoracion) {
		super(nombre, sueldoBase);
		this.valoracion = valoracion;
	}
	
	@Override
	public Double calcularSalarioF() {
		Double res = getSueldoBase();
		if(valoracion >= 0 && valoracion <= 4) {
			return res;
		}else if(valoracion >= 5 && valoracion <= 6) {
			return res + 50;
		}else if(valoracion >= 7 && valoracion <= 8) {
			return res + 100;
		}else if(valoracion >= 9 && valoracion <= 10) {
			return res + 200;
		}
		return res;
	}

}
