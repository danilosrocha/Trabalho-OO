package CadastroLocatarios;

public class Locatario {
	private String email;
	private String celular;
	private Endereco end;
	
	public Locatario(String email, String celular, Endereco end) {
		this.email = email;
		this.celular = celular;
		this.end = end;
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

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}
}
