package Menu;

import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Menu Principal:");
		System.out.println("A) Gerenciar Locat�rios");
		System.out.println("B) Gerenciar Frota");
		System.out.println("C) Gerenciar Reservas");
		System.out.println("D) Sair do Programa");
		String entrada = leitor.next();
		
		switch(entrada) {
			case "A":
				System.out.println("Menu Ger�ncia de Locat�rios:");
				System.out.println("A) Cadastrar Locat�rio");
				System.out.println("B) Buscar Locat�rio");
				System.out.println("C) Atualizar dados do locat�rio");
				System.out.println("D) Excluir locat�rio");
				break;
				
			case "B":
				System.out.println("Menu Ger�ncia de Frotas:");
				System.out.println("A) Cadastrar ve�culos");
				System.out.println("B) Pesquisar Ve�culo");
				System.out.println("C) Atualizar dados de um ve�culo");
				System.out.println("D) Remover ve�culo da frota");
				String entrada2 = leitor.next();
				switch(entrada2) {
					case "A":
						System.out.println("Menu de Cadastro de Ve�culos: ");
						System.out.println("A) Cadastrar veiculo de passeio");
						System.out.println("B) Cadastrar ve�culo utilit�rio");
						System.out.println("C) Cadastrar Motocicleta");
						break;
						
					case "B":
						System.out.println("Menu de Pesquisa de Ve�culos: ");
						System.out.println("A) Pesquisar ve�culo pelo Renavam");
						System.out.println("B) Pesquisar ve�culo por marca, modelo ou renavam");
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
