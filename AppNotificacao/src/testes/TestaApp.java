package testes;

import negocios.Malote;
import negocios.Processo;
import negocios.Empresa;
import negocios.Informacao;

public class TestaApp {
	public static void main(String[] args) {
		
		String[] nomes = {"RJ"};
		
		Malote malote = new Malote();
		malote.setSrte(nomes);
		malote.setOficio("Informe o nº oficio");
		malote.setQuantidade(0);
		malote.setDataEnvio("DD/MM/AAA");
				
		Processo processo = new Processo();
		processo.setNumero("999999999");
		processo.setNotificacao("999999999");
		processo.setRecebido(false);
				
		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("NAO INFORMADO");
		empresa.setInscricao("99999999999999");
		empresa.setValorDebito(0);
			
		Informacao informacao = new Informacao();
		informacao.setDataRecebimento("DD/MM/AAAA");
		informacao.setDataLavratura("Data Nao Informada");
		informacao.setDataUltCiencia("DD/MM/AAAA");
		informacao.setDataTermoEnc("DD/MM/AAAA");
		informacao.setDataCadastro("DD/MM/AAAA");
	
		
	malote.setProcesso(processo);
	processo.setEmpresa(empresa);
	processo.setInformacao(informacao);	
	malote.exibir();
			
	}
	
}
