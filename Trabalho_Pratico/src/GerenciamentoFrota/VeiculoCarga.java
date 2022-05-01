package GerenciamentoFrota;

public class VeiculoCarga extends VeiculosUtilitarios{
	private String taraVeiculo;
	private CompartimentoCarga compartimentoCarga;
	
	public VeiculoCarga(String marca, String modelo, String anoFabricacao, String anoModelo, String numeroCadastro,
		float capacidadeTanque, String tipoUtilitario, String taraVeiculo, CompartimentoCarga compartimentoCarga,
		Valores valores) {
		super(marca, modelo, anoFabricacao, anoModelo, numeroCadastro, capacidadeTanque, tipoUtilitario,valores);
		this.taraVeiculo = taraVeiculo;
		this.compartimentoCarga = compartimentoCarga;
	}
	public String getTaraVeiculo() {
		return taraVeiculo;
	}
	public void setTaraVeiculo(String taraVeiculo) {
		this.taraVeiculo = taraVeiculo;
	}
	public CompartimentoCarga getCompartimentoCarga() {
		return compartimentoCarga;
	}
	public void setCompartimentoCarga(CompartimentoCarga compartimentoCarga) {
		this.compartimentoCarga = compartimentoCarga;
	}
	
	
}
