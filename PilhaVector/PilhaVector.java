import java.util.Vector;

public class PilhaVector implements Pilha {
    private Vector<Object> elementos;

    public PilhaVector() {
        elementos = new Vector<>();
    }

    @Override
    public int size() {
        return elementos.size();
    }

    @Override
    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    @Override
    public Object top() throws PilhaVaziaExcecao {
        if (isEmpty()) {
            throw new PilhaVaziaExcecao("A pilha está vazia.");
        }
        return elementos.lastElement();
    }

    @Override
    public void push(Object o) {
        elementos.add(o);
    }

    @Override
    public Object pop() throws PilhaVaziaExcecao {
        if (isEmpty()) {
            throw new PilhaVaziaExcecao("A pilha está vazia.");
        }
        return elementos.remove(elementos.size() - 1);
    }
}
