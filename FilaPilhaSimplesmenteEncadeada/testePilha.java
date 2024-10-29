public class testePilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilhaSimplesmenteEncadeada p = new PilhaSimplesmenteEncadeada(); //criando fila tamnho 1 e duplicação
		p.push(1);
		p.push(2);
		p.push(3);
		p.push(4);
		try{
			System.out.println(p.peek());
			p.pop();
			System.out.println(p.peek());
			p.pop();
			System.out.println(p.peek());
			p.pop();
			System.out.println(p.peek());
			p.pop();
			System.out.println(p.peek());
			p.pop();
			p.pop(); // linha para chamar a exceção
		}catch(FilaVaziaException erro){
			System.out.println(erro.getMessage());
			
		}
	}

}