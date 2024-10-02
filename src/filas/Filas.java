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
	
	protected T remover() {
		if(this.estaVazia()) {
			return null;
		}
		
		final int POS = 0;
		T elementoRemovido = this.elementos[POS];
		
		/* Movendo os elementos para frente */
		for(int i = POS; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i+1];
			
		}
		
		
		this.tamanho--;
		return elementoRemovido;
		
	}
	
	
}
