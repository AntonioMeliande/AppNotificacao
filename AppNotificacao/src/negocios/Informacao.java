package negocios;

public class Informacao {

	public String razaoSocial;
	public String inscricao;
	public String dataLavratura;
	public String dataUltCiencia;
	public String dataTermoEnc;
	public float ValorDebito;
	
	public void divulgar() {
		System.out.printf("Informa��o :: Raz�o Social: %s - Inscri��o: %s - Data da Lavratura: %s "
				+ "- Data da �ltima Ci�ncia: %s - Data Termo de Encaminhamento: %s "
				+ "- Valor do D�bito: %.2f\n",
				razaoSocial,
				inscricao,
				dataLavratura,
				dataUltCiencia,
				dataTermoEnc,
				ValorDebito
				);	
	}
	
	
}
