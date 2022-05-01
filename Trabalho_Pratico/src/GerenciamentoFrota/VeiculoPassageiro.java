package GerenciamentoFrota;

public class VeiculoPassageiro extends VeiculosUtilitarios{
	private int quantidadeOcupantes;
	private String [] itensOpcionais;
	
	public VeiculoPassageiro(String marca, String modelo, String anoFabricacao, String anoModelo, String numeroCadastro,
			float capacidadeTanque, String tipoUtilitario, String itensOpcionais[], int quantidadeOcupantes,Valores valores) {
		super(marca, modelo, anoFabricacao, anoModelo, numeroCadastro, capacidadeTanque, tipoUtilitario,valores);
		this.quantidadeOcupantes = quantidadeOcupantes;
	}

	public int getQuantidadeOcupantes() {
		return quantidadeOcupantes;
	}

	public void setQuantidadeOcupantes(int quantidadeOcupantes) {
		this.quantidadeOcupantes = quantidadeOcupantes;
	}
	
	
}
