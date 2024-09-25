package stack;

import java.util.Scanner;
import java.util.Stack;

public class ExerciseStack {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Stack<Integer> stack = new Stack();

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o número " + i + ":");
			int num = scan.nextInt();

			if (num % 2 == 0) {
				stack.push(num);
			} else {
				stack.pop();
				if (stack.isEmpty()) {
					System.out.println("A pilha está vazia");
				} else {

					stack.pop();

				}
			}

		}

		System.out.println(stack);

	}

}
