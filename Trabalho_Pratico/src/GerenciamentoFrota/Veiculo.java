package GerenciamentoFrota;

//import java.util.Scanner;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private String anoFabricacao;
	private String anoModelo;
	private String numeroCadastro;
	private float capacidadeTanque;
	private Valores valores;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String marca, String modelo, String anoFabricacao, String numeroCadastro, float capacidadeTanque, Valores valores) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.numeroCadastro = numeroCadastro;
		this.capacidadeTanque = capacidadeTanque;
		this.valores = valores;	
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getNumeroCadastro() {
		return numeroCadastro;
	}
	public void setNumeroCadastro(String numeroCadastro) {
		this.numeroCadastro = numeroCadastro;
	}
	public float getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(float capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public Valores getValores() {
		return valores;
	}

	public void setValores(Valores valores) {
		this.valores = valores;
	}

	public void cadastrar() {
		
	}
	
	public boolean pesquisar(String numeroCadastro) {
		return true;
	}
	
	public void alterar() {
		
	}
	
	public void apagar() {
		
	}
	
}
