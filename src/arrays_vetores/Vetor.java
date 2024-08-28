package arrays_vetores;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tam;

	public Vetor(int cap) {
		this.elementos = new String[cap];
		this.tam = 0;
	}


	 
//	  public void add(String element) { for (int i = 0; i < this.elementos.length;
//	  i++) { if (this.elementos[i] == null) { this.elementos[i] = element; break; }
//	  } }
	  
	
	public void add(String element) throws Exception {
		if(this.tam < this.elementos.length) {
			this.elementos[this.tam] = element;
			this.tam++;
			
		}else {
			throw new Exception("Está cheio o vetor do vetor");
		}
		
	}
	
	
	public int tamanho() {
		return this.tam;
	}



	@Override
	public String toString() {
		
		return  Arrays.toString(elementos);
	}


	
	
	
	
	
	
	
	

}
