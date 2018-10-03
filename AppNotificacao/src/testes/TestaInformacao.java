package testes;

import negocios.Informacao;

public class TestaInformacao {

	public static void main(String[] args) {
		
		Informacao i = new Informacao();
		i.setDataRecebimento(null);
		i.setDataLavratura(null);
		i.setDataUltCiencia(null);
		i.setDataTermoEnc(null);
		i.setDataCadastro(null);
		
		i.exibir();
	}
}
