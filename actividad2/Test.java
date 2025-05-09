package actividad2;

import actividad1.ExceptionIsEmpty;

public class Test {
	public static void main(String[] args) {
        try {
            Queue<Integer> colaEnteros = new QueueLink<>();
            colaEnteros.enqueue(1);
            colaEnteros.enqueue(2);
            colaEnteros.enqueue(3);
            System.out.println("Cola de enteros: " + colaEnteros);
            System.out.println("Frente: " + colaEnteros.front());
            System.out.println("Último: " + colaEnteros.back());
            colaEnteros.dequeue();
            System.out.println("Después de dequeue: " + colaEnteros);


            Queue<String> colaCadenas = new QueueLink<>();
            colaCadenas.enqueue("Perro");
            colaCadenas.enqueue("Gato");
            System.out.println("Cola de cadenas: " + colaCadenas);
            colaCadenas.dequeue();
            colaCadenas.dequeue();
            System.out.println("¿Cola vacía?: " + colaCadenas.isEmpty());
            colaCadenas.dequeue();

        } catch (ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
