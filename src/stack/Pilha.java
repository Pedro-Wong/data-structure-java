package stack;

import estruturaDadosBase.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha() {
		super();
	}

	public Pilha(int capacidade) {
		super(capacidade);

	}

	protected boolean add(T elemento) {
		return super.add(elemento);
	}

	protected boolean add(int position, T element) {
		return super.add(position, element);

	}

	protected int tamanho() {
		return super.tamanho();
	}

	// adicionando elemento no final da pilha
	public void empilha(T elemento) {
		this.add(elemento);

	}

	/* Mostra o último elemento da pilha */
	public T Topo() {

		if (this.estaVazia()) {
			return null;
		}

		return this.elementos[this.tamanho - 1];

	}

	// retira o último elemento da pilha
	public T desempilha() {
		if (this.estaVazia()) {
			return null;
		}

		T elemento = this.elementos[tamanho - 1];
		tamanho--;

		return elemento;

	}

}
