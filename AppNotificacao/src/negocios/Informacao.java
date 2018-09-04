package negocios;

public class Informacao {

	public String dataLavratura;
	public String dataUltCiencia;
	public String dataTermoEnc;
	public String dataCadastro;
	
	
	public void exibir() {
		System.out.printf("Informação :: Data da Lavratura: %s "
				+ "- Data da Última Ciência: %s - Data Termo de Encaminhamento: %s "
				+ "- Data do Cadastramento: %s ",
				dataLavratura,
				dataUltCiencia,
				dataTermoEnc,
				dataCadastro
				);	
	}
	
	
}
