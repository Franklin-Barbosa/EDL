
public class testeFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FilaSimplesmenteEncadeada f = new FilaSimplesmenteEncadeada(); //criando fila tamnho 1 e duplicação
		f.enqueue(1);
		f.enqueue(2);
		f.enqueue(3);
		f.enqueue(4);
		try{
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			f.dequeue();
			System.out.println(f.first());
			f.dequeue();
			f.dequeue(); // linha para chamar a exceção
		}catch(FilaVaziaException erro){
			System.out.println(erro.getMessage());
			
		}
	}

}
