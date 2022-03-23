package CadastroDeLocatarios;

public class PessoaFisica extends Locatario{
	private String nomeCompleto;
	private String cpf;
	private String estadoCivil;
	
	public PessoaFisica(String email, String celular, Endereco end, String nomeCompleto, String cpf,
			String estadoCivil) {
		super(email, celular, end);
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
	}
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public void cadastrar() {
		
	}
	
	public void buscar() {
		
	}
	
	public void atualizar() {
		
	}
	
	public void excluir() {
		
	}
}
