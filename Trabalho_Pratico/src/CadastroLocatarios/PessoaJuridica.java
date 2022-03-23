package CadastroLocatarios;

public class PessoaJuridica extends Locatario{
	private String nomeSocial;
	private String cnpj;
	private PessoaFisica funcionario;
	
	public PessoaJuridica(String email, String celular, Endereco end, String nomeSocial, String cnpj,
			PessoaFisica funcionario) {
		super(email, celular, end);
		this.nomeSocial = nomeSocial;
		this.cnpj = cnpj;
		this.funcionario = funcionario;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaFisica getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(PessoaFisica funcionario) {
		this.funcionario = funcionario;
	}
	
}
