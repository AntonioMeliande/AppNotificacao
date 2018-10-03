package negocios;

public abstract class Processo {

	private String numero;
	private String notificacao;
	private boolean recebido;
	private Empresa empresa;
	private Informacao informacao;
		
		public Processo() {
			
		}
		
		public Processo(String numero, String notificacao, boolean recebido) {
			this.numero = numero;
			this.notificacao = notificacao;
			this.recebido = recebido;
		}
		
		public abstract void imprimirTipo();
						
		public void exibir() {
			System.out.println("\n#PROCESSO#\n");
			System.out.printf("Número do Processo: %s\n"
					+ "Número da Notificação: %s\n"
					+ "Recebido: %s\n",
					numero,
					notificacao,
					recebido ? "sim" :"nao"
					);	
		
			empresa.exibir();		
			informacao.exibir();
					
		}
		
		protected final void adicionarCabecalho() {
			System.out.printf("#Processo#");
		}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public String getNotificacao() {
			return notificacao;
		}

		public void setNotificacao(String notificacao) {
			this.notificacao = notificacao;
		}

		public boolean isRecebido() {
			return recebido;
		}

		public void setRecebido(boolean recebido) {
			this.recebido = recebido;
		}

		public Empresa getEmpresa() {
			return empresa;
		}

		public void setEmpresa(Empresa empresa) {
			this.empresa = empresa;
		}

		public Informacao getInformacao() {
			return informacao;
		}

		public void setInformacao(Informacao informacao) {
			this.informacao = informacao;
		}
		
}

