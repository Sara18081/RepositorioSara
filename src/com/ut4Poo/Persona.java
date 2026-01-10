package com.ut4Poo;
import java.util.Objects;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public abstract class Persona {

	private Dni dni = new Dni();
	protected String name;
	private String apell1;
	private String apell2;
	private String fecNac;
	private LocalDate localDate;
	private Parentesco parentesco;
	private Pedido pedido; 
	private float descuento = 0.0f;
	
	private int diaNac = 0;
	private int mesNac = 0;
	private int anyoNac = 0;
	
	public float getDescuento() {
		return descuento;
	}


	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

	
	public abstract void realizarPedido ();
	/*{
		System.out.println("Entro en realizar pedido: ");
		//this.pedido = new Pedido ();
		//this.pedido.crearPedido();
	}*/
	
	
	public String getDni() {
		return dni.getDni();
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getApell1() {
		return apell1;
	}



	public void setApell1(String apell1) {
		this.apell1 = apell1;
	}



	public String getApell2() {
		return apell2;
	}



	public void setApell2(String apell2) {
		this.apell2 = apell2;
	}



	public String getFecNac() {
		return fecNac;
	}



	public void setFecNac(String fecNac) {
		this.fecNac = fecNac;
	}



	public Persona(String dni, String name, String apell1, String apell2, String fecNac, Parentesco parentesco) {
		//super();
		
		if (this.dni.dniAdd(dni) == true) {
			System.out.println("DNI es correcto, creamos a la persona");
			this.name = name;
			this.apell1 = apell1;
			this.apell2 = apell2;
			this.fecNac = fecNac;
			this.parentesco = parentesco;
			this.localDate = LocalDate.now();
			this.fecNac = "" + LocalDate.now().getDayOfMonth() + "/" + LocalDate.now().getMonth().getValue() + "/" + LocalDate.now().getYear();
			System.out.println("Fecha actual: " + this.fecNac);
			//System.out.println("Hora actual: " + LocalTime.now());
			} else {
			System.out.println("DNI incorrecto");
		}

	}
	
	
	public Persona(String dni) {
		if (this.dni.dniAdd(dni) == true) {
			this.name = "";
			this.apell1 = "";
			this.apell2 = "";
			this.fecNac = "";
		}	
	}


	@Override //sobreescribe el constructor que ya tiene de base, metodo para la clase
	public String toString() {
		return "Persona:  \n[dni=" + dni + ", name=" + name + ", apell1=" + apell1 + ", apell2=" + apell2 + ", fecNac="
				+ fecNac + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(apell1, apell2, dni, fecNac, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("Entro comparación de objetos");
			return true;
		}
		if (obj == null) {
			System.out.println("Entro en obj null");
			return false;
		}
		if (getClass() != obj.getClass()) {
			System.out.println("Entro en comparación de clases");
			return false;
		}
		System.out.println("Comparo las propiedades de los dos objetos");
		Persona other = (Persona) obj;
		return Objects.equals(apell1, other.apell1) && Objects.equals(apell2, other.apell2)
				&& Objects.equals(dni, other.dni) && Objects.equals(fecNac, other.fecNac)
				&& Objects.equals(name, other.name);
	}
}
