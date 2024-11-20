
public interface IDeque {
    void inserirInicio(Object o);
    void inserirFim(Object o);
    Object removerInicio();
    Object removerFim();
    Object primeiro();
    Object ultimo();
    int tamanho();
    boolean estaVazio();
}
