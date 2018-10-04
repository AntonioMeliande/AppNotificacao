package testes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import negocios.Empresa;
import negocios.Informacao;
import negocios.ProcessoNfgc;

public class TestaProcessoNfgc {

	public static void main(String[] args) {
		
		
		DateFormat df = null;
		Calendar dataRecebimentoNfgc = Calendar.getInstance();
		df = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtRecebimento = (Date) df.parse("30/09/2018");
			dataRecebimentoNfgc.setTime(dtRecebimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataLavraturaNfgc = Calendar.getInstance();
		df = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtLavratura = (Date) df.parse("15/03/2015");
			dataLavraturaNfgc.setTime(dtLavratura);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataUltCienciaNfgc = Calendar.getInstance();
		df = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtUltCiencia = (Date) df.parse("30/07/2018");
			dataUltCienciaNfgc.setTime(dtUltCiencia);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataTermoEncNfgc = Calendar.getInstance();
		df = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtTermoEnc = (Date) df.parse("30/08/2018");
			dataTermoEncNfgc.setTime(dtTermoEnc);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataCadastroNfgc = Calendar.getInstance();
		df = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtCadastro = (Date) df.parse("04/10/2018");
			dataCadastroNfgc.setTime(dtCadastro);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		Informacao iNfgc = new Informacao();
		iNfgc.setDataRecebimento(dataRecebimentoNfgc);
		iNfgc.setDataLavratura(dataLavraturaNfgc);
		iNfgc.setDataUltCiencia(dataUltCienciaNfgc);
		iNfgc.setDataTermoEnc(dataTermoEncNfgc);
		iNfgc.setDataCadastro(dataCadastroNfgc);
		
		Empresa eNfgc = new Empresa();	
		eNfgc.setRazaoSocial("EMPRESA 02");
		eNfgc.setInscricao("00123456000188");
		eNfgc.setValorDebito(20000);
		
		ProcessoNfgc nfgc = new ProcessoNfgc();
		nfgc.setCompetenciaInicial("01/2018");
		nfgc.setCompetenciaFinal("03/2018");
		nfgc.setEmpresa(eNfgc);
		nfgc.setInformacao(iNfgc);
		nfgc.setNotificacao("200300400");
		nfgc.setNumero("15161718012018");
		nfgc.setRecebido(false);
		
		nfgc.imprimirTipo();

	}
}

