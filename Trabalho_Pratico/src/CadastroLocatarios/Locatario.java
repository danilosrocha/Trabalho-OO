package CadastroLocatarios;

public class Locatario{
	private String email;
	private String celular;
	private Endereco endereco;
	private String nomeCompleto;
	private String cpf_cnpj;
	
	public Locatario(String email, String celular, Endereco endereco, String nomeCompleto, String cpf_cnpj) {
		this.email = email;
		this.celular = celular;
		this.endereco = endereco;
		this.nomeCompleto = nomeCompleto;
		this.cpf_cnpj = cpf_cnpj;
	}
	
	public Locatario() {
		
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

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	
}
