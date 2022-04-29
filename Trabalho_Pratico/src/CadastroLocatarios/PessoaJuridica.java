package CadastroLocatarios;

import java.util.List;

public class PessoaJuridica extends Locatario{
	private String cnpj;
	private List <PessoaFisica> funcionario;
	
	public PessoaJuridica(String email, String celular, Endereco endereco, String nomeCompleto, String cpf_cnpj, List funcionario) {
		super(email, celular, endereco, nomeCompleto, cpf_cnpj);
		this.funcionario = funcionario;
	}

	public List<PessoaFisica> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<PessoaFisica> funcionario) {
		this.funcionario = funcionario;
	}
	
}
