package stack;

public class Exercise04 {

	public static void main(String[] args) {

		imprime("ana");

	}

	public static void imprime(String palavra) {
		System.out.println("A palavra ' " + palavra +" ' é palíndromo? " + palin(palavra));
	}

	public static boolean palin(String palavra) {

		Pilha<Character> pilha = new Pilha();

		for (int i = 0; i < palavra.length(); i++) {
			pilha.empilha(palavra.charAt(i));
		}

		String palavraInversa = "";

		while (!pilha.estaVazia()) {
			palavraInversa += pilha.desempilha();
		}

		if (palavraInversa.equalsIgnoreCase(palavra)) {
			return true;
		}

		return false;

	}

}
