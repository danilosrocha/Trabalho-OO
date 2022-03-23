package Menu;

import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Menu Principal:");
		System.out.println("A) Gerenciar Locatários");
		System.out.println("B) Gerenciar Frota");
		System.out.println("C) Gerenciar Reservas");
		System.out.println("D) Sair do Programa");
		String entrada = leitor.next();
		
		switch(entrada) {
			case "A":
				System.out.println("Menu Gerência de Locatários:");
				System.out.println("A) Cadastrar Locatário");
				System.out.println("B) Buscar Locatário");
				System.out.println("C) Atualizar dados do locatário");
				System.out.println("D) Excluir locatário");
				break;
				
			case "B":
				System.out.println("Menu Gerência de Frotas:");
				System.out.println("A) Cadastrar veículos");
				System.out.println("B) Pesquisar Veículo");
				System.out.println("C) Atualizar dados de um veículo");
				System.out.println("D) Remover veículo da frota");
				String entrada2 = leitor.next();
				switch(entrada2) {
					case "A":
						System.out.println("Menu de Cadastro de Veículos: ");
						System.out.println("A) Cadastrar veiculo de passeio");
						System.out.println("B) Cadastrar veículo utilitário");
						System.out.println("C) Cadastrar Motocicleta");
						break;
						
					case "B":
						System.out.println("Menu de Pesquisa de Veículos: ");
						System.out.println("A) Pesquisar veículo pelo Renavam");
						System.out.println("B) Pesquisar veículo por marca, modelo ou renavam");
						break;
				}
				
			case "C":
				System.out.println("C) Gerenciar Reservas");
				break;
			case "D":
				System.out.println("D) Sair do Programa");
				break;
		}
	
	}

}
