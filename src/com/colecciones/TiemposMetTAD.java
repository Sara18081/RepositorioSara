package com.colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TiemposMetTAD {
	
	Set <Integer> hashSet = new HashSet<Integer>();
	Set <Integer> treeSet = new TreeSet <Integer>();
	Set <Integer> linkedHashSet = new LinkedHashSet <Integer>();
	long tiempoInicial= System.currentTimeMillis();
	
	 public void metodoTiempoHashSet () {	 
		 for (int i = 0;  i < 1_000_000; i++) {
			hashSet.add(i);
		 }
		 long tiempoFinal = System.currentTimeMillis();
		 System.out.println("Tiempo empleado por HashSet: " + (tiempoFinal - tiempoInicial));
	}
	 
	 public void metodoTiempoTreeSet () { 
		 for (int i = 0;  i < 1_000_000; i++) {
			treeSet.add(i);
		 }
		 long tiempoFinal = System.currentTimeMillis();
		 System.out.println("Tiempo empleado por TreehSet: " + (tiempoFinal - tiempoInicial));		
	}
	 
	 public void metodoTiempoLinked () {
		 for (int i = 0;  i < 1_000_000; i++) {
			linkedHashSet.add(i);
		 }
		 long tiempoFinal = System.currentTimeMillis();
		 System.out.println("Tiempo empleado por TreehSet: " + (tiempoFinal - tiempoInicial));		
	}
}
