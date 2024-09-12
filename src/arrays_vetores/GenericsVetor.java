package arrays_vetores;

public class GenericsVetor<T> {

	private T[] elementos;

//	Controla o tamanho real do vetor
	private int tam;

	public GenericsVetor(int cap) {
//		instanciando vetores de forma genérica 
		this.elementos = (T[]) new Object[cap];
		this.tam = 0;
	}

	public GenericsVetor() {

	}

	public Object[] getElementos() {
		return elementos;
	}

	// Adicionando elementos na última posição

	public void add(T element) throws Exception {
		this.addMoreCapacity();
		if (this.tam < this.elementos.length) {
			this.elementos[this.tam] = element;
			this.tam++;

		} else {
			throw new Exception("Está cheio o vetor");
		}
	}

//	Adicionar um elemento em qualquer posição do array
	public boolean add(int position, T element) {

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

		if (this.tam == this.elementos.length) {
			T[] newElementos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				newElementos[i] = this.elementos[i];
			}
			this.elementos = newElementos;
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
	public T search(int position) {
		if (!(position >= 0 && position < tam)) {
			throw new IllegalArgumentException("Position not allowed");
		}
		return this.elementos[position];

	}

	// algoritmo de busca sequencial simples em vetor para verificar se um elemento
	// existe
	public int contain(T element) {
		for (int i = 0; i < this.tam; i++) {
			if (this.elementos[i].equals(element)) {
				return i;
			}

		}
		return -1;
	}

//	removendo elementos de uma posição do array

	public void remove(int position) {
		if (!(position >= 0 && position < this.tam)) {
			throw new IllegalArgumentException("Posição não existente");
		}

		for (int i = position; i < this.tam - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tam--;
	}

	// último indice de um elemento

	public int lastIndex(T element) {

		for (int i = this.tam - 1; i >= 0; i--) {
			if (this.elementos[i].equals(element)) {
				return i;
			}

		}

		return -1;

	}

	// sobrecarregando o método remove, método remove melhorado
	public void remove(T element) {
		int pos = this.contain(element);
		if (pos > -1) {
			this.remove(pos);
		}
	}

	// limpar o array e a referência de memória

	public void clean() {
		/* opção 1 */
		/* this.elementos = (T[]) new Object[this.elementos.length]; */

		/* opção 2 */
		/* this.tam = 0; */

		/* opção 3 */
		for (int i = 0; i < this.elementos.length; i++) {
			this.elementos[i] = null;
		}
		this.tam = 0;
	}

}
