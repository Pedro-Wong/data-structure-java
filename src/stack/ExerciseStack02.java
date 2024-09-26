package stack;

import java.util.Scanner;

public class ExerciseStack02 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha();

		Pilha<Integer> pilha2 = new Pilha();

		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o número" + i);
			int num = scan.nextInt();

			if (num == 0) {

				Integer desemp = pilha.desempilha();

				// pilha par

				if (desemp == null) {
					System.out.println("A Pilha par está vazia");
				} else {
					System.out.println("Foi desempilhado da pilha par " + desemp);
				}

				// pilha impar

				desemp = pilha2.desempilha();

				if (desemp == null) {
					System.out.println("A Pilha ímpar está vazia ");
				} else {
					System.out.println("Foi desempilhado da pilha ímpar" + desemp);
				}

			} else if (num % 2 == 0) {
				pilha.add(num);

			} else {
				pilha2.add(num);
			}

		}

		System.out.println("Desempilhando todos os números da pilha par");
		while (!pilha.estaVazia()) {
			System.out.println("Desempilhando da pilha par: " + pilha.desempilha());
		}

		System.out.println("Desempilhando todos os números da pilha impar");
		while (!pilha2.estaVazia()) {
			System.out.println("Desempilhando da pilha impar: " + pilha2.desempilha());
		}

	}

}
