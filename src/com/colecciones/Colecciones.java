package com.colecciones;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
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
		/*for (int i = 0; i <arrayEnteros.size();i++) { //for incremental
			System.out.println(arrayEnteros.get(i));
				}
		for (int j = arrayEnteros.size(); j > 0; j--) { //for decremental
			System.out.println(arrayEnteros.get(j-1));
				}
		
		//recorrer con for each
		/*for (int elemento:arrayEnteros) {
			System.out.println(elemento);}*/
		
		
		//Ejemplo Iterator 
		/*Iterator<Integer> iterador = arrayEnteros.iterator () ;
		while (iterador.hasNext()) { // iterator
		System.out.println(iterador.next());
		}*/
		
		/*Iterator<Integer> iterador = arrayEnteros.iterator () ;
		iterador.forEachRemaining(elemento -> { // iterator y forEachRemaining
		System.out.println(elemento);
		});*/
		
		/*//Para recorridos inversos se usa el listiterator
		ListIterator<Integer> listaIterador = arrayEnteros.listIterator (arrayEnteros.size () );
		while (listaIterador. hasPrevious () ) { // listIterator
		Integer elemento = listaIterador. previous () ;
		System.out.println (elemento) ;
		}*/
	}
	
	public void methodArrayListTrd () {
		ArrayList<ArrayList<ArrayList<Object>>> array3D = new ArrayList<>();
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
		
		for (int i = 0; i < array3D.size(); i++) {
		    for (int j = 0; j < array3D.get(i).size(); j++) {
		        for (int k = 0; k < array3D.get(i).get(j).size(); k++) {
		            System.out.println("[" + i + "][" + j + "][" + k + "] = "
		                    + array3D.get(i).get(j).get(k));
		        }
		    }
		}
	}
	
	public void methodStack () {
		Stack<String> st = new Stack();
		st.push ("Prueba");st.push("de");st.push("metodo");st.push("search");
		st.push("en");st.push("una");st.push("cola");st.push("stack");
		System.out.println ("Posicion 'cola': "+st.search("Prueba"));// No empieza desde la posiciòn 
	}
	
	public void methodpriorityQueue() {
		PriorityQueue<Integer> numeros = new PriorityQueue<> () ;
		// Encolando elementos
		numeros.add(22);numeros.add(11);numeros.add(30);
		numeros.add(25);numeros.add(11);numeros.add(6);
		// Desencolando elementos segun han sido ordenados
		while (!numeros.isEmpty()) {
		System.out.println(numeros.remove());
		}
	}
	
	public void methodArrayDeque() {
		ArrayDeque<String> nombres = new ArrayDeque<> ();
		// Añadiendo elementos
		nombres.add ("Ana");	// Ana
		nombres.add("Zoe"); 	// Ana Zoe
		nombres.push ("Luis"); 	// Luis Ana Zoe
		nombres.add("Luz"); 	// Luis Ana Zoe Luz 
		nombres.push ("Piero");	// Piero Luis Ana Zoe Luz
		nombres.push ("Vanesa");// Vanesa Piero Luis Ana Zoe Luz
		while (!nombres.isEmpty()) {
		System.out.println(nombres.pop());
		}
	}
	
	public void methodHashMap() {
		HashMap<Integer, String> hashMap = new HashMap<> ();
		hashMap.put (1, "1");
		hashMap.put (3, "3");
		hashMap.put (4, "4");
		hashMap.put (2, "2");
		hashMap.put (5, "5");
		System.out.println(hashMap.values());
	}
	
	public void methodLinkedHashMap() {
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put (1, "1");
		linkedHashMap.put (3, "3");
		linkedHashMap.put (4, "4");
		linkedHashMap.put (2, "2");
		linkedHashMap.put (5, "5");
		System.out.println(linkedHashMap.values());
	}
	
	public void methodTreeMap() {
		TreeMap<Integer,String> puntuaciones = new TreeMap<> () ;
		puntuaciones.put (8, "Notable alto");
		puntuaciones.put (5, "Aprobado");
		puntuaciones.put (10,"Matricula H.");
		puntuaciones.put (6, "Bien");
		puntuaciones.put (9, "Sobresaliente");
		puntuaciones.put (7, "Notable");
		puntuaciones.entrySet () .forEach ( (m) -> {
			System.out.println(m.getKey() + " " + m.getValue());
		});
		puntuaciones.replace (7, "Notable", "Notable bajo") ;
		System.out.println (puntuaciones.values());
		System.out.println ("Por debajo de "+puntuaciones.firstKey() + " es suspenso") ;
	}
}