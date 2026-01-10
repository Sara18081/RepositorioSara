package com.ut4Poo;
import com.colecciones.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//Persona per1 = new Persona("12345678Z", "Pepito", "Primer apel", "Segundo Apell", "11/25/2000", Parentesco.padre);
		
		//System.out.println(per1.toString());
		//per1.setName("656565");
		/*
		System.out.println("Per1 " + per1.toString());
		System.out.println("El nombre de per1: " + per1.getName());
		
		
		//System.out.println("Numero  hash: " + per1.hashCode());
		
		System.out.println("--------------------");
		*/
		/*Persona per2 = new Persona ("6565");
		System.out.println("Per2 " + per2.toString()); //sale vacio porque en el constructor no le puse datos puublic Persona()
		System.out.println("Numero  hash: " + per2.hashCode());		
		*/
		//System.out.println("Son iguales per1 y per2: " + per1.equals(per1) );
		
		//Alumno alu1 = new Alumno ("12345678Z", "Pepita", "Primer apel", "Segundo Apell", "01/01/2000", 234, Parentesco.hija);
		//System.out.println("Alu1 :" + alu1.toString());
		
		//Trabajador tra1 = new Trabajador ("12345678Z", "Pepita2", "Primer apel", "Segundo Apell", "01/01/2000", 234, Parentesco.madre);
		//System.out.println("Tra1 :" + tra1.toString());
		
		//tra1.setNrp(555);
		//System.out.println("Tra1 :" + tra1.toString());
		
		//tra1.setName("Juanito");
		//System.out.println("Tra1 :" + tra1.toString());
		//System.out.println("Tra1 nombre: " + tra1.getName());
		
		//tra1.anyadirDireccion(2);
		//tra1.realizarPedido();
		
		//Articulo art1 = new Articulo ("00111");
		
		//Pedido pedido = new Pedido("001", tra1);
		//pedido.anyadirProducto(art1);
		//pedido.setArticulo(art1);
		//System.out.println("Pedido::: \n" + pedido.toString());
		
		
		/*
		tra1.direccion1.crearDireccion("Tapia 1", 15, "03005", "Ibi", "Alicante");;
		System.out.println("Datos de la dirección: " + tra1.direccion1.toString());*/
		
		
		Colecciones colecciones = new Colecciones ();
		//colecciones.methodHashSet();
		//colecciones.methodLinkHashSet();
		//colecciones.methodTreeSet();
		//colecciones.methodTreeSetPersona();
		colecciones.methodArrayList();
		
		/*TiemposMetTAD tiempos = new TiemposMetTAD ();
		tiempos.metodoTiempoHashSet();
		tiempos.metodoTiempoTreeSet();
		tiempos.metodoTiempoLinked();*/
	}
}