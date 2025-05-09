package actividad1;

public class StackArray<E> implements Stack<E> {
	private E[] array;
    private int tope;

    @SuppressWarnings("unchecked")
	public StackArray(int n) {
        this.array = (E[]) new Object[n];
        this.tope = -1;
    }

    public void push(E x) {
        if (isFull()) {
            System.out.println("La pila está llena. No se puede agregar: " + x);
            return;
        }
        array[++tope] = x;
    }

    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        return array[tope--];
    }

    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty();
        }
        return array[tope];
    }

    public boolean isEmpty() {
        return this.tope == -1;
    }

    public boolean isFull() {
        return this.tope == array.length - 1;
    }

    @Override
    public String toString() {
        if (isEmpty()) return "[Vacía]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = tope; i >= 0; i--) {
            sb.append(array[i]);
            if (i != 0) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

}
