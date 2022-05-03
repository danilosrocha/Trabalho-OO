package GerenciamentoReservas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import CadastroLocatarios.Endereco;
import CadastroLocatarios.Locatario;
import CadastroLocatarios.PessoaFisica;
import CadastroLocatarios.PessoaJuridica;
import GerenciamentoFrota.Veiculo;

public class GerenciarReserva {
	private List <Reserva> Reserva;
	
	public GerenciarReserva(){
        this.Reserva = new LinkedList<Reserva>();
    }
	
	static long TempoDeReserva (String dataInicio, String dataFim) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        long diasPassados = 0;
        //long horasPassadas = 0;
        try {
            Date d1 = sdf.parse(dataInicio);
            Date d2 = sdf.parse(dataFim);

            long tempoTotalPassado = d2.getTime() - d1.getTime();

        diasPassados = (tempoTotalPassado/ (1000 * 60 * 60 * 24))% 365;
        
        //horasPassadas= (tempoTotalPassado/ (1000 * 60 * 60))% 24;
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
        if (diasPassados == 0) {
        	diasPassados++;
        }

		return diasPassados;
    }

public void GerenciarReservasPf(int id, String locador,Veiculo veiculoSelec) {
	boolean valida = false;
	/*
	 * int identificador, String locResponsavel, String locCliente, Int tipoReserva(tipo de diária),
			float custo, Veiculo veiculo
	 */
	int identificador = id;
	int tipoReserva = 0; 
	String locResponsavel = locador;
	String locCliente = locResponsavel;
	
	Object[] confirmarTipoReserva = { "Diarias simples", "Diaria empresarial","Diaria mensal"};
	Object[] confirmarTipoReservaExtra = { "Diaria comum", "Diaria reduzida" };
	int input = JOptionPane.showOptionDialog(null, "Qual o tipo de reserva a ser realizada?", "Tipo de Reserva",
			JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,
			null, confirmarTipoReserva, confirmarTipoReserva[0] );
	if (input == 0 ) {
		int input2 = JOptionPane.showOptionDialog(null, "Diaria comum ou reduzida?", "Tipo de Reserva",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
				null, confirmarTipoReservaExtra, confirmarTipoReservaExtra[0] );
		if (input2 == 0) {
			tipoReserva = 1; //Diaria comum
		}
		else if (input2 == 1) {
			tipoReserva = 2; // Diaria reduzida
		}
	}
	else if (input == 1) {
		tipoReserva = 3; //Diara empresarial
	}
	else if (input == 2) {
		tipoReserva = 4; //Diaria mensal
		
	}
	
	/// Horários	
		
	String strInicio = JOptionPane.showInputDialog("Insira a data e horário inicial da locacao no formato:" + "\n"+
			"DD-MM-AAAA HH:mm");
	String strFim = JOptionPane.showInputDialog("Insira a data e horário final da locacao no formato:" + "\n"+
			"DD-MM-AAAA HH:mm");
	float tempoDecorrido = TempoDeReserva(strInicio, strFim);
	float custoDiaria_Mensal = 0;
	if (tipoReserva == 1) {
		custoDiaria_Mensal = veiculoSelec.getValores().getDiariaNormal();
	}
	else if (tipoReserva == 2) {
		custoDiaria_Mensal = veiculoSelec.getValores().getDiariaReduzida();
	}
	else if (tipoReserva == 3) {
		custoDiaria_Mensal = veiculoSelec.getValores().getDiariaEmpresarial();
	}
	else if (tipoReserva == 4) {
		
			custoDiaria_Mensal = veiculoSelec.getValores().getValorMensal();
		}
	
	float custoInicial = 0;
		if (tempoDecorrido%30 != 0) {
			custoInicial = ((int)tempoDecorrido/30 + 1) * 1.0f * custoDiaria_Mensal;
		}
		else {
			custoInicial = ((int)tempoDecorrido/30) * 1.0f * custoDiaria_Mensal;
		}
		float seguroTerceiros = custoInicial * 12 / 100;
		float seguroCarro = 0;
		float seguroImposto = custoInicial * 5 / 100;
		Object[] confirmarAdicionaisCusto = { "Sim", "Nao" };
		input = JOptionPane.showOptionDialog(null, "Deseja pagar o adicional para seguro do veiculo?", "Confirmacao do seguro veicular",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
				null, confirmarAdicionaisCusto, confirmarAdicionaisCusto[0] );
		if (input == 0) {
			seguroCarro = custoInicial * 8/100;

		}
		float custoLocacao = custoInicial + seguroTerceiros + seguroCarro + seguroImposto;

	Reserva novaReserva = new Reserva(identificador,locResponsavel, locCliente, tipoReserva, custoLocacao, veiculoSelec, strInicio, strFim, 
									custoInicial, seguroTerceiros, seguroCarro, seguroImposto);
	valida = Reserva.add(novaReserva);
	JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
	return;
}

public void GerenciarReservasPj(int id, String locadorPj,String locadorPf, Veiculo veiculoSelec) {
	boolean valida = false;
	/*
	 * int identificador, String locResponsavel, String locCliente, Int tipoReserva(tipo de diária),
			float custo, Veiculo veiculo
	 */
	int identificador = id;
	int tipoReserva = 0; 
	String locResponsavel = locadorPj;
	String locCliente = locadorPf;
	
	Object[] confirmarTipoReserva = { "Diarias simples", "Diaria empresarial","Diaria mensal"};
	Object[] confirmarTipoReservaExtra = { "Diaria comum", "Diaria reduzida" };
	int input = JOptionPane.showOptionDialog(null, "Qual o tipo de reserva a ser realizada?", "Tipo de Reserva",
			JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,
			null, confirmarTipoReserva, confirmarTipoReserva[0] );
	if (input == 0 ) {
		int input2 = JOptionPane.showOptionDialog(null, "Diaria comum ou reduzida?", "Tipo de Reserva",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
				null, confirmarTipoReservaExtra, confirmarTipoReservaExtra[0] );
		if (input2 == 0) {
			tipoReserva = 1; //Diaria comum
		}
		else if (input2 == 1) {
			tipoReserva = 2; // Diaria reduzida
		}
	}
	else if (input == 1) {
		tipoReserva = 3; //Diara empresarial
	}
	else if (input == 2) {
		tipoReserva = 4; //Diaria mensal
		
	}
	
	/// Horários	
		
	String strInicio = JOptionPane.showInputDialog("Insira a data e horário inicial da locacao no formato:" + "\n"+
			"DD-MM-AAAA HH:mm");
	String strFim = JOptionPane.showInputDialog("Insira a data e horário final da locacao no formato:" + "\n"+
			"DD-MM-AAAA HH:mm");
	float tempoDecorrido = TempoDeReserva(strInicio, strFim);
	float custoDiaria_Mensal = 0;
	if (tipoReserva == 1) {
		custoDiaria_Mensal = veiculoSelec.getValores().getDiariaNormal();
	}
	else if (tipoReserva == 2) {
		custoDiaria_Mensal = veiculoSelec.getValores().getDiariaReduzida();
	}
	else if (tipoReserva == 3) {
		custoDiaria_Mensal = veiculoSelec.getValores().getDiariaEmpresarial();
	}
	else if (tipoReserva == 4) {
		
			custoDiaria_Mensal = veiculoSelec.getValores().getValorMensal();
		}
	
	float custoInicial = 0;
		if (tempoDecorrido%30 != 0) {
			custoInicial = ((int)tempoDecorrido/30 + 1) * 1.0f * custoDiaria_Mensal;
		}
		else {
			custoInicial = ((int)tempoDecorrido/30) * 1.0f * custoDiaria_Mensal;
		}
		float seguroTerceiros = custoInicial * 12 / 100;
		float seguroCarro = 0;
		float seguroImposto = custoInicial * 5 / 100;
		Object[] confirmarAdicionaisCusto = { "Sim", "Nao" };
		input = JOptionPane.showOptionDialog(null, "Deseja pagar o adicional para seguro do veiculo?", "Confirmacao do seguro veicular",
				JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
				null, confirmarAdicionaisCusto, confirmarAdicionaisCusto[0] );
		if (input == 0) {
			seguroCarro = custoInicial * 8/100;

		}
		float custoLocacao = custoInicial + seguroTerceiros + seguroCarro + seguroImposto;

	Reserva novaReserva = new Reserva(identificador,locResponsavel, locCliente, tipoReserva, custoLocacao, veiculoSelec, strInicio, strFim, 
									custoInicial, seguroTerceiros, seguroCarro, seguroImposto);
	valida = Reserva.add(novaReserva);
	JOptionPane.showMessageDialog(null, "Reserva realizada com sucesso!");
	return ;
}

public void pesquisar () {
	
	Reserva reservaApresentar = null;
	reservaApresentar = encontrarReserva();
	String strAux = "";
	if (reservaApresentar.getTipoReserva() == 1 ) {
		strAux = "Diaria Comum";
	}
	else if (reservaApresentar.getTipoReserva() == 2 ) {
		strAux = "Diaria Reduzida";
	}
	else if (reservaApresentar.getTipoReserva() == 3 ) {
		strAux = "Diaria Empresarial";
	}
	else if (reservaApresentar.getTipoReserva() == 4 ) {
		strAux = "Valor Mensal";
	}
	
	
	

	JOptionPane.showMessageDialog(null, "Reserva: " + reservaApresentar.getIdentificador() + "\n" +
										"Locatario: " + reservaApresentar.getLocResponsavel() + "\n" + 
										"Responsavel pela locacao: " + reservaApresentar.getLocCliente() + "\n" + 
										"****************************** Dados da Locação ******************************" + "\n" +
										"Inicio: " + reservaApresentar.getDataHoraInicio() + "\n" +
										"Fim: " + reservaApresentar.getDataHoraFim() + "\n" +
										"Numero de diarias calculadas: " + TempoDeReserva(reservaApresentar.getDataHoraInicio(), reservaApresentar.getDataHoraFim()) + "\n" +
										"\n" +
										"Veiculo: " + reservaApresentar.getVeiculo().getMarca() + " - " + reservaApresentar.getVeiculo().getModelo() + "\n" +
										"Ano de Fabricacao / modelo: " + reservaApresentar.getVeiculo().getAnoFabricacao() + " - " + reservaApresentar.getVeiculo().getAnoModelo() + "\n" +
										"Renavam: " + reservaApresentar.getVeiculo().getNumeroCadastro() + "\n" + 
										"Categoria: " + reservaApresentar.getVeiculo().getCategoria() + "\n" + 
										"\n" + 
										"Valor da diaria: " + strAux + "\n" +
										"Valor do seguro de terceiros: " + reservaApresentar.getSeguroTerceiros() + "\n" +
										"Valor do seguro proprio: " + reservaApresentar.getSeguroVeiculo() + "\n" + 
										"Valor dos impostos: " + reservaApresentar.getSeguroImposto() + "\n" +
										"Valor total da locacao: " + reservaApresentar.getCusto());
									
}

public Reserva encontrarReserva() {
	
	String strNumReserva = JOptionPane.showInputDialog("Qual o numero da reserva?");
	int numReserva = Integer.parseInt(strNumReserva);

	Reserva mostrarReserva = null;
	for (Reserva buscaReserva : Reserva){
		if(buscaReserva.getIdentificador() == numReserva){
			mostrarReserva = buscaReserva;
			break;
		}
	}
	return mostrarReserva;	
}

public boolean deletarReserva() {
	boolean validar = false;
	
	Reserva reservaParaDeletar = null;
	reservaParaDeletar = encontrarReserva();
	validar = Reserva.remove(reservaParaDeletar);
	
	
	return validar;
}

}
