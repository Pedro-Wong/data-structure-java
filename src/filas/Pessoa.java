package filas;

public class Pessoa {

	private String pessoa;
	private int prioridade;

	public Pessoa(String pessoa, int prioridade) {
		super();
		this.pessoa = pessoa;
		this.prioridade = prioridade;
	}

	public Pessoa() {
		super();
	}

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

}
