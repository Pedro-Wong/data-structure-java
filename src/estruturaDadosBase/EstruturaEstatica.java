package estruturaDadosBase;

public class EstruturaEstatica<T> {

	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public EstruturaEstatica() {
		this(10);
	}

	// Adiciona no final
	protected boolean add(T element) {
		this.addMoreCapacity();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = element;
			this.tamanho++;
			return true;

		} else {
			return false;
		}
	}

	// adiciona em qualquer poisção
	protected boolean add(int position, T element) {

		if (!(position >= 0 && position < tamanho)) {
			throw new IllegalArgumentException("Position not allowed");
		}

		this.addMoreCapacity();

//		mover todos os elementos
		for (int i = this.tamanho - 1; i >= position; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[position] = element;
		this.tamanho++;

		return true;

	}

	// adicionando mais espaço
	protected void addMoreCapacity() {

		if (this.tamanho == this.elementos.length) {
			T[] newElementos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				newElementos[i] = this.elementos[i];
			}
			this.elementos = newElementos;
		}

	}

	// Mostrando o tamanho real da pilha 
	protected int tamanho() {
		return this.tamanho;
	}
	// verifica se está vazio a pilha
	public boolean estaVazia() {
		return this.tamanho == 0;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();

		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

}
