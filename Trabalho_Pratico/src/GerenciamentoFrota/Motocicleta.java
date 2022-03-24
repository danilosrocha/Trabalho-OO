package GerenciamentoFrota;

public class Motocicleta extends Veiculo {
	private String itensOpcionais;
	
	public Motocicleta(String marca, String modelo, String anoFabricacao, String numeroCadastro,
			float capacidadeTanque, String itensOpcionais,Valores valores) {
		super(marca, modelo, anoFabricacao, numeroCadastro, capacidadeTanque,valores);
		this.itensOpcionais = itensOpcionais;
	}

	public String getItensOpcionais() {
		return itensOpcionais;
	}

	public void setItensOpcionais(String itensOpcionais) {
		this.itensOpcionais = itensOpcionais;
	}
	
	
}
