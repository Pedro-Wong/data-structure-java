package listas;

public class ListaEncadeada<T> {

	private No<T> ultimo;
	private No<T> inicio;
	private int tamanho;
	
//	adicionando ao final da lista
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
		
		if(this.tamanho == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		
		No<T> atual = this.inicio;
		
		for(int i = 0; i < this.tamanho -1; i++) {
			builder.append(atual.getElemento()).append(", ");
			atual = atual.getProximo();
		}
		builder.append(atual.getElemento());
		
		/*
		 * builder.append(atual.getElemento()).append(",");
		 * 
		 * while(atual.getProximo() != null) { atual = atual.getProximo();
		 * builder.append(atual.getElemento()).append(","); }
		 */
		
		return builder.toString();
	}

}
