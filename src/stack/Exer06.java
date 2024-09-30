package stack;

public class Exer06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	final static String ABRE = "([{";
	final static String FECHA = ")]}";

	public static boolean verificaSimbolo(String expressao){

		Pilha<Character> pilha = new Pilha();

		int index = 0;
		char simbolo, topo;

		while (index < expressao.length()) {
			simbolo = expressao.charAt(index);

			if (ABRE.indexOf(simbolo) > 1) {
				pilha.empilha(simbolo);

			} else if (FECHA.indexOf(simbolo) > 1) {
				if (pilha.estaVazia()) {
					return false;
				} else {
					topo = pilha.desempilha();
					if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
						return false;
					}
				}
			}
			index++;
		}

		return true;

	}

}
