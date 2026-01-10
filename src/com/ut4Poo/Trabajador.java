package com.ut4Poo;
import java.util.Scanner;

public abstract class Trabajador extends Persona {

	Scanner sc = new Scanner (System.in);
	protected int nrp;
	Direccion [] direccion;
	
	
	public void realizarPedido() {
		System.out.println("Clase trabajador" + super.getDescuento());
		super.setDescuento(1.5f);
}
	
	public Trabajador(String dni, String name, String apell1, String apell2, String fecNac, int nrp, Parentesco parentesco) {
		super(dni, name, apell1, apell2, fecNac, parentesco);
		// TODO Auto-generated constructor stub
	}

	public Trabajador(String dni, int nrp) {
		super(dni);
		this.nrp = nrp;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Trabajador [nrp=" + nrp + "] \n "
				+ "Persona" + super.toString();
	}

	public int getNrp() {
		return nrp;
	}

	public void setNrp(int nrp) {
		this.nrp = nrp;
	}

	public void anyadirDireccion (int cantidad) {
		String calle = "";
		int numero = 0;
		String codPostal = "";
		String localidad = "";
		String provincia = "";
		
		//System.out.println("Tamaño: " + cantidad);
		
		direccion = new Direccion [cantidad];
		
		System.out.println("Tamaño: " + direccion.length);
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduce la vía:");
			
			calle = sc.nextLine();
			System.out.println("Calle: " + calle);
			
			/*System.out.println("Introduce el número de vía:");
			numero = sc.nextInt();
			System.out.println("Numero introducido " + numero);
			*/
			
			System.out.println("Cod postal:");
			sc.hasNext();
			codPostal = sc.nextLine();
			System.out.println("CodPostal introducido " + codPostal);
			
			System.out.println("Localidad: ");
			localidad = sc.nextLine();
			System.out.println("Localidad introducida " + localidad);
			
			System.out.println("Provincia: ");
			provincia = sc.nextLine();
			System.out.println("Provincia introducida " + provincia);

			Direccion dir = new Direccion(calle, numero, codPostal, localidad, provincia);
			
			if ( dir.equals(null)) {
				System.out.println("objeot no creado");
			} else {
				System.out.println("objeto creado correctamente");
				direccion [i] = dir;
			}
			System.out.println("Datos dirección " + (i +1) + ": " + direccion [i].toString());
		}
	}

	

}
