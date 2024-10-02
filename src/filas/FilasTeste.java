package filas;

public class FilasTeste {

	public static void main(String[] args) {

		Filas<Integer> filas = new Filas();

		filas.enfileira(115052);
		filas.enfileira(2);
		filas.enfileira(3);
		filas.enfileira(4);

		System.out.println(filas);

		/* System.out.println(filas.espiarFila()); */
		
		
		filas.remover();
		System.out.println(filas);
		filas.remover();
		System.out.println(filas);
		filas.remover();
		System.out.println(filas);
	}

}
