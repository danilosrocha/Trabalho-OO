package GerenciamentoReservas;

import CadastroLocatarios.Locatario;
import GerenciamentoFrota.Veiculo;

public class Reserva {
	private int identificador;
	private Locatario responsavel;
	private Locatario cliente;
	private String tipoReserva;
	private int diaria;
	private String horarioInicio;
	private String horarioFim;
	private float valor;
	private Veiculo veiculo;
	
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public Locatario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Locatario responsavel) {
		this.responsavel = responsavel;
	}
	public Locatario getCliente() {
		return cliente;
	}
	public void setCliente(Locatario cliente) {
		this.cliente = cliente;
	}
	public String getTipoReserva() {
		return tipoReserva;
	}
	public void setTipoReserva(String tipoReserva) {
		this.tipoReserva = tipoReserva;
	}
	public int getDiaria() {
		return diaria;
	}
	public void setDiaria(int diaria) {
		this.diaria = diaria;
	}
	public String getHorarioInicio() {
		return horarioInicio;
	}
	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	public String getHorarioFim() {
		return horarioFim;
	}
	public void setHorarioFim(String horarioFim) {
		this.horarioFim = horarioFim;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	public void cadastrar() {
		
	}
	public boolean pesquisar(int identificador) {
		return true;
	}
	public void alterar() {
		
	}
	public void apagar() {
		
	}
	public void gerarRelatorioIndividual() {
		
	}
	public void gerarRelatorioGeral() {
		
	}
	public void calcularValor(float valorDiaria) {
		
	}
}
