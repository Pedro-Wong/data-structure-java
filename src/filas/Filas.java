package filas;

import estruturaDadosBase.EstruturaEstatica;

public class Filas<T> extends EstruturaEstatica<T> {

	Filas() {
		super();
	}

	Filas(int capacidade) {
		super(capacidade);
	}

	protected void enfileira(T elemento) {
		this.addMoreCapacity();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho++] = elemento;
		}
	}
	
	protected T espiarFila() {
		return this.elementos[0];
	}
	
	
	
	
}
