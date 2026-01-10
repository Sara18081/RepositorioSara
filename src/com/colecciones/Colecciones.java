package com.colecciones;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Colecciones {
	
	public void methodHashSet() {
		HashSet<String> setNombres = new HashSet<>();
		setNombres.add("Juan");
		setNombres.add("Micaela");
		setNombres.add(null);
		setNombres.add("Micaela");
		setNombres.add("David");
		
		//Recorre los elementos
		Iterator<String> itr =setNombres.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Imprimir todo el conjunto
		System.out.println(setNombres);
	}
	
	public void methodLinkHashSet() {
		LinkedHashSet<String> setNombres = new LinkedHashSet<>();
		setNombres.add("Juan");
		setNombres.add("Micaela");
		setNombres.add(null);
		setNombres.add("Micaela");
		setNombres.add("David");
		
		//Recorre los elementos
		Iterator<String> itr =setNombres.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Imprimir todo el conjunto
		System.out.println(setNombres);
	}
	
	public void methodTreeSet() {
		TreeSet<Integer> setNombres = new TreeSet<>();
		setNombres.add(3);
		setNombres.add(1);
		//setNombres.add(null);
		setNombres.add(1);
		setNombres.add(2);
		
		//Recorre los elementos
		Iterator<Integer> itr =setNombres.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//Imprimir todo el conjunto
		System.out.println(setNombres);
	}
	
	public void methodTreeSetPersona() {
		TreeSet<Persona> setPersonas = new TreeSet<>(Comparator.comparing(Persona::getNombre));
		setPersonas.add(new Persona("Maria"));
		setPersonas.add(new Persona("Ricardo"));
		setPersonas.add(new Persona("Ricardo"));
		//setNombres.add(null);
		setPersonas.add(new Persona("Estefania"));
		setPersonas.add(new Persona("Javier"));
		//Recorriendo los elementos en orden creciente
		System.out.println("Recorriendo en orden creciente");
		Iterator<Persona> itr =setPersonas.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getNombre());
		}
		//Recorriendo los elementos en orden decreciente
		System.out.println("Recorriendo en orden decreciente");
		Iterator<Persona> ditr =setPersonas.descendingIterator();
		while(ditr.hasNext()) {
			System.out.println(ditr.next().getNombre());
		}
	}
	
	public void methodArrayList() {
		ArrayList<Integer> arrayEnteros = new ArrayList<>();
		arrayEnteros.add(22);
		arrayEnteros.add(77);
		arrayEnteros.add(11);
		System.out.println("Primer elemento: " + arrayEnteros.get(0));
		System.out.println("Segundo elemento: " + arrayEnteros.get(1));
		Integer enteroReemplazado = arrayEnteros.set(1, 33);
		System.out.println("Elemento reemplezado: " + enteroReemplazado);
		System.out.println("Ahora segundo elemento: " + arrayEnteros.get(1));
		System.out.println("Tercer elemento: " + arrayEnteros.get(2));
		
		//recorrer con for
		for (int i = 0; i <arrayEnteros.size();i++) { //for incremental
			System.out.println(arrayEnteros.get(i));
				}
		for (int j = arrayEnteros.size(); j > 0; j--) { //for decremental
			System.out.println(arrayEnteros.get(j-1));
				}
		
		//recorrer con for each
		for (int elemento:arrayEnteros) {
			System.out.println(elemento);
		}
	}
	
	/*public void methodArrayListTrd () {
		ArrayList<ArrayList<ArrayList>> array3D = new ArrayList<>();
		array3D.add(new ArrayList<>());
		array3D.add(new ArrayList<>());
		array3D.get(0).add(new ArrayList<>());
		array3D.get(0).add(new ArrayList<>());
		array3D.get(1).add(new ArrayList<>());
		array3D.get(1).add(new ArrayList<>());
		array3D.get(1).add(new ArrayList<>());
		array3D.get(0).get(0).add("cadena1");
		array3D.get(0).get(1).add(true);
		array3D.get(1).get(0).add("cadena2");
		array3D.get(1).get(1).add(123);
		array3D.get(1).get(2).add('Ç');
	}*/
}