package listas;

public class ListaEncadeadaTeste {

	public static void main(String[] args) {
		
		ListaEncadeada lista = new ListaEncadeada<Integer>();
		lista.adiciona(1);
		/* System.out.println(lista); */
		
		
		lista.adiciona(2);
		/* System.out.println(lista); */
		lista.adiciona(3);
		/*
		 * lista.adiciona(4); lista.adiciona(5); lista.adiciona(6);
		 */
		System.out.println(lista);
		
		//busca por elemento
		System.out.println("busca por elemento");
		System.out.println(lista.busca(0));
		System.out.println(lista.busca(1));
		System.out.println(lista.busca(2));
		System.out.println(lista.busca(3));
		System.out.println(lista.busca(100));
		
		//busca por posicao
		System.out.println("busca por posicao");
		System.out.println(lista.buscaPorPosicao(0));
		System.out.println(lista.buscaPorPosicao(1));
		System.out.println(lista.buscaPorPosicao(2));
		System.out.println(lista.buscaPorPosicao(4));
		System.out.println(lista.buscaPorPosicao(-1));
	}

}
