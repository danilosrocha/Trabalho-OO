package GerenciamentoFrota;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GerenciarFrota {
	private List <Veiculo> Veiculo;
	
	public GerenciarFrota(){
        this.Veiculo = new LinkedList<Veiculo>();
    }
	public VeiculosUtilitarios cadastrarVeiculoCarga() {
		boolean valida = false;
		/// Dados iniciais
		String marca = JOptionPane.showInputDialog("Informe a marca do veiculo: ");
		String modelo = JOptionPane.showInputDialog("Informe o modelo do veiculo: ");
		String anoFabricacao = JOptionPane.showInputDialog("Informe o ano de fabricacao do veiculo: ");
		String anoModelo = JOptionPane.showInputDialog("Informe o ano do modelo do veiculo: ");
		String renavam = JOptionPane.showInputDialog("Informe o RENAVAM do veiculo: ");
		String strcapacidadeTanque = JOptionPane.showInputDialog("Insira a capacidade do tanque (apenas valor numerico): ");
		float capacidadeTanque = Float.parseFloat(strcapacidadeTanque);
		String tipoUtilitario = "Veiculo de Carga";
		String taraVeiculo = JOptionPane.showInputDialog("Informe o valor da tara do veiculo: ");
		///
		///Compartimento de carga
		String tipoCompartimento = "";
		Object[] confirmarTipoCarga = { "Bau", "Graneleiro", "Basculante" };
		int input = JOptionPane.showOptionDialog(null, "Qual o tipo de compartimento da carga?", "Compartimento da Carga",
				JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,
				null, confirmarTipoCarga, confirmarTipoCarga[0] );
		if (input == 0 ) {
			tipoCompartimento = "Bau";
		}
		else if (input == 1) {
			tipoCompartimento = "Graneleiro";
		}
		else if (input == 2) {
			tipoCompartimento = "Basculante";
		}
		///Se usuário clicar no X vai retornar -1. Isso deve resultar em exception (provavelmente)
		
		String strvolumeCompartimento = JOptionPane.showInputDialog("Qual o volume do compartimento?");
		float volumeCompartimento = Float.parseFloat(strvolumeCompartimento);
		CompartimentoCarga createCompartimentoCarga = new CompartimentoCarga(tipoCompartimento, volumeCompartimento);
		///
		///Valores
		String strdiariaNormal = JOptionPane.showInputDialog("Informe o valor comum da diaria para o veiculo: ");
		float diariaNormal = Float.parseFloat(strdiariaNormal);
		float diariaReduzida = diariaNormal - (diariaNormal*10/100);
		String strdiariaEmpresarial = JOptionPane.showInputDialog("Informe o valor da diaria empresarial para o veiculo: ");
		float diariaEmpresarial = Float.parseFloat(strdiariaEmpresarial);
		String strvalorMensal = JOptionPane.showInputDialog("Informe o valor mensal para reserva do veiculo: ");
		float valorMensal = Float.parseFloat(strvalorMensal);
		Valores custosVeiculo = new Valores(diariaNormal,diariaReduzida,diariaEmpresarial,valorMensal);
		///
		///Criação final
		VeiculoCarga veiculoDeCarga = new VeiculoCarga (marca, modelo, anoFabricacao, anoModelo, renavam, capacidadeTanque, tipoUtilitario,
														taraVeiculo, createCompartimentoCarga, custosVeiculo);
		valida = Veiculo.add(veiculoDeCarga);
		JOptionPane.showMessageDialog(null, "Veiculo cadastrado com sucesso!");
		return veiculoDeCarga;
	}
	
	public VeiculosUtilitarios cadastrarVeiculoPassageiro() {
		boolean valida = false;
		/// Dados iniciais
				String marca = JOptionPane.showInputDialog("Informe a marca do veiculo: ");
				String modelo = JOptionPane.showInputDialog("Informe o modelo do veiculo: ");
				String anoFabricacao = JOptionPane.showInputDialog("Informe o ano de fabricacao do veiculo: ");
				String anoModelo = JOptionPane.showInputDialog("Informe o ano do modelo do veiculo: ");
				String renavam = JOptionPane.showInputDialog("Informe o RENAVAM do veiculo: ");
				String strcapacidadeTanque = JOptionPane.showInputDialog("Insira a capacidade do tanque (apenas valor numerico): ");
				float capacidadeTanque = Float.parseFloat(strcapacidadeTanque);
				String tipoUtilitario = "Veiculo de passageiros";
				///
				///Verificar adicionais
				Object[] confirmaritensOpcionais = { "Sim", "Nao" };
				String [] itensOpcionais = {"","",""};
				int input = JOptionPane.showOptionDialog(null, "O veiculo possui ar-condicionado?", "Confirmacao de itens opcionais",
						JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
						null, confirmaritensOpcionais, confirmaritensOpcionais[0] );
				if (input == 0 ) {
					itensOpcionais[0] = "Ar-condicionado";
				}
				else if (input == 1) {
					itensOpcionais[0] = null;
				}
				
				
				input = JOptionPane.showOptionDialog(null, "O veiculo possui direcao hidraulica?", "Confirmacao de itens opcionais",
						JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
						null, confirmaritensOpcionais, confirmaritensOpcionais[0] );
				if (input == 0 ) {
					itensOpcionais[1] = "Direcao Hidraulica";
				}
				else if (input == 1) {
					itensOpcionais[1] = null;
				}
				
				
				input = JOptionPane.showOptionDialog(null, "O veiculo possui tv a bordo?", "Confirmacao de itens opcionais",
						JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
						null, confirmaritensOpcionais, confirmaritensOpcionais[0] );
				if (input == 0 ) {
					itensOpcionais[2] = "Tv a bordo";
				}
				else if (input == 1) {
					itensOpcionais[2] = null;
				}
				///
				///
				String strquantidadeDeOcupantes = JOptionPane.showInputDialog("Informe o valor de ocupantes que o veiculo pode transportar: ");
				int quantidadeDeOcupantes = Integer.parseInt(strquantidadeDeOcupantes);
				///
				///Valores
				String strdiariaNormal = JOptionPane.showInputDialog("Informe o valor comum da diaria para o veiculo: ");
				float diariaNormal = Float.parseFloat(strdiariaNormal);
				float diariaReduzida = diariaNormal - (diariaNormal*10/100);
				String strdiariaEmpresarial = JOptionPane.showInputDialog("Informe o valor da diaria empresarial para o veiculo: ");
				float diariaEmpresarial = Float.parseFloat(strdiariaEmpresarial);
				String strvalorMensal = JOptionPane.showInputDialog("Informe o valor mensal para reserva do veiculo: ");
				float valorMensal = Float.parseFloat(strvalorMensal);
				Valores custosVeiculo = new Valores(diariaNormal,diariaReduzida,diariaEmpresarial,valorMensal);
				///
				VeiculoPassageiro veiculoDePassageiros = new VeiculoPassageiro (marca, modelo, anoFabricacao, anoModelo, renavam, capacidadeTanque,
																				tipoUtilitario, itensOpcionais, quantidadeDeOcupantes, custosVeiculo);
				valida = Veiculo.add(veiculoDePassageiros);
				JOptionPane.showMessageDialog(null, "Veiculo cadastrado com sucesso!");
				return veiculoDePassageiros;
				
	}

	public VeiculoPasseio cadastrarVeiculoPasseio() {
		boolean valida = false;
		String marca = JOptionPane.showInputDialog("Informe a marca do veiculo: ");
		String modelo = JOptionPane.showInputDialog("Informe o modelo do veiculo: ");
		String anoFabricacao = JOptionPane.showInputDialog("Informe o ano de fabricacao do veiculo: ");
		String anoModelo = JOptionPane.showInputDialog("Informe o ano do modelo do veiculo: ");
		String renavam = JOptionPane.showInputDialog("Informe o RENAVAM do veiculo: ");
		String strcapacidadeTanque = JOptionPane.showInputDialog("Insira a capacidade do tanque (apenas valor numerico): ");
		float capacidadeTanque = Float.parseFloat(strcapacidadeTanque);
		///
		///Verificação da categoria
		String categoria = "";
		Object[] confirmarCategoria = { "Sim, comum", "Sim, de luxo", "Nao" };
		Object[] confirmarCategoriaExtra = { "Sedan", "SUV" };
		int input = JOptionPane.showOptionDialog(null, "O veiculo e compacto?", "Categoria do veiculo",
				JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,
				null, confirmarCategoria, confirmarCategoria[0] );
		if (input == 0 ) {
			categoria = "Compacto";
		}
		else if (input == 1) {
			categoria = "Compacto de luxo";
		}
		else if (input == 2) {
			input = JOptionPane.showOptionDialog(null, "O veiculo e um Sedan ou SUV?", "Categoria do veiculo",
					JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
					null, confirmarCategoriaExtra, confirmarCategoriaExtra[0] );
			if (input == 0) {
				categoria = "Sedan";
			}
			else if (input == 1) {
				categoria = "SUV";
			}
		}
		///
		///Verificação de itens opcionais
		Object[] confirmaritensOpcionais = { "Sim", "Nao" };
		String [] itensOpcionais = {"","",""};
		input = JOptionPane.showOptionDialog(null, "O veiculo possui ar-condicionado?", "Confirmacao de itens opcionais",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
				null, confirmaritensOpcionais, confirmaritensOpcionais[0] );
		if (input == 0 ) {
			itensOpcionais[0] = "Ar-condicionado";
		}
		else if (input == 1) {
			itensOpcionais[0] = null;
		}
		
		
		input = JOptionPane.showOptionDialog(null, "O veiculo possui direcao hidraulica?", "Confirmacao de itens opcionais",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
				null, confirmaritensOpcionais, confirmaritensOpcionais[0] );
		if (input == 0 ) {
			itensOpcionais[1] = "Direcao Hidraulica";
		}
		else if (input == 1) {
			itensOpcionais[1] = null;
		}
		
		
		input = JOptionPane.showOptionDialog(null, "O veiculo possui cambio automatico?", "Confirmacao de itens opcionais",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
				null, confirmaritensOpcionais, confirmaritensOpcionais[0] );
		if (input == 0 ) {
			itensOpcionais[2] = "Cambio automatico";
		}
		else if (input == 1) {
			itensOpcionais[2] = null;
		}
		///
		///Valores
		String strdiariaNormal = JOptionPane.showInputDialog("Informe o valor comum da diaria para o veiculo: ");
		float diariaNormal = Float.parseFloat(strdiariaNormal);
		float diariaReduzida = diariaNormal - (diariaNormal*10/100);
		String strdiariaEmpresarial = JOptionPane.showInputDialog("Informe o valor da diaria empresarial para o veiculo: ");
		float diariaEmpresarial = Float.parseFloat(strdiariaEmpresarial);
		String strvalorMensal = JOptionPane.showInputDialog("Informe o valor mensal para reserva do veiculo: ");
		float valorMensal = Float.parseFloat(strvalorMensal);
		Valores custosVeiculo = new Valores(diariaNormal,diariaReduzida,diariaEmpresarial,valorMensal);
		///
		VeiculoPasseio veiculoDePasseio = new VeiculoPasseio (marca, modelo, anoFabricacao, anoModelo, renavam, capacidadeTanque, categoria,
				itensOpcionais, custosVeiculo);
		valida = Veiculo.add(veiculoDePasseio);
		JOptionPane.showMessageDialog(null, "Veiculo cadastrado com sucesso!");
		return veiculoDePasseio;
	}

	public Motocicleta cadastrarMotocicleta() {
		boolean valida = false;
		String marca = JOptionPane.showInputDialog("Informe a marca da motocicleta: ");
		String modelo = JOptionPane.showInputDialog("Informe o modelo da motocicleta: ");
		String anoFabricacao = JOptionPane.showInputDialog("Informe o ano de fabricacao da motocicleta: ");
		String anoModelo = JOptionPane.showInputDialog("Informe o ano do modelo da motocicleta: ");
		String renavam = JOptionPane.showInputDialog("Informe o RENAVAM da motocicleta: ");
		String strcapacidadeTanque = JOptionPane.showInputDialog("Insira a capacidade do tanque (apenas valor numerico): ");
		float capacidadeTanque = Float.parseFloat(strcapacidadeTanque);
		///
		///Verificação de itens opcionais
		Object[] confirmaritensOpcionais = { "Sim", "Nao" };
		String [] itensOpcionais = {"","","",""};
		int input = JOptionPane.showOptionDialog(null, "O veiculo possui controle de tracao?", "Confirmacao de itens opcionais",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
				null, confirmaritensOpcionais, confirmaritensOpcionais[0] );
		if (input == 0 ) {
			itensOpcionais[0] = "Controle de tracao";
		}
		else if (input == 1) {
			itensOpcionais[0] = null;
		}
		
		
		input = JOptionPane.showOptionDialog(null, "O veiculo possui freios ABS?", "Confirmacao de itens opcionais",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
				null, confirmaritensOpcionais, confirmaritensOpcionais[0] );
		if (input == 0 ) {
			itensOpcionais[1] = "Freios ABS";
		}
		else if (input == 1) {
			itensOpcionais[1] = null;
		}
		
		
		input = JOptionPane.showOptionDialog(null, "O veiculo possui piloto automatico?", "Confirmacao de itens opcionais",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
				null, confirmaritensOpcionais, confirmaritensOpcionais[0] );
		if (input == 0 ) {
			itensOpcionais[2] = "Piloto automatico";
		}
		else if (input == 1) {
			itensOpcionais[2] = null;
		}
		
		
		input = JOptionPane.showOptionDialog(null, "O veiculo possui modos distintos de pilotagem (Cidade, Estrada, Sport e Off-Road)?", "Confirmacao de itens opcionais",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
				null, confirmaritensOpcionais, confirmaritensOpcionais[0] );
		if (input == 0 ) {
			itensOpcionais[3] = "Modos de pilotagem";
		}
		else if (input == 1) {
			itensOpcionais[3] = null;
		}
		///
		///Valores
		String strdiariaNormal = JOptionPane.showInputDialog("Informe o valor comum da diaria para o veiculo: ");
		float diariaNormal = Float.parseFloat(strdiariaNormal);
		float diariaReduzida = diariaNormal - (diariaNormal*10/100);
		String strdiariaEmpresarial = JOptionPane.showInputDialog("Informe o valor da diaria empresarial para o veiculo: ");
		float diariaEmpresarial = Float.parseFloat(strdiariaEmpresarial);
		String strvalorMensal = JOptionPane.showInputDialog("Informe o valor mensal para reserva do veiculo: ");
		float valorMensal = Float.parseFloat(strvalorMensal);
		Valores custosVeiculo = new Valores(diariaNormal,diariaReduzida,diariaEmpresarial,valorMensal);
		///
		/*
		 * String marca, String modelo, String anoFabricacao, String numeroCadastro,
			float capacidadeTanque, String itensOpcionais,Valores valores
		 */
		Motocicleta Moto = new Motocicleta (marca, modelo, anoFabricacao, anoModelo, renavam, capacidadeTanque,
											itensOpcionais, custosVeiculo);
		valida = Veiculo.add(Moto);
		JOptionPane.showMessageDialog(null, "Veiculo cadastrado com sucesso!");
		return Moto;
	}
	
	public boolean pesquisar() {
		String entrada = JOptionPane.showInputDialog("Informe o RENAVAM do veiculo que deseja pesquisar: ");
			Veiculo resposta = pesquisarVeiculo(entrada, 1);
			if (resposta != null) {
				JOptionPane.showMessageDialog(null, "Marca: " +  resposta.getMarca() + "\n" +
											"Modelo: " + resposta.getModelo() + "\n" + 
											"Ano de Fabricacao: " + resposta.getAnoFabricacao() + "\n" +
											"Ano de Modelo: " + resposta.getAnoModelo() + "\n" +
											"RENAVAM: " + resposta.getNumeroCadastro());
			}
		
		return true;
	}
	
	public boolean alterar() {
		String pesqCadastro = JOptionPane.showInputDialog("Informe o RENAVAM do veiculo que deseja pesquisar: ");
		boolean validar = false;
		String entrada = JOptionPane.showInputDialog("Informe o que deseja alterar: " + "\n" + 
				"A) Marca" + "\n" +
				"B) Modelo" + "\n" +
				"C) Ano de Fabricacao" + "\n" +
				"D) Ano do Modelo" + "\n" +
				"E) RENAVAM" + "\n" +
				"F) Capacidade do tanque" + "\n" +
				"G) Custos de reserva");
		entrada = entrada.toUpperCase();
		switch (entrada) {
		case "A":
			String modMarca = JOptionPane.showInputDialog("Mudar " + pesquisarVeiculo(pesqCadastro, 2).getMarca() + " para: ");
			pesquisarVeiculo(pesqCadastro, 2).setMarca(modMarca);
			break;
			
		case "B":
			String modModelo = JOptionPane.showInputDialog("Mudar " + pesquisarVeiculo(pesqCadastro, 2).getModelo() + " para: ");
			pesquisarVeiculo(pesqCadastro, 2).setModelo(modModelo);
			break;
			
		case "C":
			String modAnoFabricacao = JOptionPane.showInputDialog("Mudar " + pesquisarVeiculo(pesqCadastro, 2).getAnoFabricacao() + " para: ");
			pesquisarVeiculo(pesqCadastro, 2).setAnoFabricacao(modAnoFabricacao);
			break;
			
		case "D":
			String modAnoModelo = JOptionPane.showInputDialog("Mudar " + pesquisarVeiculo(pesqCadastro, 2).getAnoModelo() + " para: ");
			pesquisarVeiculo(pesqCadastro, 2).setAnoModelo(modAnoModelo);
			break;
		case "E":
			String modCadastro = JOptionPane.showInputDialog("Mudar " + pesquisarVeiculo(pesqCadastro, 2).getNumeroCadastro() + " para: ");
			pesquisarVeiculo(pesqCadastro, 2).setNumeroCadastro(modCadastro);
			break;
		case "F":
			String strmodCapacidadeTanque = JOptionPane.showInputDialog("Mudar " + pesquisarVeiculo(pesqCadastro, 2).getCapacidadeTanque() + " para: ");
			float modCapacidadeTanque = Float.parseFloat(strmodCapacidadeTanque);
			pesquisarVeiculo(pesqCadastro, 2).setCapacidadeTanque(modCapacidadeTanque);
			break;
		case "G":
			String entrada2 = JOptionPane.showInputDialog("Qual valor de reserva deseja modificar?" + "\n" +
													"A) Diaria normal" + "\n" +
													"B) Diaria empresarial" + "\n" +
													"C) Valor mensal" + "\n" +
													"D) Todos os valores");
					
			entrada2 = entrada2.toUpperCase();
					switch (entrada2) {
					
					case "A":
						String diariaComumTemp = JOptionPane.showInputDialog("Mudar de R$" + pesquisarVeiculo(pesqCadastro, 2).getValores().getDiariaNormal() + " para: ");
						float diariaComumNova = Float.parseFloat(diariaComumTemp);
						pesquisarVeiculo(pesqCadastro, 2).getValores().setDiariaNormal(diariaComumNova);
						pesquisarVeiculo(pesqCadastro, 2).getValores().setDiariaReduzida(diariaComumNova-(diariaComumNova*10/100));
						break;
					case "B":
						String diariaEmpresarialTemp = JOptionPane.showInputDialog("Mudar de R$" + pesquisarVeiculo(pesqCadastro, 2).getValores().getDiariaEmpresarial() + " para: ");
						float diariaEmpresarialNova = Float.parseFloat(diariaEmpresarialTemp);
						pesquisarVeiculo(pesqCadastro, 2).getValores().setDiariaEmpresarial(diariaEmpresarialNova);
						break;
					case "C":
						String valorMensalTemp = JOptionPane.showInputDialog("Mudar de R$" + pesquisarVeiculo(pesqCadastro, 2).getValores().getValorMensal() + " para: ");
						float valorMensalNovo = Float.parseFloat(valorMensalTemp);
						pesquisarVeiculo(pesqCadastro, 2).getValores().setValorMensal(valorMensalNovo);
						break;
					case "D":
						String diariaComum = JOptionPane.showInputDialog("Informe o valor comum da diaria para o veiculo: ");
						float numDiariaComum = Float.parseFloat(diariaComum);
						pesquisarVeiculo(pesqCadastro, 2).getValores().setDiariaNormal(numDiariaComum);
						pesquisarVeiculo(pesqCadastro, 2).getValores().setDiariaReduzida(numDiariaComum-(numDiariaComum*10/100));
						String diariaEmpresarial = JOptionPane.showInputDialog("Informe o valor da diaria empresarial para o veiculo: ");
						float numDiariaEmpresarial = Float.parseFloat(diariaEmpresarial);
						pesquisarVeiculo(pesqCadastro, 2).getValores().setDiariaEmpresarial(numDiariaEmpresarial);
						String valorMensal = JOptionPane.showInputDialog("Informe o valor mensal para reserva do veiculo: ");
						float numValorMensal = Float.parseFloat(valorMensal);
						pesquisarVeiculo(pesqCadastro, 2).getValores().setValorMensal(numValorMensal);
						break;
					default:
						break;
					}
			break;
		default:
			break;
		}
		return validar;
	}
	
	public boolean excluir() {
		String pesqDelete = JOptionPane.showInputDialog("Informe o RENAVAM do veículo:");
		boolean validar = false;
		for(Veiculo pesqVeiculo : Veiculo) {
			if(pesqVeiculo == pesquisarVeiculo(pesqDelete, 2)) {
				validar = Veiculo.remove(pesqVeiculo);
				JOptionPane.showMessageDialog(null, "Veiculo excluido com sucesso!");
			} else {
				JOptionPane.showMessageDialog(null, "Veiculo nao encontrado!");
			}
		}
		
		return validar;
	}
	
	public Veiculo pesquisarVeiculo(String pesquisa, int controle){
        boolean validar = false;
        Veiculo resposta = null; 
           for (Veiculo veiculoPesquisado : Veiculo){
               //Pesquisa por nome
                if(veiculoPesquisado.getNumeroCadastro().equalsIgnoreCase(pesquisa)){
                    resposta = veiculoPesquisado;
                    validar = true;
                    break;
                }
           }
              
       if (controle == 1) {
    	   if(resposta != null){
        	   validar = false;
        	   JOptionPane.showMessageDialog(null, "Veiculo encontrado!");
           }else{
        	   JOptionPane.showMessageDialog(null, "Veiculo nao encontrado!");
           }  
       }
       
       return resposta;
    }
}
