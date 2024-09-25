package stack;

import java.util.Stack;

public class ApiStackJava {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack();

		System.out.println(stack.isEmpty());

		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}

		System.out.println(stack);
		System.out.println(stack.isEmpty());
		System.out.println(stack.size());
		System.out.println(stack.peek());
		
		
		System.out.println(stack.pop());
		System.out.println(stack);


	}

}
