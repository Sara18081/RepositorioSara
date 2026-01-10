package com.ut4Poo;

public class Direccion {

	//Propiedades
	private String calle;
	private int numero;
	private String codPostal;
	private String localidad;
	private String provincia;
	
	// Getters y Setters
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	// Constructor
	
	public Direccion() {
	
	}
	public Direccion(String calle, int numero, String codPostal, String localidad, String provincia) {
		this.calle = calle;
		this.numero = numero;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincia = provincia;
	}
	
	public void actualizarDireccion() {
		System.out.println("Sin implementar");
	}
	public void crearDireccion(String calle, int numero, String codPostal, String localidad, String provincia) {
		this.calle = calle;
		this.numero = numero;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincia = provincia;
		//System.out.println("Sin implementar");
	}
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", numero=" + numero + ", codPostal=" + codPostal + ", localidad="
				+ localidad + ", provincia=" + provincia + "]";
	}
	
}
