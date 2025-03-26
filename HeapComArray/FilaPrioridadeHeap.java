public class FilaPrioridadeHeap<T> {
    private No<T>[] heap;  // Array para armazenar os elementos do heap
    private int size;      // Tamanho atual do heap
    private static final int INITIAL_CAPACITY = 10;  // Capacidade inicial do heap

    @SuppressWarnings("unchecked")
    public FilaPrioridadeHeap() {
        this.heap = (No<T>[]) new No[INITIAL_CAPACITY];
        this.size = 0;
    }

    // Inserir um elemento na fila de prioridade
    public void insert(T valor, int prioridade) {
        if (size == heap.length) {
            resize();  // Redimensiona o array se ele estiver cheio
        }

        No<T> novoNo = new No<>(valor, prioridade);  // Cria um novo nó
        heap[size] = novoNo;  // Adiciona o novo nó no final do array
        size++;  // Incrementa o tamanho do heap
        heapifyUp(size - 1);  // Ajusta a posição do nó para manter a propriedade do heap
    }

    // Remover o elemento com a menor prioridade
    public No<T> removeMin() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia!");
        }

        No<T> min = heap[0];  // O menor elemento está na raiz
        No<T> last = heap[size - 1];  // O último elemento
        heap[0] = last;  // Coloca o último elemento na raiz
        size--;  // Decrementa o tamanho do heap
        heapifyDown(0);  // Ajusta o heap a partir da raiz
        return min;
    }

    // Tamanho da fila de prioridade
    public int size() {
        return size;
    }

    // Verificar se a fila está vazia
    public boolean isEmpty() {
        return size == 0;
    }

    // Retornar elemento com a menor prioridade ( sem removê-lo )
    public No<T> min() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia!");
        }
        return heap[0];  // Retorna o primeiro elemento, que é o de menor prioridade
    }

    // Método para ajustar a posição de um nó para cima (heapifyUp)
    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        while (index > 0 && heap[index].getPrioridade() < heap[parentIndex].getPrioridade()) {
            swap(index, parentIndex);  // Troca o nó com seu pai
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }
    }

    // Ajustar a posição de um nó para baixo (heapifyDown)
    private void heapifyDown(int index) {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int smallest = index;

        // Verifica se o filho da esquerda é menor que o nó atual
        if (leftChild < size && heap[leftChild].getPrioridade() < heap[smallest].getPrioridade()) {
            smallest = leftChild;
        }

        // Verifica se o filho da direita é menor que o nó atual (ou o filho da esquerda)
        if (rightChild < size && heap[rightChild].getPrioridade() < heap[smallest].getPrioridade()) {
            smallest = rightChild;
        }

        // Se o menor não for o índice atual, troca e continua ajustando
        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    // Trocar dois elementos no array
    private void swap(int i, int j) {
        No<T> temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Redimensionar o array (caso ele atinja sua capacidade máxima)
    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = heap.length * 2;  // Dobra a capacidade
        No<T>[] newHeap = (No<T>[]) new No[newCapacity];
        System.arraycopy(heap, 0, newHeap, 0, heap.length);  // Copia os elementos para o novo array
        heap = newHeap;  // Atualiza o array com o novo array redimensionado
    }
}
