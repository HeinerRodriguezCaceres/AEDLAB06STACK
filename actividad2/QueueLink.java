package actividad2;

import actividad1.ExceptionIsEmpty;

public class QueueLink<E> implements Queue<E> {
	private Node<E> first;
	private Node<E> last;
	
	public QueueLink() {
		this.first = null;
		this.last = null;
	}
	
	public void enqueue(E x) {
		Node<E> aux = new Node<>(x);
		if(isEmpty()) {
			this.first = aux;
		} else {
			this.last.setNext(aux);
		}
		this.last = aux;
	}
	public E dequeue() throws ExceptionIsEmpty {
		if(isEmpty()) {
			throw new ExceptionIsEmpty("La cola esta vacia");
		}
		E data = first.getData();
		first = first.getNext();
		if (first == null) {
			last = null;
		}
		return data;
	}
	public E front() throws ExceptionIsEmpty{
		if (isEmpty()) {
			throw new ExceptionIsEmpty("La cola esta vacia");
		}
		return first.getData();
	}
	
	public E back() throws ExceptionIsEmpty {
		if (isEmpty()) {
			throw new ExceptionIsEmpty("la cola esta vacia");
		}
		return last.getData();
	}
	public boolean isEmpty() {
		return first == null;
	}
	
	@Override
	public String toString() {
		if(isEmpty()) return "[vacia]";
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node<E> current = first;
		while (current != null) {
			sb.append(current.getData());
			if(current.getNext() != null)sb.append(", ");
			current = current.getNext();
		}
		sb.append("]");
		return sb.toString();
	}
}
