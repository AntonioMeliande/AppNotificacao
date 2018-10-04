package testes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import negocios.Empresa;
import negocios.Informacao;
import negocios.ProcessoNdfc;

public class TestaProcessoNdfc {

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
				
		ndfc.imprimirTipo();
	}
}
