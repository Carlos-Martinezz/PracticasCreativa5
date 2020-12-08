package com.secuencia.main;

/**
 * @author Carlos Martínez
 *
 */
public class Secuencia {
	
	public static void main(String[] args) {
		
		/*Instanciamos el objeto y le indicamos una longitud
		 * En nuestro caso será hasta el 47 para mostrar el número que se imprimirá en esa posición
		 * luego llamaos el metodo mostrarSecuencia
		 * 
		 * Posición 47: 1836311903
		 * */
		Fibonacci f1 = new Fibonacci("fibonacci 1", 47); 
		f1.mostrarSecuencia(); 
		
	}
	
}
