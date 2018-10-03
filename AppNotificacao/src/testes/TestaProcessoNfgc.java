package testes;

import negocios.Empresa;
import negocios.Informacao;
import negocios.ProcessoNfgc;

public class TestaProcessoNfgc {

	public static void main(String[] args) {
		
		Empresa e = new Empresa();
		e.setRazaoSocial("EMPRESA 02");
		e.setInscricao("00123456000188");
		e.setValorDebito(20000);
		
		Informacao i = new Informacao();
		i.setDataRecebimento(null);
		i.setDataLavratura(null);
		i.setDataUltCiencia(null);
		i.setDataTermoEnc(null);
		i.setDataCadastro(null);
		
		ProcessoNfgc nfgc = new ProcessoNfgc();
		nfgc.setCompetenciaInicial("01/2018");
		nfgc.setCompetenciaFinal("03/2018");
		nfgc.setEmpresa(e);
		nfgc.setInformacao(i);
		nfgc.setNotificacao("200300400");
		nfgc.setNumero("15161718012018");
		nfgc.setRecebido(false);
		
		nfgc.exibir();
	}
}
