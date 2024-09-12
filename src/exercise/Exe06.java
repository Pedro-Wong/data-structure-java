package exercise;

import java.util.Scanner;

import arrays_vetores.GenericsVetor;
import classArrayTest.Contato;

public class Exe06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		GenericsVetor<Contato> v = new GenericsVetor(20);

		// criarContato(5, v);

		int opcao = 1;

		while (opcao != 0) {
			opcao = opcaoMenu(scan);

			switch (opcao) {
			case 1:
				adicionarFinal(scan, v);
				break;

			case 2:
				adicionarContatoPosicao(scan, v);
				break;

			case 3:
				obtemContatoPosicao(scan, v);
				break;
			case 4:
				obtemContato(scan, v);
				break;
			case 5:
				pesquisarUltimoIndice(scan, v);
				break;
			case 6:
				pesquisarContatoExiste(scan, v);
				break;
			case 7:
				excluirPorPosicao(scan, v);
				break;
			case 8:
				excluirContato(scan, v);
				break;
			case 9:
				imprimiTamanhoVetor(v);
				break;

			case 10:
				limparVetor(v);
				break;
			case 11:
				mostrarVetor(v);
				break;
			default:
				System.out.println("Opção não existente");
				break;

			}

		}

		System.out.println("Acabou o programa usuário digitou 0");

	}

	private static void mostrarVetor(GenericsVetor<Contato> lista) {

		System.out.println("Array: " + lista.toString());

	}

	private static void limparVetor(GenericsVetor<Contato> lista) {

		lista.clean();
		System.out.println("Array foi zerado");

	}

	private static void imprimiTamanhoVetor(GenericsVetor<Contato> lista) {

		System.out.println("O tamanho do vetor é: " + lista.tamanho());

	}

	private static void excluirPorPosicao(Scanner scan, GenericsVetor<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição: ", scan);

		try {

			lista.remove(pos);
			System.out.println("Contato excluído");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static void excluirContato(Scanner scan, GenericsVetor<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição: ", scan);

		try {

			Contato contato = lista.search(pos);
			lista.remove(contato);
			System.out.println("Contato excluído");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static void pesquisarContatoExiste(Scanner scan, GenericsVetor<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posição: ", scan);

		try {

			Contato contato = lista.search(pos);

			System.out.println("Contato existe: ");
			pos = lista.lastIndex(contato);

			int existe = lista.contain(contato);

			if (existe < 0) {
				System.out.println("Contato não existe ");
			} else {
				System.out.println("Contato existe na posição" + pos);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static void adicionarFinal(Scanner scan, GenericsVetor<Contato> lista) {
		System.out.println("Entre com as informações: ");
		String nome = leInformacao("Entre com o nome:", scan);
		String telefone = leInformacao("Entre com o telefone", scan);
		String email = leInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		try {
			lista.add(contato);
			System.out.println("Contato add no final da lista");
			System.out.println(contato.toString());
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	private static void adicionarContatoPosicao(Scanner scan, GenericsVetor<Contato> lista) {
		System.out.println("Entre com as informações: ");
		String nome = leInformacao("Entre com o nome:", scan);
		String telefone = leInformacao("Entre com o telefone", scan);
		String email = leInformacao("Entre com o email", scan);

		Contato contato = new Contato(nome, telefone, email);

		int pos = leInformacaoInt("Digite a posição: ", scan);

		try {
			lista.add(pos, contato);
			System.out.println("Contato adicionado com sucesso");
			System.out.println(contato.toString());
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	private static void obtemContato(Scanner scan, GenericsVetor<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posicao", scan);

		try {

			Contato contato = lista.search(pos);

			System.out.println("Pesquisa do contato encontrado: ");
			pos = lista.contain(contato);
			System.out.println("Contato encontrado na posição: " + pos);

		} catch (Exception e) {
			System.out.println("Posicao não válida");
		}

	}

	private static void pesquisarUltimoIndice(Scanner scan, GenericsVetor<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posicao", scan);

		try {

			Contato contato = lista.search(pos);

			System.out.println("Ultimo indice do contato: ");
			pos = lista.lastIndex(contato);
			System.out.println("Contato encontrado na posição: " + pos);

		} catch (Exception e) {
			System.out.println("Posicao não válida");
		}

	}

	private static void obtemContatoPosicao(Scanner scan, GenericsVetor<Contato> lista) {

		int pos = leInformacaoInt("Entre com a posicao", scan);

		try {

			Contato contato = lista.search(pos);
			System.out.println("Contato existe: " + contato);

		} catch (Exception e) {
			System.out.println("Posicao não válida");
		}

	}

	private static String leInformacao(String msg, Scanner scan) {
		System.out.println(msg);
		String entrada = scan.nextLine();

		return entrada;

	}

	private static int leInformacaoInt(String msg, Scanner scan) {

		boolean entradaValida = false;

		int num = 0;

		while (!entradaValida) {

			try {
				System.out.println(msg);
				String entrada = scan.nextLine();

				num = Integer.parseInt(entrada);

				entradaValida = true;

			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente");
			}

		}
		return num;
	}

	private static void criarContato(int quant, GenericsVetor<Contato> lista) {

		Contato contato;

		for (int i = 1; i <= quant; i++) {

			contato = new Contato();
			contato.setNome("Nome " + i);
			contato.setTelefone("Telefone: " + i);
			contato.setEmail("nome" + i + "@email.com");

		}

	}

	private static int opcaoMenu(Scanner scan) {

		boolean entradaValida = false;
		int conEntrada = 0;
		String entrada;

		while (!entradaValida) {

			System.out.println("Digite a opção: ");
			System.out.println("1: Adiciona contato ao final do vetor ");
			System.out.println("2: Adiciona contato em uma posição especifíca ");
			System.out.println("3: Obtém contato de uma posição especifíca");
			System.out.println("4: Consulta contato");
			System.out.println("5: Consulta último índice do contato");
			System.out.println("6: Verifica se o contato existe");
			System.out.println("7: Remove por posição");
			System.out.println("8: Excluir contato");
			System.out.println("9: Verifica tamanho do vetor");
			System.out.println("10: Excluir todos os contatos do vetor");
			System.out.println("11: imprimir vetor");
			System.out.println("0: Sair");

			try {
				entrada = scan.nextLine();
				conEntrada = Integer.parseInt(entrada);

				if (conEntrada >= 0 && conEntrada <= 11) {
					entradaValida = true;
				} else {
					throw new Exception();
				}

			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente");
			}

		}

		return conEntrada;

	}

}
