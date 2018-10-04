package testes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import negocios.Informacao;

public class TestaInformacao {

	public static void main(String[] args) {
		
		DateFormat df = null;
		Calendar dataRecebimento = Calendar.getInstance();
		df = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtRecebimento = (Date) df.parse("30/09/2018");
			dataRecebimento.setTime(dtRecebimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataLavratura = Calendar.getInstance();
		df = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtLavratura = (Date) df.parse("15/03/2015");
			dataLavratura.setTime(dtLavratura);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataUltCiencia = Calendar.getInstance();
		df = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtUltCiencia = (Date) df.parse("30/07/2018");
			dataUltCiencia.setTime(dtUltCiencia);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataTermoEnc = Calendar.getInstance();
		df = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtTermoEnc = (Date) df.parse("30/08/2018");
			dataTermoEnc.setTime(dtTermoEnc);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar dataCadastro = Calendar.getInstance();
		df = new SimpleDateFormat ("dd/MM/yyyy");
		try {
			Date dtCadastro = (Date) df.parse("04/10/2018");
			dataCadastro.setTime(dtCadastro);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		Informacao i = new Informacao();
		i.setDataRecebimento(dataRecebimento);
		i.setDataLavratura(dataLavratura);
		i.setDataUltCiencia(dataUltCiencia);
		i.setDataTermoEnc(dataTermoEnc);
		i.setDataCadastro(dataCadastro);
		
		i.exibir();
	}
}
