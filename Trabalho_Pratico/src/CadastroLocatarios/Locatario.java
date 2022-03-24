package CadastroLocatarios;

public class Locatario {
	private String email;
	private String celular;
	private Endereco endereco;
	
	public Locatario(String email, String celular, Endereco endereco) {
		this.email = email;
		this.celular = celular;
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void cadastrar() {
		
	}
	
	public boolean pesquisar() {
		return true;
	}
	
	public void alterar() {
		
	}
	
	public void excluir() {
		
	}
}
