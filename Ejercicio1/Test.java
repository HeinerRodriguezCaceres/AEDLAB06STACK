package Ejercicio1;

import actividad1.ExceptionIsEmpty;

public class Test {
	 public static void main(String[] args) {
	        try {
	            Stack<Integer> pilaEnteros = new StackLink<>();
	            pilaEnteros.push(10);
	            pilaEnteros.push(20);
	            pilaEnteros.push(30);
	            System.out.println("Pila de enteros: " + pilaEnteros);
	            System.out.println("Tope: " + pilaEnteros.top());
	            System.out.println("Pop: " + pilaEnteros.pop());
	            System.out.println("Pila actual: " + pilaEnteros);

	            Stack<String> pilaCadenas = new StackLink<>();
	            pilaCadenas.push("Hola");
	            pilaCadenas.push("Mundo");
	            System.out.println("\nPila de cadenas: " + pilaCadenas);
	            System.out.println("Tope: " + pilaCadenas.top());
	            pilaCadenas.pop();
	            System.out.println("Pila actual: " + pilaCadenas);

	        } catch (ExceptionIsEmpty e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

}
