package listas;

public class ListaEncadeada<T> {

	private No<T> inicio;
	private No<T> ultimo;
	private int tamanho;
	private final int NAO_ENCONTRADO = -1;

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
	// método auxiliar para adicionar no inicio da lista
	public void adicionaInicio(T elemento) {
		if(this.tamanho == 0) {
			No<T> novoNo = new No<>(elemento);
			this.inicio = novoNo;
			this.ultimo = novoNo;
		
		}else {
			No<T> novoNo = new No<>(elemento, this.inicio);
			this.inicio = novoNo;
					
		}
		this.tamanho++;
	
	}
		
	// adiciona em qualquer posicao da lista 
	public void adiciona(int posicao, T elemento ){
		
		if(posicao < 0 || posicao > this.tamanho ){
			throw new IllegalArgumentException("Posicao não válida ");
		}
		
		if(posicao == 0){
			this.adicionaInicio(elemento);
			
		}else if(posicao == this.tamanho){
			this.adiciona(elemento);
			
		}else{
			No<T> noAnterior = this.buscaNo(posicao);
			No<T> proximoNo = noAnterior.getProximo();
			No<T> novoNo = new No(elemento, proximoNo);
			noAnterior.setProximo(novoNo);
			this.tamanho++;
		}
		
	}
	
//	tamanho da lista
	public int getTamanho() {
		return this.tamanho;
	}

	//removendo elemento do inicio
	public T removeInicio() {
		if(this.tamanho == 0) {
			throw new RuntimeException("Lista está vazia");
		}
		//guardando a referência do elemento
		T removido = this.inicio.getElemento();
		//o proximo no vira o inicio
		this.inicio = this.inicio.getProximo();
		
		this.tamanho--;
		
		if(this.tamanho == 0) {
			this.ultimo = null;
		}
		
		return removido;
		
	
	}
	//removendo elemento do final da lista
	public T removeFinal() {
		if(this.tamanho == 0) {
			throw new RuntimeException("Lista está vazia");
		}
		if(this.tamanho == 1) {
			return this.removeInicio();
		}
		//Pegando o penultimo No
		No<T> penultimoNo = this.buscaNo(this.tamanho - 2);
		//guardando a referencia do ultimo No
		T removido = penultimoNo.getProximo().getElemento();
		//setando o ponteiro do penultimo para null
		penultimoNo.setProximo(null);
		//transforamndo o penultimoNo em ultimo
		this.ultimo = penultimoNo;
		this.tamanho--;
		
		return removido;
		
	}
	// removendo de qualquer posicao
	public T remove(int posicao) {
		
		if(posicao < 0 || posicao > this.tamanho ){
			throw new IllegalArgumentException("Posicao não válida ");
		}
		
		if(posicao == 0){
			return this.removeInicio();
		}
		
		if(posicao == this.tamanho - 1) {
			return this.removeFinal();
		}
		//Pegando o nó anterior a posicao inserida
		No<T> noAnterior = this.buscaNo(posicao -1);
		//pegando o nó atual
		No<T> atual = noAnterior.getProximo();
		//pegando o próximo nó a partir do nó atual
		No<T> proximo = atual.getProximo();
		//setando o ponteiro do nó anterior para o próximo nó
		noAnterior.setProximo(proximo);
		//limpando a referência do nó atual
		atual.setProximo(null);
		this.tamanho--;
		
		return atual.getElemento();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// limpando a lista
	public void limpa() {
		// limpando a lista da memória, otimizando armazenamento de memória
		for (No<T> atual = this.inicio; atual != null;) {
			No<T> proximo = atual.getProximo();
			atual.setElemento(null);
			atual.setProximo(null);
			atual = proximo;

		}
		this.inicio = null;
		this.ultimo = null;
		this.tamanho = 0;
	}

	// buscando um elemento por meio de uma posicao, método privado para não dar acesso aos ponteiros
	private No<T> buscaNo(int posicao) {
		if (!(posicao >= 0 && posicao <= this.tamanho)) {
			throw new IllegalArgumentException("Posição não válida");

		}

		No<T> noAtual = this.inicio;
		
		for (int i = 0; i < posicao; i++) {
			noAtual = noAtual.getProximo();
		}

		return noAtual;
	}

	public T buscaPorPosicao(int posicao) {
		return this.buscaNo(posicao).getElemento();
	}
	//fazendo a busca por meio de um elemento
	public int busca(T elemento) {

		No<T> atual = this.inicio;
		int pos = 0;

		for (int i = 0; i < this.tamanho; i++) {
			if (atual.getElemento().equals(elemento)) {
				return pos;
			}
			pos++;
			atual = atual.getProximo();
		}

		return NAO_ENCONTRADO;
	}

// iterando por todos os elementos da lista por meio do método to string 
	@Override
	public String toString() {

		if (this.tamanho == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder();

		No<T> atual = this.inicio;

		for (int i = 0; i < this.tamanho - 1; i++) {
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
