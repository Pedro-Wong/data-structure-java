package arrays_vetores.test;

import arrays_vetores.Vetor;

public class Aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vetor vetor = new Vetor(2);
		
		try {
			
			for(int i = 0; i < 3; i++) {
				vetor.add(" Posição " + i);	
				
			}
//			vetor.add("primeira posição");
//			vetor.add("segunda posição");
//			vetor.add("terceira posição");
			
			System.out.println(vetor.toString());

//			System.out.println(vetor.search(2));
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
