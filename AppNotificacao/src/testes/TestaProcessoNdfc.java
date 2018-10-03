package testes;

import negocios.Empresa;
import negocios.Informacao;
import negocios.ProcessoNdfc;

public class TestaProcessoNdfc {

	public static void main(String[] args) {
		
		Empresa e = new Empresa();
		e.setRazaoSocial("EMPRESA 01");
		e.setInscricao("00123456000188");
		e.setValorDebito(10000);
		
		Informacao i = new Informacao();
		i.setDataRecebimento(null);
		i.setDataLavratura(null);
		i.setDataUltCiencia(null);
		i.setDataTermoEnc(null);
		i.setDataCadastro(null);
			
			
		ProcessoNdfc ndfc = new ProcessoNdfc();
		ndfc.setTipoCadastramento("Pre-Incluida");
		ndfc.setPrioridade(false);
		ndfc.setEmpresa(e);
		ndfc.setInformacao(i);
		ndfc.setNotificacao("200100300");
		ndfc.setNumero("15101502012018");
		ndfc.setRecebido(false);
				
		ndfc.exibir();
	}
}
