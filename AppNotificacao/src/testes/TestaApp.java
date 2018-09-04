package testes;

import negocios.Informacao;
import negocios.Malote;
import negocios.Processo;

public class TestaApp {
	public static void main(String[] args) {
		
		Malote malote = new Malote();
		malote.srte = ("SRTE NAO INFORMADA");
		malote.quantidade = (0);
		malote.dataEnvio = ("DATA NAO INFORMADA");
		
		Processo processo = new Processo();
		processo.numero = ("999999999");
		processo.notificacao = ("999999999");
		processo.recebido = false;
		
		Informacao informacao = new Informacao();
		informacao.dataLavratura = ("Data Nao Informada");
		
		
		
				
		
		
	}
	

}
