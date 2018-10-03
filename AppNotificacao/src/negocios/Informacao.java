package negocios;

import java.util.Calendar;

import auxiliar.Constante;
import interfaces.IExibido;

public class Informacao implements IExibido{

	private Calendar dataRecebimento;
	private Calendar dataLavratura;
	private Calendar dataUltCiencia;
	private Calendar dataTermoEnc;
	private Calendar dataCadastro;
	
	public Informacao() {
		
	}
	
		
	public void exibir() {
		System.out.println("\n#INFORMAÇÃO#\n");
		System.out.printf("Data do Recebimento: %s\n"
				+ "Data da Lavratura: %s\n"
				+ "Data da Última Ciência: %s\n"
				+ "Data Termo de Encaminhamento: %s\n"
				+ "Data do Cadastramento: %s\n",
				Constante.obterDataFormatada(dataRecebimento.getTime()),
				Constante.obterDataFormatada(dataLavratura.getTime()),
				Constante.obterDataFormatada(dataUltCiencia.getTime()),
				Constante.obterDataFormatada(dataTermoEnc.getTime()),
				Constante.obterDataFormatada(dataCadastro.getTime())
				);	
	}

	public Calendar getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(Calendar dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public Calendar getDataLavratura() {
		return dataLavratura;
	}

	public void setDataLavratura(Calendar dataLavratura) {
		this.dataLavratura = dataLavratura;
	}

	public Calendar getDataUltCiencia() {
		return dataUltCiencia;
	}

	public void setDataUltCiencia(Calendar dataUltCiencia) {
		this.dataUltCiencia = dataUltCiencia;
	}

	public Calendar getDataTermoEnc() {
		return dataTermoEnc;
	}

	public void setDataTermoEnc(Calendar dataTermoEnc) {
		this.dataTermoEnc = dataTermoEnc;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
}
