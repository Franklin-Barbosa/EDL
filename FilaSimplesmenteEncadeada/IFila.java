
public interface IFila {
	    public abstract void enqueue(Object o); 	// adiciona um elemento à fila.
	    public abstract Object dequeue(); 			// remoção de um item da fila.
	    public Object first(); 						// retornar o primeiro elemento da fila, sem removê-lo.
	    public abstract int size(); 				// etornar o número de elementos na fila.
	    public abstract boolean isEmpty(); 			// verifica se a fila está vazia.
}
