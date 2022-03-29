package entidades;

public class Trabajador extends Empleado{

	private Integer valoracion;
	
	public Trabajador(String nombre, double sueldoBase, Integer valoracion) {
		super(nombre, sueldoBase);
		this.valoracion = valoracion;
	}
	
	/**
	 * @author Nuria Godino
	 * Calcula el salario final según la valoración que haya obtenido el trabajador, si es entre 0 y 4 no se suma nada,
	 * si es entre 5 y 6 se suma 50 y es entre 7 y 8 se suma 100 y si es entre 9 y 10 se suma 200
	 * @return salario final sumandole los complementos salariales según la valoración
	 */
	
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
