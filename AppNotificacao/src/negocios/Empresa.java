package negocios;

public class Empresa {
	
	public String razaoSocial;
	public String inscricao;
	public float ValorDebito;
	
	public void exibir() {
		System.out.printf("Informa��o :: Raz�o Social: %s - Inscri��o: %s "
				+ "- Valor do D�bito: %.2f\n",
				razaoSocial,
				inscricao,
				ValorDebito
				);	
	}

}
