package arrays_vetores;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
//	Controla o tamanho real do vetor
	private int tam;

	public Vetor(int cap) {
		this.elementos = new String[cap];
		this.tam = 0;
	}

//	  public void add(String element) { for (int i = 0; i < this.elementos.length;
//	  i++) { if (this.elementos[i] == null) { this.elementos[i] = element; break; }
//	  } }

	public String[] getElementos() {
		return elementos;
	}

	// Adicionando elementos na última posição

	public void add(String element) throws Exception {
		this.addMoreCapacity();
		if (this.tam < this.elementos.length) {
			this.elementos[this.tam] = element;
			this.tam++;

		} else {
			throw new Exception("Está cheio o vetor");
		}
	}

	// Mostrando o tamanho real do vetor
	public int tamanho() {
		return this.tam;
	}

	// Mostrando o array
	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();

		s.append("[");

		for (int i = 0; i < this.tam - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tam > 0) {
			s.append(this.elementos[this.tam - 1]);
		}

		s.append("]");

		return s.toString();
	}

	// pegando um elemento de uma posição
	public String search(int position) {
		if (!(position >= 0 && position < tam)) {
			throw new IllegalArgumentException("Position not allowed");
		}
		return this.elementos[position];

	}

	// algoritmo de busca sequencial simples em vetor para verificar se um elemento
	// existe
	public int contain(String element) {
		for (int i = 0; i < this.tam; i++) {
			if (this.elementos[i].equals(element)) {
				return i;
			}

		}
		return -1;
	}

//	Adicionar um elemento em qualquer posição do array
	public boolean add(int position, String element) {

		if (!(position >= 0 && position < tam)) {
			throw new IllegalArgumentException("Position not allowed");
		}
		
		this.addMoreCapacity();
		
		
//		mover todos os elementos
		for (int i = this.tam - 1; i >= position; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[position] = element;
		this.tam++;

		return true;

	}
	
//	adicionando mais capacidade no vetor
	
	private void addMoreCapacity() {
		
		if(this.tam == this.elementos.length) {
			String[] newElementos = new String[this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length; i++) {
				newElementos[i] = this.elementos[i];	
			}
			this.elementos = newElementos;		
		}
		
		
		
	}
	
	
	
	
	
}
