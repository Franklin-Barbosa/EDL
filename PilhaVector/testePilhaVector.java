public class testePilhaVector {

	public static void main(String[] args) {		
		PilhaVector pp=new PilhaVector();

		System.out.println("inserindo");
		for(int f=0; f<10; f++){
		  System.out.println(f);		  
		  pp.push(new Integer(f));
		}

		System.out.println("retirando");
		for(int f=0; f<10; f++){
			  System.out.print(f);
			  System.out.println(" - "+pp.pop());
		}
	}
}
