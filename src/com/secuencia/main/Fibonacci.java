package com.secuencia.main;

/**
 * @author Carlos Martínez
 *
 */
public class Fibonacci {
	
	public int tamano;
	public String nombre;
	
	//Constructores
	public Fibonacci() { 
		
	}

	public Fibonacci(String nombre, int tamano){
	    this.nombre = nombre;
	    this.tamano = tamano;
	}
	
	/* Método para imprimir la posición 47 de la serie
	 * Para imprimir todas las posiciones solo sacamos el SOut del if()
	 * */ 
	public void mostrarSecuencia(){
	    System.out.println(this.nombre + " de tamaño " + this.tamano + ":");
	    System.out.println();
	    
	    for (int i = 0; i < tamano; i ++) {
	        if( (i + 1) == 47) {
	        	System.out.println("Posición " + (i + 1) + ": " + calcularSecuencia(i));
	        }
	    }
	    
	    System.out.println();
	}
	
	//Calculamos la sumatoria de cada iteración
	int calcularSecuencia(int n) {
	    if (n > 1) {
	       return calcularSecuencia(n - 1) + calcularSecuencia(n - 2);  
	    } else if (n == 1) {  
	        return 1;
	    } else if (n == 0) { 
	        return 0;
	    } else { 
	        System.out.println("El ");
	        return -1; 
	    }
	}
	
	//Setters y Getters
	public String getNombre() {
	    return nombre;
	}

	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}

	public int getTamano() {
	    return tamano;
	}

	public void setTamano(int tamano) {
	    this.tamano = tamano;
	}
}
