package CadastroLocatarios;

public class PessoaFisica extends Locatario{
	private String estadoCivil;
	
	public PessoaFisica(String email, String celular, Endereco endereco, String nomeCompleto, String cpf_cnpj, String estadoCivil) {
		super(email, celular, endereco, nomeCompleto, cpf_cnpj);
		this.estadoCivil = estadoCivil;
	}
	
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
}
