package CadastroLocatarios;

import java.awt.HeadlessException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import Excecoes.campoEmBrancoException;
import Excecoes.objetoNaoEncontradoException;

public class GerenciarLocatario {
	private List <Locatario> locatario;
	
	public GerenciarLocatario(){
        this.locatario = new LinkedList<Locatario>();
    }
	
	public PessoaFisica cadastrarPessoaFisica() {
		boolean valida = false;
		String nomeCompleto = null;
		do {
			try {
					nomeCompleto = JOptionPane.showInputDialog("Insira o seu nome completo: ");
					valida = true;
					throw new campoEmBrancoException();
				}
			catch (campoEmBrancoException e) {
				valida = false;
				}
		   } while (valida);
		String cpf = null;
		do {
			try {
					cpf = JOptionPane.showInputDialog("Insira seu CPF: ");
					valida = true;
					throw new campoEmBrancoException();
				}
			catch (campoEmBrancoException e) {
				valida = false;
				}
		   } while (valida);
		String email = null;
		do {
			try {
					email = JOptionPane.showInputDialog("Insira seu email: ");
					valida = true;
					throw new campoEmBrancoException();
				}
			catch (campoEmBrancoException e) {
				valida = false;
				}
		   } while (valida);
		
		String celular = JOptionPane.showInputDialog("Insira seu telefone: ");
		String estadoCivil = JOptionPane.showInputDialog("Insira seu estado civil: ");
		String rua = JOptionPane.showInputDialog("Insira o nome da sua Rua: ");
		String numero = JOptionPane.showInputDialog("Insira o numero: ");
		int iNumero = Integer.parseInt(numero);
		String bairro = JOptionPane.showInputDialog("Insira o bairro: ");
		String cidade = JOptionPane.showInputDialog("Insira sua cidade: ");
		String estado = JOptionPane.showInputDialog("Insira sua estado: ");
		String complemento = JOptionPane.showInputDialog("Insira o complemento: ");
		String cep = JOptionPane.showInputDialog("Insira seu CEP: ");
		Endereco endereco = new Endereco(rua, iNumero, complemento, bairro, cidade, estado, cep);
		PessoaFisica pessoaF = new PessoaFisica(email, celular, endereco, nomeCompleto, cpf, estadoCivil);
		valida = locatario.add(pessoaF);
		JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!");
		return pessoaF;
	}
	
	public boolean cadastrarPessoaJuridica() {
		boolean valida = false;
		
		String nomeCompleto = null;
		do {
			try {
					nomeCompleto = JOptionPane.showInputDialog("Insira seu nome social: ");
					valida = true;
					throw new campoEmBrancoException();
				}
			catch (campoEmBrancoException e) {
				valida = false;
				}
		   } while (valida);
		String cnpj = null;
		do {
			try {
					cnpj = JOptionPane.showInputDialog("Insira seu Cnpj: ");
					valida = true;
					throw new campoEmBrancoException();
				}
			catch (campoEmBrancoException e) {
				valida = false;
				}
		   } while (valida);
		String email = null;
		do {
			try {
					email = JOptionPane.showInputDialog("Insira seu email: ");
					valida = true;
					throw new campoEmBrancoException();
				}
			catch (campoEmBrancoException e) {
				valida = false;
				}
		   } while (valida);
		
		String celular = JOptionPane.showInputDialog("Insira seu telefone: ");
		String rua = JOptionPane.showInputDialog("Insira o nome da sua Rua: ");
		String numero = JOptionPane.showInputDialog("Insira o numero: ");
		int iNumero = Integer.parseInt(numero);
		String bairro = JOptionPane.showInputDialog("Insira o bairro: ");
		String cidade = JOptionPane.showInputDialog("Insira sua cidade: ");
		String estado = JOptionPane.showInputDialog("Insira sua estado: ");
		String complemento = JOptionPane.showInputDialog("Insira o complemento: ");
		String cep = JOptionPane.showInputDialog("Insira seu CEP: ");
		String numeroFuncionarios = JOptionPane.showInputDialog("Deseja cadastrar quantos funcion√°rios? ");
		int iNumeroFuncionarios = Integer.parseInt(numeroFuncionarios);
		Endereco endereco = new Endereco(rua, iNumero, complemento, bairro, cidade, estado, cep);
		PessoaJuridica pessoaJ;
		List <PessoaFisica> pessoaF = new LinkedList<PessoaFisica>();
		
		for(int cont = 0; cont < iNumeroFuncionarios; cont++) {
			JOptionPane.showMessageDialog(null, "Cadastro de funcionario ");
			PessoaFisica funcionarioCadastro = this.cadastrarPessoaFisica();
			pessoaF.add(funcionarioCadastro);
			
		}
		pessoaJ = new PessoaJuridica(email, celular, endereco, nomeCompleto, cnpj, pessoaF);
		locatario.add(pessoaJ);
		JOptionPane.showMessageDialog(null, "Pessoa Juridica cadastrada com sucesso!");
		return true;
	}
	
	public boolean pesquisar() throws Exception {
		String entrada = JOptionPane.showInputDialog("Informe o que deseja pesquisar: " + "\n" + 
				"A) Pessoa fisica" + "\n" +
				"B) Pessoa Juridica");
		entrada = entrada.toUpperCase();
		switch (entrada) {
		case "A":
			String locPesquisar = JOptionPane.showInputDialog("Informe o Nome, CPF ou Email do locatario a ser pesquisado:");
			Locatario resposta = pesquisarLocatario(locPesquisar, 1);
			if (resposta != null) {
				JOptionPane.showMessageDialog(null, "Nome: " +  resposta.getNomeCompleto() + "\n" +
											"Celular: " + resposta.getCelular() + "\n" + 
											"CPF: " + resposta.getCpf_cnpj() + "\n" + 
											"Email: " + resposta.getEmail());
			}
			break;
			
		case "B":
			String locPesquisarB = JOptionPane.showInputDialog("Informe o Nome social, CNPJ ou Email do locatario a ser pesquisado:");
			Locatario respostaB = pesquisarLocatario(locPesquisarB, 1);
			if (respostaB != null) {
				JOptionPane.showMessageDialog(null, "Nome social: " +  respostaB.getNomeCompleto() + "\n" +
						"Celular: " + respostaB.getCelular() + "\n" + 
						"CNPJ: " + respostaB.getCpf_cnpj() + "\n" + 
						"Email: " + respostaB.getEmail());	
			}
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Escolha certo");
			break;
		}
		
		return true;
	}
	
	public boolean alterar() throws Exception {
		String locAlterar = JOptionPane.showInputDialog("Informe o Nome, CPF, CNPJ ou Email do locatario a ser alterado:");
		boolean validar = false;
		String entrada = JOptionPane.showInputDialog("Informe o que deseja alterar: " + "\n" + 
				"A) Nome" + "\n" +
				"B) CPF ou CNPJ" + "\n" +
				"C) Email" + "\n" +
				"D) Celular" + "\n" +
				"E) Endereco");
		entrada = entrada.toUpperCase();
		switch (entrada) {
		case "A":
			boolean valida = false;
			String modNome = "";
			do {
				try {
						modNome = JOptionPane.showInputDialog("Mudar " + pesquisarLocatario(locAlterar, 2).getNomeCompleto() + " para: ");
						valida = true;
						throw new campoEmBrancoException();
					}
				catch (campoEmBrancoException e) {
					valida = false;
					}
			   } while (valida);
			pesquisarLocatario(locAlterar, 2).setNomeCompleto(modNome);
			break;
			
		case "B":
			String modCpfCnpj = "";
			do {
				try {
						modCpfCnpj = JOptionPane.showInputDialog("Mudar " + pesquisarLocatario(locAlterar, 2).getCpf_cnpj() + " para: ");
						valida = true;
						throw new campoEmBrancoException();
					}
				catch (campoEmBrancoException e) {
					valida = false;
					}
			   } while (valida);
			pesquisarLocatario(locAlterar, 2).setCpf_cnpj(modCpfCnpj);
			break;
			
		case "C":
			String modEmail = "";
			do {
				try {
						modEmail = JOptionPane.showInputDialog("Mudar " + pesquisarLocatario(locAlterar, 2).getEmail() + " para: ");
						valida = true;
						throw new campoEmBrancoException();
					}
				catch (campoEmBrancoException e) {
					valida = false;
					}
			   } while (valida);
			pesquisarLocatario(locAlterar, 2).setEmail(modEmail);
			break;
			
		case "D":
			String modCelular = JOptionPane.showInputDialog("Mudar " + pesquisarLocatario(locAlterar, 2).getCelular() + " para: ");
			pesquisarLocatario(locAlterar, 2).setCelular(modCelular);
			break;
		case "E":
			String entrada2 = JOptionPane.showInputDialog("Qual informaÁ„o do endereco deseja modificar?" + "\n" +
													"A) Rua" + "\n" +
													"B) N˙mero" + "\n" +
													"C) Complemento" + "\n" +
													"D) Bairro" + "\n" +
													"E) Cidade" + "\n" +
													"F) Estado" + "\n" +
													"G) CEP" +"\n" +
													"H) Endereco completo");
					
			entrada2 = entrada2.toUpperCase();
					switch (entrada2) {
					
					case "A":
						String ruaTemp = JOptionPane.showInputDialog("Mudar " + pesquisarLocatario(locAlterar, 2).getEndereco().getRua() + " para: ");
						pesquisarLocatario(locAlterar, 2).getEndereco().setRua(ruaTemp);
						break;
					case "B":
						String numeroTemp = JOptionPane.showInputDialog("Mudar " + pesquisarLocatario(locAlterar, 2).getEndereco().getNumero() + " para: ");
						int inumeroTemp = Integer.parseInt(numeroTemp);
						pesquisarLocatario(locAlterar, 2).getEndereco().setNumero(inumeroTemp);
						break;
					case "C":
						String complementoTemp = JOptionPane.showInputDialog("Mudar " + pesquisarLocatario(locAlterar, 2).getEndereco().getComplemento() + " para: ");
						pesquisarLocatario(locAlterar, 2).getEndereco().setComplemento(complementoTemp);
						break;
					case "D": 
						String bairroTemp = JOptionPane.showInputDialog("Mudar " + pesquisarLocatario(locAlterar, 2).getEndereco().getBairro() + " para: ");
						pesquisarLocatario(locAlterar, 2).getEndereco().setBairro(bairroTemp);
						break;
					case "E": 
						String cidadeTemp = JOptionPane.showInputDialog("Mudar " + pesquisarLocatario(locAlterar, 2).getEndereco().getCidade() + " para: ");
						pesquisarLocatario(locAlterar, 2).getEndereco().setCidade(cidadeTemp);
						break;
					case "F":
						String estadoTemp = JOptionPane.showInputDialog("Mudar " + pesquisarLocatario(locAlterar, 2).getEndereco().getEstado() + " para: ");
						pesquisarLocatario(locAlterar, 2).getEndereco().setEstado(estadoTemp);
						break;
					case "G":
						String cepTemp = JOptionPane.showInputDialog("Mudar " + pesquisarLocatario(locAlterar, 2).getEndereco().getCep() + " para: ");
						pesquisarLocatario(locAlterar, 2).getEndereco().setCep(cepTemp);
						break;
					case "H":
						String ruaChange = JOptionPane.showInputDialog("Insira o nome da sua Rua: ");
						pesquisarLocatario(locAlterar, 2).getEndereco().setRua(ruaChange);
						String numeroChange = JOptionPane.showInputDialog("Insira o numero: ");
						int iNumeroChange = Integer.parseInt(numeroChange);
						pesquisarLocatario(locAlterar, 2).getEndereco().setNumero(iNumeroChange);
						String bairroChange = JOptionPane.showInputDialog("Insira o bairro: ");
						pesquisarLocatario(locAlterar, 2).getEndereco().setBairro(bairroChange);
						String cidadeChange = JOptionPane.showInputDialog("Insira sua cidade: ");
						pesquisarLocatario(locAlterar, 2).getEndereco().setCidade(cidadeChange);
						String estadoChange = JOptionPane.showInputDialog("Insira sua estado: ");
						pesquisarLocatario(locAlterar, 2).getEndereco().setEstado(estadoChange);
						String complementoChange = JOptionPane.showInputDialog("Insira o complemento: ");
						pesquisarLocatario(locAlterar, 2).getEndereco().setComplemento(complementoChange);
						String cepChange = JOptionPane.showInputDialog("Insira seu CEP: ");
						pesquisarLocatario(locAlterar, 2).getEndereco().setCep(cepChange);
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
	
	public boolean excluir() throws Exception, objetoNaoEncontradoException {
		String locDeletar = JOptionPane.showInputDialog("Informe o Nome, CPF, CNPJ ou Email:");
		boolean validar = false;
		for(Locatario locX : locatario) {
			if(locX == pesquisarLocatario(locDeletar, 2)) {
				validar = locatario.remove(locX);
				JOptionPane.showMessageDialog(null, "Locatario excluido com sucesso!");
			} else {
				JOptionPane.showMessageDialog(null, "Locatario nao encontrado!");
			}
		}
		
		return validar;
	}
	
	public Locatario pesquisarLocatario(String pesquisa, int controle) throws objetoNaoEncontradoException {
        boolean validar = false;
        Locatario resposta = null; 
        	  for (Locatario locPesquisado : locatario){
               //Pesquisa por nome
                if(locPesquisado.getNomeCompleto().equalsIgnoreCase(pesquisa)){
                    resposta = locPesquisado;
                    validar = true;
                    break;
                }
            }
           
           for (Locatario locPesquisado : locatario){
               //Pesquisa por email
                if(locPesquisado.getEmail().equalsIgnoreCase(pesquisa)){
                    resposta = locPesquisado;
                    validar = true;
                    break;
                }
            }
           
           for (Locatario locPesquisado : locatario){
               //Pesquisa por cpf/cnpj
                if(locPesquisado.getCpf_cnpj().equalsIgnoreCase(pesquisa)){
                    resposta = locPesquisado;
                    validar = true;
                    break;
                }
            }

              
       if (controle == 1) {
    	   if(resposta == null){
        	   validar = false;
        	   JOptionPane.showMessageDialog(null, "Pessoa nao encontrada!");
           }else{
        	   JOptionPane.showMessageDialog(null, "Pessoa encontrada!");
           }  
       }
       
       return resposta;
    }
}
