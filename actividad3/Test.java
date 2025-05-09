package actividad3;

import actividad1.ExceptionIsEmpty;

public class Test {
	public static void main(String[] args) {
        try {
            PriorityQueue<String, Integer> pq = new PriorityQueueLinkSort<>();

            pq.enqueue("Paciente A", 2);
            pq.enqueue("Paciente B", 5);
            pq.enqueue("Paciente C", 1);
            pq.enqueue("Paciente D", 4);
            pq.enqueue("Paciente E", 3);

            System.out.println("Cola de prioridad: " + pq);
            System.out.println("Frente: " + pq.front()); 
            System.out.println("Ultimo: " + pq.back()); 

            System.out.println("Atendiendo: " + pq.dequeue());
            System.out.println("Cola actual: " + pq);

        } catch (ExceptionIsEmpty e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
