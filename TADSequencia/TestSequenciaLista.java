package TADSequencia;

import listaDuplamente.Node;

public class TestSequenciaLista {
    public static void main(String[] args) throws SequenciaVaziaException {
        
        SequenciaLista sequence = new SequenciaLista();
        sequence.insertFirst(1);
        sequence.insertFirst(2); // 2 5 1 10 4
        sequence.insertLast(4);
        sequence.insertBefore(2,10);
        sequence.insertAfter(0,5);
        sequence.print();
        Node no = sequence.atRank(4);
        System.out.println("Rank do no = "+ sequence.rankOf(no));
    }
}
