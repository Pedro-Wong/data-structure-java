package listas;

public class ListaEncadeada<T> {

	private No<T> ultimo;
	private No<T> inicio;
	private int tamanho;

	public void adiciona(T elemento) {
		No<T> celula = new No<T>(elemento);

		if (this.tamanho == 0) {
			this.inicio = celula;
			
		} else {
			this.ultimo.setProximo(celula);

		}
		this.ultimo = celula;
		this.tamanho++;
	}

//	tamanho da lista
	public int getTamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio + "]";
	}

}
