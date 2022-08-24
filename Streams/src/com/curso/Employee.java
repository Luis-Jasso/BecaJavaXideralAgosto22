package com.curso;

public class Employee {
	
	private int id;
	private String nombre;
	private double salary;
	
	public Employee(int id, String nombre, double salary) {
		this.id = id;
		this.nombre = nombre;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", nombre=" + nombre + ", salary=" + salary + "]";
	}
	
	//FUNCIONA PARA UN CONSUMER, AUNQUE REGRESE EL EMPLOYEE
//	public Employee incrementoSalario(double d) {
//		salary += d;
//		return this;
//	}
	
	public void incrementoSalario(double d) {
		salary += d;
	}
	
}
