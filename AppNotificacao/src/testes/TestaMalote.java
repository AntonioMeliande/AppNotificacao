package testes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import negocios.Empresa;
import negocios.Informacao;
import negocios.Malote;
import negocios.Processo;
import negocios.ProcessoNdfc;
import negocios.ProcessoNfgc;

public class TestaMalote {

	public static void main(String[] args) {

		DateFormat df = null;
		Calendar dataRecebimentoNdfc = Calendar.getInstance();
		df = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtRecebimento = (Date) df.parse("30/09/2018");
			dataRecebimentoNdfc.setTime(dtRecebimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataLavraturaNdfc = Calendar.getInstance();
		df = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtLavratura = (Date) df.parse("15/03/2015");
			dataLavraturaNdfc.setTime(dtLavratura);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataUltCienciaNdfc = Calendar.getInstance();
		df = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtUltCiencia = (Date) df.parse("30/07/2018");
			dataUltCienciaNdfc.setTime(dtUltCiencia);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataTermoEncNdfc = Calendar.getInstance();
		df = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtTermoEnc = (Date) df.parse("30/08/2018");
			dataTermoEncNdfc.setTime(dtTermoEnc);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataCadastroNdfc = Calendar.getInstance();
		df = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtCadastro = (Date) df.parse("04/10/2018");
			dataCadastroNdfc.setTime(dtCadastro);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		Informacao iNdfc = new Informacao();
		iNdfc.setDataRecebimento(dataRecebimentoNdfc);
		iNdfc.setDataLavratura(dataLavraturaNdfc);
		iNdfc.setDataUltCiencia(dataUltCienciaNdfc);
		iNdfc.setDataTermoEnc(dataTermoEncNdfc);
		iNdfc.setDataCadastro(dataCadastroNdfc);

		Empresa eNdfc = new Empresa();
		eNdfc.setRazaoSocial("EMPRESA 01");
		eNdfc.setInscricao("00123456000188");
		eNdfc.setValorDebito(10000);
		
		ProcessoNdfc ndfc = new ProcessoNdfc();
		ndfc.setTipoCadastramento("Pre-Incluida");
		ndfc.setPrioridade(false);
		ndfc.setEmpresa(eNdfc);
		ndfc.setInformacao(iNdfc);
		ndfc.setNotificacao("200100300");
		ndfc.setNumero("15101502012018");
		ndfc.setRecebido(false);
		
		DateFormat dfNfgc = null;
		Calendar dataRecebimentoNfgc = Calendar.getInstance();
		dfNfgc = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtRecebimento = (Date) dfNfgc.parse("30/09/2018");
			dataRecebimentoNfgc.setTime(dtRecebimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataLavraturaNfgc = Calendar.getInstance();
		dfNfgc = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtLavratura = (Date) dfNfgc.parse("15/03/2015");
			dataLavraturaNfgc.setTime(dtLavratura);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataUltCienciaNfgc = Calendar.getInstance();
		dfNfgc = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtUltCiencia = (Date) dfNfgc.parse("30/07/2018");
			dataUltCienciaNfgc.setTime(dtUltCiencia);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataTermoEncNfgc = Calendar.getInstance();
		dfNfgc = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtTermoEnc = (Date) dfNfgc.parse("30/08/2018");
			dataTermoEncNfgc.setTime(dtTermoEnc);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataCadastroNfgc = Calendar.getInstance();
		dfNfgc = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtCadastro = (Date) dfNfgc.parse("04/10/2018");
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
		
		String[] srte = {"RJ", "SP", "PR", "RS"};

		List<Processo> lista = new ArrayList<Processo>();
		
		lista.add(ndfc);
		lista.add(nfgc);
		
		DateFormat dfDataEnvio = null;
		Calendar dataEnvio = Calendar.getInstance();
		dfDataEnvio = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtEnvio = (Date) dfDataEnvio.parse("30/08/2018");
			dataEnvio.setTime(dtEnvio);
		} catch (ParseException e) {
			e.printStackTrace();
		}
				
		Malote m = new Malote();
		
		m.setSrte(srte);
		m.setQuantidade(100);
		m.setOficio("065/2018");
		m.setDataEnvio(dataEnvio);
		m.setProcessos(lista);
		
		m.exibir();		
	}
}