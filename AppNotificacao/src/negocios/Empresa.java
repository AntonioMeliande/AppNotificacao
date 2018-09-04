package negocios;

public class Empresa {
	
	public String razaoSocial;
	public String inscricao;
	public float ValorDebito;
	
	public void exibir() {
		System.out.printf("Informação :: Razão Social: %s - Inscrição: %s "
				+ "- Valor do Débito: %.2f\n",
				razaoSocial,
				inscricao,
				ValorDebito
				);	
	}

}
