package GerenciamentoFrota;

public class VeiculoPasseio extends Veiculo {
	private String categoria;
	private String [] itensOpcionais;
	
	public VeiculoPasseio(String marca, String modelo, String anoFabricacao, String anoModelo, String numeroCadastro,
			float capacidadeTanque, String categoria, String itensOpcionais[],Valores valores) {
		super(marca, modelo, anoFabricacao, anoModelo, numeroCadastro, capacidadeTanque,valores, "Veiculo de passeio");
		this.categoria = categoria;
		this.itensOpcionais = itensOpcionais;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String[] getItensOpcionais() {
		return itensOpcionais;
	}
	public void setItensOpcionais(String[] itensOpcionais) {
		this.itensOpcionais = itensOpcionais;
	}
	
	
}
