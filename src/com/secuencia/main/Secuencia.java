package com.secuencia.main;

/**
 * @author Carlos Mart�nez
 *
 */
public class Secuencia {
	
	public static void main(String[] args) {
		
		/*Instanciamos el objeto y le indicamos una longitud
		 * En nuestro caso ser� hasta el 47 para mostrar el n�mero que se imprimir� en esa posici�n
		 * luego llamaos el metodo mostrarSecuencia
		 * 
		 * Posici�n 47: 1836311903
		 * */
		Fibonacci f1 = new Fibonacci("fibonacci 1", 47); 
		f1.mostrarSecuencia(); 
		
	}
	
}
