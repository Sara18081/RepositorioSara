package com.ut4Poo;

import java.time.LocalDate;
import java.util.Arrays;

public class Pedido {
	private String codPedido = "";
	// lista de articulos (muchos articulos...)
	
	private String fecPedido = "";
	private float precioTotalPedido = 0.0f;
	private int numArtPedido = 0;
	private float pesoPedido = 0.0f;
	private Persona persona;
	private Articulo articulo [] = new Articulo [5];
	
	
	// añadir el producto
	

	public void anyadirProducto (Articulo articulo) {
		if (articulo != null) {
			this.articulo [numArtPedido] = articulo;
			numArtPedido++;
		}
	}
	
	public void borrarArticulo (String codArticulo) {
		// 1. Buscamos el articulo en el array por el código del artículo
		// 2. Si se encuentra recogemos posición
		// 3. Si no encuentra devolver false
		// 2.1 Encontrado, posicion, movemos desde esa posicion hasta el final los artículos
		// avanzado posición
		
	}
	
	/* calcular el precio total
	

	 */
	
	/* calcular el pesoPedido
	

	 */
	
	/* crear Pedido
	

	 */
	
	public boolean crearPedido () {
		boolean retorno = false;
		fecPedido = LocalDate.now().toString();
		return retorno;
	}
	
	public Pedido(String codPedido, Persona persona) {
		super();
		this.codPedido = codPedido;
		this.persona = persona;
	}

	public boolean cerrarPedido () {
		boolean retorno = false;
		
		return retorno;
	}
	
	public String getFechaPedido() {
		return fecPedido;
	}

	public void setFechaPedido(String fechaPedido) {
		this.fecPedido = fechaPedido;
	}

	public float getPrecioTotalPedido() {
		return precioTotalPedido;
	}

	public void setPrecioTotalPedido(float precioTotalPedido) {
		this.precioTotalPedido = precioTotalPedido;
	}

	public int getNumArtPedidos() {
		return numArtPedido;
	}

	public void setNumArtPedidos(int numArtPedido) {
		this.numArtPedido = numArtPedido;
	}

	public float getPesoPedido() {
		return pesoPedido;
	}

	public void setPesoPedido(float pesoPedido) {
		this.pesoPedido = pesoPedido;
	}

	public String getCodPedido() {

		return codPedido;
	}
	

	public Articulo[] getArticulo() {
		return articulo;
	}


	public void setArticulo(Articulo[] articulo) {
		this.articulo = articulo;
		//Prevenir no machacar si existen
		numArtPedido = numArtPedido + articulo.length;
	}
	
	public void setArticulo(Articulo articulo) {
		this.articulo[numArtPedido] = articulo;
		numArtPedido++;
	}
	
	public void setCodPedido(String codPedido) {
		this.codPedido = codPedido;
	}

	@Override
	public String toString() {
		return "Pedido [codPedido=" + codPedido + ", fecPedido=" + fecPedido + ", precioTotalPedido="
				+ precioTotalPedido + ", numArtPedido=" + numArtPedido + ", pesoPedido=" + pesoPedido + ", persona="
				+ persona + ", articulo=" + Arrays.toString(articulo) + "]";
	}
	
}
