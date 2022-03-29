package main;

import java.util.ArrayList;
import java.util.List;

import entidades.Directivo;
import entidades.Empleado;
import entidades.Jefe;
import entidades.Trabajador;

public class MainTrabajadores {

	public static void main(String[] args) {
		List<Empleado> empleados = new ArrayList<>();
		
		//Añado trabajador
		Empleado a = new Trabajador("Trabajador 1", 1000, 3);
		empleados.add(a);
		a = new Trabajador("Trabajador 2", 1000, 7);
		empleados.add(a);
		a = new Trabajador("Trabajador 3", 1000, 10);
		empleados.add(a);
		
		//Añado Jefe
		a = new Jefe("Jefe 1", 1200, 100.0);
		empleados.add(a);
		a = new Jefe("Jefe 2", 1200, 50.0);
		empleados.add(a);
		
		//Añado Directivo	
		
		List<Empleado> empleadosACargo = new ArrayList<Empleado>();
		empleadosACargo.add(empleados.get(0));
		empleadosACargo.add(empleados.get(1));
		empleadosACargo.add(empleados.get(2));
		empleadosACargo.add(empleados.get(4));
		
		a = new Directivo("Directivo 1", 1500, empleadosACargo);
		empleados.add(a);
		
		for(int i = 0; i < empleados.size(); i++) {
			System.out.println(empleados.get(i));
			System.out.println("Salario final: " + empleados.get(i).calcularSalarioF());
		}
	}

}
