package GerenciamentoFrota;

public class VeiculoCarga extends VeiculosUtilitarios{
	private float capacidadeCarga;
	private String taraVeiculo;
	private CompartimentoCarga compartimentoCarga;
	
	public VeiculoCarga(String marca, String modelo, String anoFabricacao, String numeroFabricacao,
		float capacidadeTanque, String tipoUtilitario, String itensOpcionais, float capacidadeCarga,
			String taraVeiculo, CompartimentoCarga compartimentoCarga,Valores valores) {
		super(marca, modelo, anoFabricacao, numeroFabricacao, capacidadeTanque, tipoUtilitario, itensOpcionais,valores);
		this.capacidadeCarga = capacidadeCarga;
		this.taraVeiculo = taraVeiculo;
		this.compartimentoCarga = compartimentoCarga;
	}
	public float getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(float capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
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
