package GerenciamentoFrota;

public class VeiculosUtilitarios extends Veiculo{
	private String tipoUtilitario;
	private String itensOpcionais;
	
	public VeiculosUtilitarios(String marca, String modelo, String anoFabricacao, String numeroFabricacao,
			float capacidadeTanque, String tipoUtilitario, String itensOpcionais) {
		super(marca, modelo, anoFabricacao, numeroFabricacao, capacidadeTanque);
		this.tipoUtilitario = tipoUtilitario;
		this.itensOpcionais = itensOpcionais;
	}
	public String getTipoUtilitario() {
		return tipoUtilitario;
	}
	public void setTipoUtilitario(String tipoUtilitario) {
		this.tipoUtilitario = tipoUtilitario;
	}
	public String getItensOpcionais() {
		return itensOpcionais;
	}
	public void setItensOpcionais(String itensOpcionais) {
		this.itensOpcionais = itensOpcionais;
	}
	
}
