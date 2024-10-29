public class FilaSimplesmenteEncadeada {
    private Nodo frente; // ponteiro para inicio da fila
    private Nodo tras; // ponteiro para fim da fila
    private int tamanho;

    public FilaSimplesmenteEncadeada() {
        this.frente = null;
        this.tras = null;
        this.tamanho = 0;
    }

    // adicionar elemento no final da fila
    public void enqueue(Object o) {
        Nodo novoNodo = new Nodo(o);
        if (tras != null) {
            tras.proximo = novoNodo;
        }
        tras = novoNodo;
        if (frente == null) {
            frente = tras;
        }
        tamanho++;
    }
    
    // remover elemento na frente da fila
    public Object dequeue() {
        if (isEmpty()) {
            throw new FilaVaziaException("A fila está vazia.");
        }
        Object dado = frente.dado;
        frente = frente.proximo;
        if (frente == null) {
            tras = null;
        }
        tamanho = tamanho - 1;
        return dado;
    }

    public Object first() {
        if (isEmpty()) {
            throw new FilaVaziaException("A fila está vazia.");
        }
        return frente.dado;
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
}
