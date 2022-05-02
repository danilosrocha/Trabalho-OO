package Menu;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;
import CadastroLocatarios.GerenciarLocatario;
import CadastroLocatarios.Locatario;
import CadastroLocatarios.PessoaFisica;
import CadastroLocatarios.PessoaJuridica;
import GerenciamentoFrota.GerenciarFrota;
import GerenciamentoFrota.Veiculo;
import GerenciamentoReservas.GerenciarReserva;

public class MenuPrincipal {
	static GerenciarLocatario gCadastro = new GerenciarLocatario();
	static GerenciarFrota gCadastroFrota = new GerenciarFrota();
	static GerenciarReserva gCadastroReserva = new GerenciarReserva();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int identificadorReserva = 1;
		
		String entrada;		
		do {
			entrada = JOptionPane.showInputDialog("Menu Principal" + "\n" + 
										"A) Gerenciar Locatarios" + "\n" +
										"B) Gerenciar Frota" + "\n" + 
										"C) Gerenciar Reservas" + "\n" + 
										"D) Sair do Programa");
			
			entrada = entrada.toUpperCase();
		
			switch(entrada) {
				case "A":
					String entrada_A = JOptionPane.showInputDialog("Menu Gerencia de locatarios:" + "\n" + 
													"A) Cadastrar locatario" + "\n" +
													"B) Pesquisar locatario" + "\n" + 
													"C) Alterar dados do locatario" + "\n" + 
													"D) Excluir locatario");
					
					entrada_A = entrada_A.toUpperCase();
					
					switch(entrada_A) {
						case "A":
							String entrada_AA = JOptionPane.showInputDialog("A) Pessoa fisica:" + "\n" +
																	"B) Pessoa juridica:");
							entrada_AA = entrada_AA.toUpperCase();
							switch(entrada_AA) {
								case "A":
									gCadastro.cadastrarPessoaFisica();
									break;
								case "B":
									gCadastro.cadastrarPessoaJuridica();
									break;	
								
							}
							break;
						case "B":
							gCadastro.pesquisar();
							break;
						case "C":
							gCadastro.alterar();
							break;
						case "D":
							gCadastro.excluir();
							break;
					}		
					break;
					
				case "B":
					String entrada_B = JOptionPane.showInputDialog("Menu Gerencia de Frotas:" + "\n" + 
							"A) Cadastrar veiculos" + "\n" +
							"B) Pesquisar veiculo" + "\n" + 
							"C) Alterar dados de um veiculo" + "\n" + 
							"D) Remover veiculo da frota");
	
					entrada_B = entrada_B.toUpperCase();
					
					switch(entrada_B) {
						case "A":
							String entrada_BA = JOptionPane.showInputDialog("Menu de Cadastro de Veiculos: " + "\n" + 
									"A) Cadastrar veiculo de passeio" + "\n" +
									"B) Cadastrar veiculo utilitario" + "\n" + 
									"C) Cadastrar motocicleta");
							entrada_BA = entrada_BA.toUpperCase();
							
							switch(entrada_BA) {
								case "A":
									gCadastroFrota.cadastrarVeiculoPasseio();
									break;
								case "B":
									Object[] confirmarTipoUtilitario = { "Veiculo de passageiros", "Veiculo de Carga" };
									int input = JOptionPane.showOptionDialog(null, "Qual o tipo do utilitario?", "Confirmacao do tipo de utilitario",
											JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
											null, confirmarTipoUtilitario, confirmarTipoUtilitario[0] );
									if (input == 0) {
										gCadastroFrota.cadastrarVeiculoPassageiro();
									}
									else if (input == 1) {
										gCadastroFrota.cadastrarVeiculoCarga();
									}
									break;
								case "C":
									gCadastroFrota.cadastrarMotocicleta();
									break;
							}
							break;
						case "B":
							gCadastroFrota.pesquisar();
							break;
							/*String entrada_BB = JOptionPane.showInputDialog("Menu de Pesquisa de Veiculos: " + "\n" + 
							"A) Pesquisar ve�culo pelo Renavam" + "\n" +
							"B) Pesquisar ve�culo por marca, modelo ou renavam");
							
					entrada_BB = entrada_BB.toUpperCase();
					*/
							/*switch(entrada_BB) {
								case "A":
									JOptionPane.showMessageDialog(null, "Pesquisa pelo Renavam realizada com sucesso!");
									break;
								case "B":
									JOptionPane.showMessageDialog(null, "Pesquisa pela marca realizada com sucesso!");
									break;
							}*/
						case "C":
							gCadastroFrota.alterar();
							break;
						case "D":
							gCadastroFrota.excluir();
							break;
						default:
							break;
					}
					break;
					
					case "C":
						
						String entradaReservas = JOptionPane.showInputDialog("Menu Gerencia de Reservas:" + "\n" + 
								"A) Cadastrar nova reserva" + "\n" +
								"B) Visualizar reserva" + "\n" + 
								"C) Cancelar reserva");
							///D) Mostrar todas as reservas
						entradaReservas = entradaReservas.toUpperCase();
						switch(entradaReservas) {
						
					case "A":
						String termoPesq = "";
						Object [] confirmarReserva = {"Fisica", "Juridica"};
						int input = JOptionPane.showOptionDialog(null, "A reserva sera feita para pessoa fisica ou juridica?", "Confirmacao de Reserva",
								JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
								null, confirmarReserva, confirmarReserva[0] );
						if (input == 0) {
							termoPesq = JOptionPane.showInputDialog("Informe o Nome, CPF, ou Email da pessoa fisica: ");
							PessoaFisica locCliente = (PessoaFisica)gCadastro.pesquisarLocatario(termoPesq,2);
							
							String termoPesqVeiculo = JOptionPane.showInputDialog("Informe o RENAVAM do veiculo a ser locado:");
							Veiculo veiculo = gCadastroFrota.pesquisarVeiculo(termoPesqVeiculo, 2);
							gCadastroReserva.GerenciarReservasPf(identificadorReserva, locCliente, veiculo);
							identificadorReserva ++;
							
							
						}
						else if (input == 1) {
							termoPesq = JOptionPane.showInputDialog("Informe o Nome, CNPJ, ou Email da pessoa juridica: ");
							PessoaJuridica locResponsavel = (PessoaJuridica) gCadastro.pesquisarLocatario(termoPesq,2);
							locResponsavel.getFuncionario();
							String termoPesqPessoaF = JOptionPane.showInputDialog("Informe o Nome, CPF, ou Email da pessoa fisica a realizar a locacao: ");
							PessoaFisica locFuncionario = null;
							for (PessoaFisica buscaPf : locResponsavel.getFuncionario()){
					               //Pesquisa por email
					                if(buscaPf.getEmail().equalsIgnoreCase(termoPesqPessoaF)){
					                	locFuncionario = buscaPf;
					                    break;
					                }
					                if(buscaPf.getNomeCompleto().equalsIgnoreCase(termoPesqPessoaF)){
					                	locFuncionario = buscaPf;
					                    break;
					                }
					                if(buscaPf.getCpf_cnpj().equalsIgnoreCase(termoPesqPessoaF)){
					                	locFuncionario = buscaPf;
					                    break;
					                }
					            }
							///buscar veiculo
							String termoPesqVeiculo = JOptionPane.showInputDialog("Informe o RENAVAM do veiculo a ser locado:");
							Veiculo veiculo = gCadastroFrota.pesquisarVeiculo(termoPesqVeiculo, 2);
							gCadastroReserva.GerenciarReservasPj(identificadorReserva, locResponsavel, locFuncionario, veiculo);
							identificadorReserva ++;
						}
							break;
							
							case "B":
								gCadastroReserva.pesquisar();
								
								break;
								
							case "C":
								boolean deletado = false;
									deletado = gCadastroReserva.deletarReserva();
									if (deletado) {
										JOptionPane.showMessageDialog(null, "Reserva excluida com sucesso!");
									}
								
								break;
								
							default:
								break;
						
					}
						break;
					case "D":
						JOptionPane.showMessageDialog(null, "Obrigado por utilizar a plataforma");
						entrada = "D";
						break;
					default:
						JOptionPane.showMessageDialog(null, "Op��o inv�lida\nReinicie a Plataforma\n");
						break;
			}
		} while(entrada != "D");
	}
}
