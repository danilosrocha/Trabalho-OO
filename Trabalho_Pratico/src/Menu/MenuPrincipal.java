package Menu;

import javax.swing.JOptionPane;
import CadastroLocatarios.GerenciarLocatario;
import CadastroLocatarios.Locatario;

public class MenuPrincipal {
	static GerenciarLocatario gCadastro = new GerenciarLocatario();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String entrada;
		do {
			entrada = JOptionPane.showInputDialog("Menu Principal" + "\n" + 
										"A) Gerenciar Locat�rios" + "\n" +
										"B) Gerenciar Frota" + "\n" + 
										"C) Gerenciar Reservas" + "\n" + 
										"D) Sair do Programa");
			
			entrada = entrada.toUpperCase();
		
			switch(entrada) {
				case "A":
					String entrada_A = JOptionPane.showInputDialog("Menu Ger�ncia de locat�rios:" + "\n" + 
													"A) Cadastrar locat�rio" + "\n" +
													"B) Pesquisar locat�rio" + "\n" + 
													"C) Alterar dados do locat�rio" + "\n" + 
													"D) Excluir locat�rio");
					
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
					String entrada_B = JOptionPane.showInputDialog("Menu Ger�ncia de Frotas:" + "\n" + 
							"A) Cadastrar ve�culos" + "\n" +
							"B) Pesquisar ve�culo" + "\n" + 
							"C) Alterar dados de um ve�culo" + "\n" + 
							"D) Remover ve�culo da frota");
	
					entrada_B = entrada_B.toUpperCase();
					
					switch(entrada_B) {
						case "A":
							String entrada_BA = JOptionPane.showInputDialog("Menu de Cadastro de Ve�culos: " + "\n" + 
									"A) Cadastrar veiculo de passeio" + "\n" +
									"B) Cadastrar ve�culo utilit�rio" + "\n" + 
									"C) Cadastrar motocicleta");
							entrada_BA = entrada_BA.toUpperCase();
							
							switch(entrada_BA) {
								case "A":
									JOptionPane.showMessageDialog(null, "Veiculo de passeio cadastrado com sucesso!");
									break;
								case "B":
									JOptionPane.showMessageDialog(null, "Veiculo utilit�rio cadastrado com sucesso!");
									break;
								case "C":
									JOptionPane.showMessageDialog(null, "Motocicleta cadastrada com sucesso!");
									break;
							}
							break;
						case "B":
							String entrada_BB = JOptionPane.showInputDialog("Menu de Pesquisa de Ve�culos: " + "\n" + 
									"A) Pesquisar ve�culo pelo Renavam" + "\n" +
									"B) Pesquisar ve�culo por marca, modelo ou renavam");
							entrada_BB = entrada_BB.toUpperCase();
							
							switch(entrada_BB) {
								case "A":
									JOptionPane.showMessageDialog(null, "Pesquisa pelo Renavam realizada com sucesso!");
									break;
								case "B":
									JOptionPane.showMessageDialog(null, "Pesquisa pela marca realizada com sucesso!");
									break;
							}		
							break;
					}
					break;
					
				case "C":
					JOptionPane.showMessageDialog(null, "Gerenciar Reserva");
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
