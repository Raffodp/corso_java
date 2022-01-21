package model;

public class Contatto {

	//contatore statico: appartiene alla classe non all'oggetto
	private static int counter = 1;
	
	private int id;
	private String nome;
	private String numero;
	
	// alt+shift+S per source>
	public Contatto(String nome, String numero) {
		this.id = counter++; // come se fosse Contatto.counter
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		
		return "Contatto [id=" + id + ", nome=" + nome + ", numero=" + numero + "]";
	}
	
	
}
