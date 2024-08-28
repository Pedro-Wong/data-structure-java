package arrays_vetores.test;

import arrays_vetores.Vetor;

public class Aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vetor vetor = new Vetor(10);
		
		try {
			vetor.add("primeira posição");
			vetor.add("segunda posição");
			vetor.add("terceira posição");
			System.out.println(vetor.tamanho());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
