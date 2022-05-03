package Excecoes;

import javax.swing.JOptionPane;

public class campoEmBrancoException extends Exception {
	
	public campoEmBrancoException() {
		
		JOptionPane.showMessageDialog(null, "Campo obrigatorio em branco!");
	}
	
}
