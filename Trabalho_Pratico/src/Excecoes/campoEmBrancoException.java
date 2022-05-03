package Excecoes;

import javax.swing.JOptionPane;

public class campoEmBrancoException extends Exception {
	
	public campoEmBrancoException() {
		super();
		JOptionPane.showMessageDialog(null, "Campo obrigatorio em branco!");
	}
	
}
