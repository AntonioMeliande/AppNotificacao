package negocios;

public class ProcessoNdfc extends Processo {

	private String tipoCadastramento;
	private boolean prioridade;
		
	@Override
	public void imprimirTipo() {

		super.adicionarCabecalho();
		
		System.out.println(" - #NDFC#");
		
		super.exibir();
	}
			
	public void exibir() {
				System.out.printf("Tipo de Cadastramento: %s\n"
				+ "Prioridade: %s\n",
				tipoCadastramento,
				prioridade ? "sim" :"nao"
				);
				
		super.exibir();
	}

	public String getTipoCadastramento() {
		return tipoCadastramento;
	}

	public void setTipoCadastramento(String tipoCadastramento) {
		this.tipoCadastramento = tipoCadastramento;
	}

	public boolean isPrioridade() {
		return prioridade;
	}

	public void setPrioridade(boolean prioridade) {
		this.prioridade = prioridade;
	}
	
}
