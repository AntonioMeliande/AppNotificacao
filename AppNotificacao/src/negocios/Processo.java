package negocios;

public class Processo {

		public String numero;
		public String notificacao;
		public boolean recebido;
		public Empresa empresa;
		public Informacao informacao;
		
		public void exibir() {
			System.out.printf("Informa��o :: N�mero Processo: %s - N�mero da Notifica��o: %s"
					+ " - Recebido: %s\n",
					numero,
					notificacao,
					recebido ? "sim" :"nao"
					);	
			
			empresa.exibir();
			informacao.exibir();
		
		}
}
