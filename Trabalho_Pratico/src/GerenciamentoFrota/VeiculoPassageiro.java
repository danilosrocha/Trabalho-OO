package GerenciamentoFrota;

public class VeiculoPassageiro extends VeiculosUtilitarios{
	private int quantidadeOcupantes;
	
	public VeiculoPassageiro(String marca, String modelo, String anoFabricacao, String numeroFabricacao,
			float capacidadeTanque, String tipoUtilitario, String itensOpcionais, int quantidadeOcupantes) {
		super(marca, modelo, anoFabricacao, numeroFabricacao, capacidadeTanque, tipoUtilitario, itensOpcionais);
		this.quantidadeOcupantes = quantidadeOcupantes;
	}

	public int getQuantidadeOcupantes() {
		return quantidadeOcupantes;
	}

	public void setQuantidadeOcupantes(int quantidadeOcupantes) {
		this.quantidadeOcupantes = quantidadeOcupantes;
	}
	
	
}
