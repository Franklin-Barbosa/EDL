public class PilhaSimplesmenteEncadeada {
    private Nodo topo;
    private int tamanho;

    public PilhaSimplesmenteEncadeada() {
        this.topo = null;
        this.tamanho = 0;
    }

    public void push(Object o) {
        Nodo novoNodo = new Nodo(o);
        novoNodo.proximo = topo;
        topo = novoNodo;
        tamanho++;
    }

    public Object pop() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia.");
        }
        Object dado = topo.dado;
        topo = topo.proximo;
        tamanho--;
        return dado;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new RuntimeException("A pilha está vazia.");
        }
        return topo.dado;
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
}
