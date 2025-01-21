public class Main {
    public static void main(String[] args) {
        FilaPrioridadeHeap<String> fila = new FilaPrioridadeHeap<>();

        fila.insert("A", 3);
        fila.insert("B", 1);
        fila.insert("C", 2);
        fila.insert("D", 5);
        fila.insert("E", 4);

        System.out.println("Tamanho da fila: " + fila.size());
        System.out.println("Elemento com menor prioridade: " + fila.min().getValor());

        while (!fila.isEmpty()) {
            System.out.println("Removendo: " + fila.removeMin().getValor());
        }
    }
}
