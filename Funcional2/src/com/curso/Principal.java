package com.curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
	
	private static Employee[] arrayOfEmps = { 
			new Employee(0, "Patrobas", 100.0), 
			new Employee(1, "Tercio", 200.0),
			new Employee(2, "Andronico", 300.0), 
			new Employee(3, "Epeneto", 400.0),
			new Employee(4, "Filologo", 500.0) };

	public static void main(String[] args) {

		List<Employee> listEmpledos = Arrays.asList(arrayOfEmps);
		List<Employee> a = new ArrayList();   
		
		//Filtrar: Salario menor a 400
for (int i = 0 ;i < listEmpledos.size();i++){
		if (listEmpledos.get(i).getSalary()< 400 ) {
			a.add(listEmpledos.get(i));
			
		}
		
}
			a.forEach(System.out::println);
		//Aumentar salario en 200
		for (int i = 0 ;i < a.size();i++){
			
		}
		//Filtrar: Longitud del nombre sea mayor a 6
		
		
		//Ordenar por nombre
		
		
		
		//Lista de nombres
		
		List<String> nombres;
		
	}

	}

