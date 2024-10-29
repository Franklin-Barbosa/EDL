public class FilaSimplesmenteEncadeada {
    private Nodo frente;
    private Nodo tras;
    private int tamanho;

    public FilaSimplesmenteEncadeada() {
        this.frente = null;
        this.tras = null;
        this.tamanho = 0;
    }

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

    public Object dequeue() {
        if (isEmpty()) {
            throw new FilaVaziaException("A fila está vazia.");
        }
        Object dado = frente.dado;
        frente = frente.proximo;
        if (frente == null) {
            tras = null;
        }
        tamanho--;
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
