package filas;

public class Exer01 {

	public static void main(String[] args) {

		Filas<Documento> fila = new Filas();

		fila.enfileira(new Documento("Nome 1", 1));
		fila.enfileira(new Documento("Nome 2", 2));
		fila.enfileira(new Documento("Nome 3", 10));
		fila.enfileira(new Documento("Nome 2", 5));
		fila.enfileira(new Documento("Nome 1", 9));
		fila.enfileira(new Documento("Nome 2", 3));

		while (!fila.estaVazia()) {
			Documento doc = fila.remover();
			System.out.println("imprimindo o documento " + doc.getNome());
			try {
				Thread.sleep(200 * doc.getNumFolhas());

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
