package negocios;

public class Malote {
	
	private String[] srte;
	private String oficio;
	private int quantidade;
	private String dataEnvio;
	private Processo processo;
	
	public Malote() {
		
	}
	
	public Malote(String[] srte, String oficio, int quantidade, String dataEnvio) {
		this.srte = srte;
		this.oficio = oficio;
		this.quantidade = quantidade;
		this.dataEnvio = dataEnvio;
	}
		
			
	public void exibir() {
		System.out.println("\n#MALOTE#\n");
		
		for(String o : srte) {
			System.out.printf("SRTE: %s\n", o);
		}
		
		System.out.printf("Ofício: %s\n"
				+ "Quantidade de Processos: %d\n"
				+ "Data do Envio: %s\n",
				oficio,
				quantidade,
				dataEnvio
				);
		
		processo.exibir();	
				
	}

	public String[] getSrte() {
		return srte;
	}

	public void setSrte(String[] srte) {
		this.srte = srte;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(String dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	public Processo getProcesso() {
		return processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

		
}
