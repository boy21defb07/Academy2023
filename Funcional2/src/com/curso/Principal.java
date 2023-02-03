package com.curso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
		List<Employee> b = new ArrayList(); 
		List<String> nombres = new ArrayList();
		
		//Filtrar: Salario menor a 400
for (int i = 0 ;i < listEmpledos.size();i++){
		if (listEmpledos.get(i).getSalary()< 400 ) {
			a.add(listEmpledos.get(i));
			
		}
		
}
			a.forEach(System.out::println);
		//Aumentar salario en 200
			
		for (int i = 0; i< listEmpledos.size(); i++){
			double salario = listEmpledos.get(i).getSalary(); 
			listEmpledos.get(i).setSalary(salario + 200);
		}
		System.out.println("------------------------");
		listEmpledos.forEach(System.out::println);
		//Filtrar: Longitud del nombre sea mayor a 6
		
		
		for (int i = 0 ;i < listEmpledos.size();i++){
			if (listEmpledos.get(i).getNombre().length() > 6 ) {
				b.add(listEmpledos.get(i));	
			}
		}
		
		System.out.println("------------------------");
		b.forEach(System.out::println);
		
		//Ordenar por nombre
		
		
		
		//Lista de nombres
		for (int i = 0 ;i < listEmpledos.size();i++){
			nombres.add(i, listEmpledos.get(i).getNombre());
		}
		System.out.println("------------------------");
		nombres.forEach(System.out::println);
	}

	}

