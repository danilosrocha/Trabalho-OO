package Excecoes;

import javax.swing.JOptionPane;

public class objetoNaoEncontradoException extends Exception {
		
		public objetoNaoEncontradoException() {
			
			JOptionPane.showMessageDialog(null, "Cadastro inexistente!");
		}
		
	}

