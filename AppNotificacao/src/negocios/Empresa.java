package negocios;

public class Empresa {
	
	private String razaoSocial;
	private String inscricao;
	private float ValorDebito;
	
	public Empresa(String razaoSocial, String inscricao, float ValorDebito) {
		this.razaoSocial = razaoSocial;
		this.inscricao = inscricao;
		this.ValorDebito = ValorDebito;
	}
	
	public Empresa() {
		
	}

	public void exibir() {
		System.out.println("\n#EMPRESA#\n");
		System.out.printf("Razão Social: %s\n"
				+ "Inscrição: %s\n"
				+ "Valor do Débito: %.2f\n",
				razaoSocial,
				inscricao,
				ValorDebito
				);	
		
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getInscricao() {
		return inscricao;
	}

	public void setInscricao(String inscricao) {
		this.inscricao = inscricao;
	}

	public float getValorDebito() {
		return ValorDebito;
	}

	public void setValorDebito(float valorDebito) {
		ValorDebito = valorDebito;
	}
	

}
