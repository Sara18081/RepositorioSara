package com.ut4Poo;

import java.util.Objects;

public class Articulo {
	
	private String codArticulo = "";
	private String descArticulo = "";
	private float precioUnidad = 0.0f;
	private float peso = 0.0f;
	
	public String getDescArticulo() {
		return descArticulo;
	}
	public void setDescArticulo(String descArticulo) {
		this.descArticulo = descArticulo;
	}
	public float getPrecioUnidad() {
		return precioUnidad;
	}
	public void setPrecioUnidad(float precioUnidad) {
		this.precioUnidad = precioUnidad;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getCodArticulo() {
		return codArticulo;
	}
	
	public Articulo(String codArticulo, String descArticulo, float precioUnidad, float peso) {
		super();
		this.codArticulo = codArticulo;
		this.descArticulo = descArticulo;
		this.precioUnidad = precioUnidad;
		this.peso = peso;
	}
	
	public Articulo(String codArticulo) {
		super();
		this.codArticulo = codArticulo;
	}
	
	@Override
	public String toString() {
		return "Articulo [codArticulo=" + codArticulo + ", descArticulo=" + descArticulo + ", precioUnidad="
				+ precioUnidad + ", peso=" + peso + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(codArticulo, descArticulo, peso, precioUnidad);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulo other = (Articulo) obj;
		return Objects.equals(codArticulo, other.codArticulo);
	}
	
	
	
}
