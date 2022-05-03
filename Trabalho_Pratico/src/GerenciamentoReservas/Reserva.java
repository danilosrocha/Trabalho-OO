package GerenciamentoReservas;

import GerenciamentoFrota.Veiculo;

/*
 * int identificador, String locResponsavel, String locCliente, Int tipoReserva(tipo de diária),
		float custo, Veiculo veiculo
 */


public class Reserva {
	private int identificador;
	private String locResponsavel;
	private String locCliente;
	private int tipoReserva;
	private float custo;
	private Veiculo veiculo;
	private String dataHoraInicio;
	private String dataHoraFim;
	private float custoInicial;
	private float seguroTerceiros;
	private float seguroVeiculo;
	private float seguroImposto;
	
	public Reserva(int identificador, String responsavel, String cliente, int tipoReserva,
			float Custo, Veiculo veiculo, String dataHoraInicio, String dataHoraFim, float custoInicial, float seguroTerceiros, float seguroVeiculo,
			float seguroImposto) {
		this.identificador = identificador;
		this.tipoReserva = tipoReserva;
		this.veiculo = veiculo;
		this.dataHoraFim = dataHoraFim;
		this.dataHoraInicio = dataHoraInicio;
		this.setCustoInicial(custoInicial);
		this.setSeguroTerceiros(seguroTerceiros);
		this.setSeguroVeiculo(seguroVeiculo);
		this.setSeguroImposto(seguroImposto);
		this.locResponsavel = responsavel;
		this.locCliente = cliente;
		
	}
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public int getTipoReserva() {
		return tipoReserva;
	}
	public void setTipoReserva(int tipoReserva) {
		this.tipoReserva = tipoReserva;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public String getLocCliente() {
		return locCliente;
	}
	public void setLocCliente(String locCliente) {
		this.locCliente = locCliente;
	}
	public String getLocResponsavel() {
		return locResponsavel;
	}
	public void setLocResponsavel(String locResponsavel) {
		this.locResponsavel = locResponsavel;
	}
	public float getCusto() {
		return custo;
	}
	public void setCusto(float custo) {
		this.custo = custo;
	}
	public String getDataHoraInicio() {
		return dataHoraInicio;
	}
	public void setDataHoraInicio(String dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}
	public String getDataHoraFim() {
		return dataHoraFim;
	}
	public void setDataHoraFim(String dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
	public float getCustoInicial() {
		return custoInicial;
	}
	public void setCustoInicial(float custoInicial) {
		this.custoInicial = custoInicial;
	}
	public float getSeguroTerceiros() {
		return seguroTerceiros;
	}
	public void setSeguroTerceiros(float seguroTerceiros) {
		this.seguroTerceiros = seguroTerceiros;
	}
	public float getSeguroVeiculo() {
		return seguroVeiculo;
	}
	public void setSeguroVeiculo(float seguroVeiculo) {
		this.seguroVeiculo = seguroVeiculo;
	}
	public float getSeguroImposto() {
		return seguroImposto;
	}
	public void setSeguroImposto(float seguroImposto) {
		this.seguroImposto = seguroImposto;
	}
}
