package listas;

public class ListaEncadeadaTeste {

	public static void main(String[] args) {
		
		ListaEncadeada lista = new ListaEncadeada<Integer>();
		lista.adiciona(1);
		
		/*
		 * System.out.println(lista); System.out.println("Tamanho da lista = " +
		 * lista.getTamanho());
		 */
		
		lista.adiciona(2);
		
		System.out.println(lista);
		
	}

}
