package negocios;

public class ProcessoNfgc extends Processo {
	
	private String competenciaInicial;
	private String competenciaFinal;
	

		
	@Override
	public void imprimirTipo() {

		super.adicionarCabecalho();
		
		System.out.println(" - #NFGC#");
		
		super.exibir();
	}
			
	public void exibir() {
				System.out.printf("Competencia Inicial: %s\n"
				+ "Competencia Final: %s\n",
				competenciaInicial,
				competenciaFinal
				);	
		super.exibir();
	}

	public String getCompetenciaInicial() {
		return competenciaInicial;
	}

	public void setCompetenciaInicial(String competenciaInicial) {
		this.competenciaInicial = competenciaInicial;
	}

	public String getCompetenciaFinal() {
		return competenciaFinal;
	}

	public void setCompetenciaFinal(String competenciaFinal) {
		this.competenciaFinal = competenciaFinal;
	}
	
}
