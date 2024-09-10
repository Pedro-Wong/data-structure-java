package arrays_vetores.test;

import arrays_vetores.GenericsVetor;

public class Generic {
	
	public static void main(String[] args) {
		
		GenericsVetor<String> v = new GenericsVetor(5); 
		
		try {
			
			v.add("A");
			v.add("B");
			v.add("C");
			v.add("D");
			v.add("E");
			
			System.out.println(v);
			
			v.clean();
			
			System.out.println(v);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
}
