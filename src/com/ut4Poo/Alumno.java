package com.ut4Poo;

public class Alumno extends Persona implements IMetodosAlumno, IPersonal { //esto depende de otra clase 
	
	protected int nia;
	Direccion direccion1 = new Direccion();
	float beca = 0.0f;
	Dni dniNia = new Dni();
	
	@Override
	public void realizarPedido() {
		System.out.println("Clase alumno" + super.getDescuento());
		super.setDescuento(1.5f);
		
	}
	
	@Override
	public boolean matricularse(String nombre, int nia, Dni dni) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void cobrarSalario(String nia, float cantidad) {
		// TODO Auto-generated method stub
		this.beca = cantidad;
		this.dniNia.dni = nia;
	}


	public Alumno(String dni, String name, String apell1, String apell2, String fecNac, int nia, Parentesco parentesco) {
		super(dni, name, apell1, apell2, fecNac, parentesco);
		// TODO Auto-generated constructor stub
	}

	public Alumno(String dni, int nia) {
		super(dni);
		this.nia = nia;
		// TODO Auto-generated constructor stub
	}

	public int getNia() {
		return nia;
	}

	public void setNia(int nia) {
		this.nia = nia;
	}

	@Override //ahora no sale nada porque se sobreescriben los datos
	public String toString() {
		return "Alumno [nia=" + nia + "] \n"
				+ "Persona" + super.toString();
	}


	/*public Alumno() {
		//super();
		
	}*/
	
	
}
