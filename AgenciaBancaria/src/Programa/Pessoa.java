package Programa;

public class Pessoa {
	
	private static int counter =1

	private String nome;
	private String CPF;
	private String email;
	
	
	public Pessoa(String nome, String cPF, String email) {
	
		this.nome = nome;
		CPF = cPF;
		this.email = email;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
