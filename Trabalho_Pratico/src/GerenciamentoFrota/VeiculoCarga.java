package GerenciamentoFrota;

public class VeiculoCarga extends VeiculosUtilitarios{
	private float capacidadeCarga;
	private String taraVeiculo;
	private String compartimentoCarga;
	
	public VeiculoCarga(String marca, String modelo, String anoFabricacao, String numeroFabricacao,
			float capacidadeTanque, String tipoUtilitario, String itensOpcionais, float capacidadeCarga,
			String taraVeiculo, String compartimentoCarga) {
		super(marca, modelo, anoFabricacao, numeroFabricacao, capacidadeTanque, tipoUtilitario, itensOpcionais);
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
	public String getCompartimentoCarga() {
		return compartimentoCarga;
	}
	public void setCompartimentoCarga(String compartimentoCarga) {
		this.compartimentoCarga = compartimentoCarga;
	}
	
	
}
