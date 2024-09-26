package stack;

import java.util.Scanner;

public class ExerciseStack03 {

	public static void main(String[] args) {

		Pilha<Livros03> pilha = new Pilha();

		Livros03 livros = new Livros03();

		Scanner scan = new Scanner(System.in);

		String nome;
		String isbn;
		String ano;
		String autor;

		for (int i = 1; i <= 1; i++) {
			System.out.println("Digite o NOME do livro " + i);
			nome = scan.nextLine();
			System.out.println("Digite o ISBN do livro " + i);
			isbn = scan.nextLine();
			System.out.println("Digite o ANO do livro " + i);
			ano = scan.nextLine();
			System.out.println("Digite o AUTOR do livro " + i);
			autor = scan.nextLine();

			livros = new Livros03(nome, isbn, ano, autor);
			pilha.empilha(livros);

		}

		System.out.println(pilha);

		boolean ver = true;

		while (ver) {

			System.out.println("Digite uma opção de funcionalidade");
			System.out.println("----------------------------------");
			System.out.println("1 - empilhar mais um livro ");
			System.out.println("2 - desempilhar um livro da pilha");
			System.out.println("3 - Verificar se está vazio pilha");
			System.out.println("4 - Mostra o tamanho da pilha");
			System.out.println("5 - Mostrar o último elemento da pilha");
			System.out.println("6 - Mostrar a pilha");
			System.out.println("0 - Encerrar programa");
			String op1 = scan.nextLine();
			int opConv = Integer.parseInt(op1);

			if (opConv >= 0 && opConv <= 6) {
				
				switch (opConv) {

				case 1:
					System.out.println("Digite o NOME do livro ");
					nome = scan.nextLine();
					System.out.println("Digite o ISBN do livro ");
					isbn = scan.nextLine();
					System.out.println("Digite o ANO do livro ");
					ano = scan.nextLine();
					System.out.println("Digite o AUTOR do livro ");
					autor = scan.nextLine();

					livros = new Livros03(nome, isbn, ano, autor);
					pilha.empilha(livros);

					System.out.println("Livro acrescentado: " + pilha);
					break;
				case 2:
					System.out.println("Desempilhado " + pilha.desempilha());
					break;
				case 3:
					if (pilha.estaVazia()) {
						System.out.println("Está vazia a pilha: " + pilha);
					} else {
						System.out.println("Não está vazia a pilha: " + pilha);
					}
					break;
				case 4:
					System.out.println("O tamanho da pilha é " + pilha.tamanho());
					break;
				case 5:
					System.out.println("Elemento do topo da pilha " + pilha.Topo());
					break;
				case 6:
					System.out.println("Mostrando a pilha completa " + pilha);
					break;
				case 0:
					System.out.println("Acabou o programa");
					ver = false;
					break;
				}
				
				
			} else {
				
				System.out.println("Número de opção não válido");
				
			}

		}

	}

}
