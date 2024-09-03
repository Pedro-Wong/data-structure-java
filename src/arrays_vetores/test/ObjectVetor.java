package arrays_vetores.test;

import arrays_vetores.ArrayObjects;
import classArrayTest.Contato;

public class ObjectVetor {

	public static void main(String[] args) {
		
		ArrayObjects obj = new ArrayObjects(3);
		
		
		Contato c1 = new Contato("contato 1", "2245-6719", "emailc1@gmail.com");
		Contato c2 = new Contato("contato 2", "2299-3456", "emailc2@gmail.com");
		Contato c3 = new Contato("contato 3", "2269-6821", "emailc3@gmail.com");
		Contato c4 = new Contato("contato 3", "2269-6821", "emailc3@gmail.com");
	
		
		try {
			obj.add(c1);
			obj.add(c2);
			obj.add(c3);
			
		
	
		}catch(Exception e) {
			e.printStackTrace();;
		}
		
		System.out.println("Tamanho " + obj.tamanho() );
		
		int n = obj.contain(c4);
		
		
		if(n > -1) {
			System.out.println("Elemento existe no array");
		}else {
			System.out.println("Elemento não existe no array");
		}
		
		
		
		System.out.println(obj);
		
		
		

	}

}
