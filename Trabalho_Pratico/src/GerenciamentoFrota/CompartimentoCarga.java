package GerenciamentoFrota;

public class CompartimentoCarga {
	private String tipoCompartimento;
	private float volume;
	
	public CompartimentoCarga() {
		
	}
	
	public CompartimentoCarga(String tipoCompartimento, float volume) {
		super();
		this.tipoCompartimento = tipoCompartimento;
		this.volume = volume;
	}
	
	public String getTipoCompartimento() {
		return tipoCompartimento;
	}
	
	public void setTipoCompartimento(String tipoCompartimento) {
		this.tipoCompartimento = tipoCompartimento;
	}
	
	public float getVolume() {
		return volume;
	}
	
	public void setVolume(float volume) {
		this.volume = volume;
	}

}
