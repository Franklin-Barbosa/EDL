import java.util.Deque;

public class testeDeque {

	public static void main(String[] args) {
        MeuDeque deque = new MeuDeque();

        // Adicionando elementos
        deque.inserirInicio(1);
        deque.inserirInicio(2);
        deque.inserirInicio(3);
        deque.inserirInicio(4);

        System.out.println("Primeiro elemento: " + deque.primeiro());
        System.out.println("Último elemento: " + deque.primeiro());

        System.out.println("Removendo o primeiro: " + deque.removerInicio());
        System.out.println("Removendo o último: " + deque.removerFim());

        System.out.println("Primeiro elemento após remoções: " + deque.primeiro());
        System.out.println("Último elemento após remoções: " + deque.ultimo());

        System.out.println("Tamanho do deque: " + deque.tamanho()); 

        deque.removerInicio();
        deque.removerFim();

        System.out.println("Deque está vazio? " + deque.estaVazio());

        // Tentando acessar o primeiro elemento de um deque vazio
        try {
            deque.primeiro();
        } catch (FilaVaziaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
	}

}
