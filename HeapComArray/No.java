
public class No<T> {
    private T valor;  // Armazena o valor de tipo genérico T que o nó irá representar
    private int prioridade;  // Armazena a prioridade associada ao valor do nó

    public No(T valor, int prioridade) {
        this.valor = valor;
        this.prioridade = prioridade;
    }

    public T getValor() {
        return valor;
    }

    public int getPrioridade() {
        return prioridade;
    }
}
