package stack;

import java.util.Stack;

public class Exer07 {

	public static void main(String[] args) {
		imprime(15);
		imprime(25);
		imprime(10035);
	}

	public static void imprime(int num) {
		System.out.println(num + " em binário: " + deciBin(num));

	}

	public static String deciBin(int num) {
		Stack<Integer> pilha = new Stack();
		String numBinario = "";
		int resto;

		while (num > 0) {
			resto = num % 2;
			pilha.push(resto);
			num /= 2;

		}

		while (!pilha.isEmpty()) {
			numBinario += pilha.pop();

		}

		return numBinario;
	}

	public static String deciBinQualquerBase(int num, int base) {

		Stack<Integer> pilha = new Stack();
		String numBase = "";
		int resto;
		String bases = "0123456789ABCDEF";

		while (num > 0) {
			resto = num % base;
			pilha.push(resto);
			num /= base;

		}

		while (!pilha.isEmpty()) {
			numBase += bases.charAt(pilha.pop());

		}

		return numBase;
	}

}
