package stack;

public class TestePilha {

	public static void main(String[] args) {
		/*
		 * Pilha<Integer> pilha = new Pilha();
		 * 
		 * 
		 * 
		 * for(int i = 1; i <= 10; i++) { pilha.empilha(i); }
		 * 
		 * System.out.println(pilha); System.out.println(pilha.tamanho());
		 */
		
		
		/*
		 * Pilha<Integer> pilha = new Pilha(5);
		 * 
		 * System.out.println(pilha);
		 * 
		 * System.out.println(pilha.estaVazia());
		 */
		
		/*
		 * Pilha<Integer> pilha = new Pilha(3);
		 * 
		 * System.out.println(pilha.Topo());
		 * 
		 * for(int i = 1; i <= 3; i++) { pilha.empilha(i); }
		 * 
		 * 
		 * 
		 * System.out.println(pilha);
		 */
		
		Pilha<Integer> pilha = new Pilha(20);
		
		 for(int i = 1; i <= 20; i++) { pilha.empilha(i); }
		
		
		
		System.out.println("Antes: " + pilha);
		
		pilha.desempilha();
		
		System.out.println(pilha);
		
		
		
		
	}

}
