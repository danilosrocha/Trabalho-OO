package Menu;

import javax.swing.JOptionPane;

public class MenuPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String entrada;
		do {
			entrada = JOptionPane.showInputDialog("Menu Principal" + "\n" + 
										"A) Gerenciar Locatários" + "\n" +
										"B) Gerenciar Frota" + "\n" + 
										"C) Gerenciar Reservas" + "\n" + 
										"D) Sair do Programa");
			
			entrada = entrada.toUpperCase();
		
			switch(entrada) {
				case "A":
					String entrada_A = JOptionPane.showInputDialog("Menu Gerência de locatários:" + "\n" + 
													"A) Cadastrar locatário" + "\n" +
													"B) Pesquisar locatário" + "\n" + 
													"C) Alterar dados do locatário" + "\n" + 
													"D) Excluir locatário");
					
					entrada_A = entrada_A.toUpperCase();
					
					switch(entrada_A) {
						case "A":
							JOptionPane.showMessageDialog(null, "Locatário cadastrado com sucesso!");
							break;
						case "B":
							JOptionPane.showMessageDialog(null, "Locatário achado com sucesso!");
							break;
						case "C":
							JOptionPane.showMessageDialog(null, "Locatário alterado com sucesso!");
							break;
						case "D":
							JOptionPane.showMessageDialog(null, "Locatário excluido com sucesso!");
							break;
					}		
					break;
					
				case "B":
					String entrada_B = JOptionPane.showInputDialog("Menu Gerência de Frotas:" + "\n" + 
							"A) Cadastrar veículos" + "\n" +
							"B) Pesquisar veículo" + "\n" + 
							"C) Alterar dados de um veículo" + "\n" + 
							"D) Remover veículo da frota");
	
					entrada_B = entrada_B.toUpperCase();
					
					switch(entrada_B) {
						case "A":
							String entrada_BA = JOptionPane.showInputDialog("Menu de Cadastro de Veículos: " + "\n" + 
									"A) Cadastrar veiculo de passeio" + "\n" +
									"B) Cadastrar veículo utilitário" + "\n" + 
									"C) Cadastrar motocicleta");
							entrada_BA = entrada_BA.toUpperCase();
							
							switch(entrada_BA) {
								case "A":
									JOptionPane.showMessageDialog(null, "Veiculo de passeio cadastrado com sucesso!");
									break;
								case "B":
									JOptionPane.showMessageDialog(null, "Veiculo utilitário cadastrado com sucesso!");
									break;
								case "C":
									JOptionPane.showMessageDialog(null, "Motocicleta cadastrada com sucesso!");
									break;
							}
							break;
						case "B":
							String entrada_BB = JOptionPane.showInputDialog("Menu de Pesquisa de Veículos: " + "\n" + 
									"A) Pesquisar veículo pelo Renavam" + "\n" +
									"B) Pesquisar veículo por marca, modelo ou renavam");
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
					JOptionPane.showMessageDialog(null, "Opção inválida\nReinicie a Plataforma\n");
					break;
			}
		} while(entrada != "D");
	}
}
