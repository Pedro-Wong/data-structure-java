package stack;

import java.util.Scanner;
import java.util.Stack;

public class ExerciseStack {

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();

		Scanner scan = new Scanner(System.in);

		for (int i = 1; i >= 10; i++) {
			System.out.println("Entre com o numero " + i);
			int numero = scan.nextInt();

			if (numero % 2 == 0) {

				pilha.empilha(numero);

			} else {

				Integer desem = pilha.desempilha();

				if (desem == null) {
					System.out.println("A pilha está vazia");
				} else {
					System.out.println("Número ímpar, desempilhando " + desem);
				}

			}

			while (!pilha.estaVazia()) {

				System.out.println("desempilhando elemento da pilha " + pilha.desempilha());

			}

		}

	}
}
