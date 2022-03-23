package GerenciamentoFrota;

public class VeiculoCarga extends VeiculosUtilitarios{
	private float capacidadeCarga;
	private String taraVeiculo;
	private String compartimentoCarga;
	
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
