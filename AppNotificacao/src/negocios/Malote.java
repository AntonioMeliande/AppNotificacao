package negocios;

public class Malote {
	
	public String srte;
	public int quantidade;
	public String dataEnvio;
	
	public void exibir() {
		System.out.printf("Informação :: SRTE: %s - Quantidade de Processos: %d"
				+ " - Data do Envio: %s\n",
				srte,
				quantidade,
				dataEnvio
				);	
	}
}
