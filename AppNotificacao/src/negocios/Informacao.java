package negocios;

public class Informacao {

	public String dataLavratura;
	public String dataUltCiencia;
	public String dataTermoEnc;
	public String dataCadastro;
	
	
	public void exibir() {
		System.out.printf("Informa��o :: Data da Lavratura: %s "
				+ "- Data da �ltima Ci�ncia: %s - Data Termo de Encaminhamento: %s "
				+ "- Data do Cadastramento: %s ",
				dataLavratura,
				dataUltCiencia,
				dataTermoEnc,
				dataCadastro
				);	
	}
	
	
}
