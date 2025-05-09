package actividad1;

public class Test {
	public static void main(String[] args) {
        try {
            
            Stack<Integer> pilaEnteros = new StackArray<>(5);
            pilaEnteros.push(10);
            pilaEnteros.push(20);
            pilaEnteros.push(30);
            System.out.println("Pila de enteros: " + pilaEnteros);
            System.out.println("Tope: " + pilaEnteros.top());
            pilaEnteros.pop();
            System.out.println("Pila después de pop(): " + pilaEnteros);

            Stack<String> pilaCadenas = new StackArray<>(3);
            pilaCadenas.push("Hola");
            pilaCadenas.push("Mundo");
            System.out.println("Pila de cadenas: " + pilaCadenas);
            System.out.println("Está vacía: " + pilaCadenas.isEmpty());
            pilaCadenas.pop();
            pilaCadenas.pop();
            System.out.println("Después de vaciar: " + pilaCadenas.isEmpty());
            pilaCadenas.pop(); 

        } catch (ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
