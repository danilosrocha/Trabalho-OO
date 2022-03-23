package GerenciamentoFrota;

public class Motocicleta extends Veiculo {
	private String itensOpcionais;
	
	public Motocicleta(String marca, String modelo, String anoFabricacao, String numeroFabricacao,
			float capacidadeTanque, String itensOpcionais) {
		super(marca, modelo, anoFabricacao, numeroFabricacao, capacidadeTanque);
		this.itensOpcionais = itensOpcionais;
	}

	public String getItensOpcionais() {
		return itensOpcionais;
	}

	public void setItensOpcionais(String itensOpcionais) {
		this.itensOpcionais = itensOpcionais;
	}
	
	
}
