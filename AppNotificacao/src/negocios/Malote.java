package negocios;

public class Malote {
	
	private String[] srtes;
	private String oficio;
	private int quantidade;
	private String dataEnvio;
	private Processo processo;
	
	public Malote() {
		
	}
	
	public Malote(String[] srtes, String oficio, int quantidade, String dataEnvio) {
		this.srtes = srtes;
		this.oficio = oficio;
		this.quantidade = quantidade;
		this.dataEnvio = dataEnvio;
	}
		
			
	public void exibir() {
		System.out.println("\n#MALOTE#\n");
		
		for(String o : srtes) {
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

	public String[] getSrtes() {
		return srtes;
	}

	public void setSrtes(String[] srtes) {
		this.srtes = srtes;
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
