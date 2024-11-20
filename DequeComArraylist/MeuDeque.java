import java.util.ArrayList;

public class MeuDeque implements IDeque {
    private ArrayList<Object> deque;  // Usando ArrayList para armazenar os elementos

    public MeuDeque() {
        deque = new ArrayList<>();
    }

    @Override
    public void inserirInicio(Object o) {
        deque.add(0, o);
    }

    @Override
    public void inserirFim(Object o) {
        deque.add(o);
    }

    // Remove e retorna o primeiro elemento
    @Override
    public Object removerInicio() {
        if (estaVazio()) {
            throw new FilaVaziaException("Deque vazio.");
        }
        return deque.remove(0);
    }

    @Override
    public Object removerFim() {
        if (estaVazio()) {
            throw new FilaVaziaException("Deque vazio.");
        }
        return deque.remove(deque.size() - 1);
    }

    @Override
    public Object primeiro() {
        if (estaVazio()) {
            throw new FilaVaziaException("Deque vazio.");
        }
        return deque.get(0);
    }

    @Override
    public Object ultimo() {
        if (estaVazio()) {
            throw new FilaVaziaException("Deque vazio.");
        }
        return deque.get(deque.size() - 1);
    }

    @Override
    public int tamanho() {
        return deque.size();
    }

    @Override
    public boolean estaVazio() {
        return deque.isEmpty();
    }
}
