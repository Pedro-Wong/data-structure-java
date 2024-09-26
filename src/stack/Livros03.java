package stack;

public class Livros03 {

	private String nome;
	private String isbn;
	private String ano;
	private String autor;

	Livros03() {

	}

	Livros03(String nome, String isbn, String ano, String autor) {
		this.nome = nome;
		this.isbn = isbn;
		this.ano = ano;
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "[" + nome + ", " + isbn + ", " + ano + ", " + autor + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getLancamento() {
		return autor;
	}

	public void setLancamento(String autor) {
		this.autor = autor;
	}

}
