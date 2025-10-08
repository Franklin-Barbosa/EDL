package Pilha;

public class TestePilha {
    public static void main(String[] args) {
        PilhaArray pp = new PilhaArray(1);

        System.out.println("Inserindo");
        long startTime = System.currentTimeMillis();
        for(int f = 0; f < 5; f++){
            pp.push(f);
        }
        long endTime = System.currentTimeMillis();
        long tempoExecucao = endTime - startTime;
        System.out.println("tempo " + tempoExecucao);

        pp.listar();

        pp.pop();
        pp.listar();
        pp.pop();
        pp.listar();
    }
}
