package GerenciamentoFrota;

public class VeiculosUtilitarios extends Veiculo{
	private String tipoUtilitario;
	
	public VeiculosUtilitarios(String marca, String modelo, String anoFabricacao, String anoModelo, String numeroCadastro,
		float capacidadeTanque, String tipoUtilitario,Valores valores) {
		super(marca, modelo, anoFabricacao, anoModelo, numeroCadastro, capacidadeTanque,valores, "Veiculo Utilitario");
		this.tipoUtilitario = tipoUtilitario;
	}
	public String getTipoUtilitario() {
		return tipoUtilitario;
	}
	public void setTipoUtilitario(String tipoUtilitario) {
		this.tipoUtilitario = tipoUtilitario;
	}
	
}
