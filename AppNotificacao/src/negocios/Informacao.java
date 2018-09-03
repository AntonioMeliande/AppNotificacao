package negocios;

public class Informacao {

	public String razaoSocial;
	public String inscricao;
	public String dataLavratura;
	public String dataUltCiencia;
	public String dataTermoEnc;
	public float ValorDebito;
	
	public void divulgar() {
		System.out.printf("Informação :: Razão Social: %s - Inscrição: %s - Data da Lavratura: %s "
				+ "- Data da Última Ciência: %s - Data Termo de Encaminhamento: %s "
				+ "- Valor do Débito: %.2f\n",
				razaoSocial,
				inscricao,
				dataLavratura,
				dataUltCiencia,
				dataTermoEnc,
				ValorDebito
				);	
	}
	
	
}
