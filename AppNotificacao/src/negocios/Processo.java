package negocios;

public class Processo {

		public String processo;
		public String notificacao;
		public boolean recebido;
		
		public void exibir() {
			System.out.printf("Informa��o :: N�mero Processo: %s - N�mero da Notifica��o: %s"
					+ " - Recebido: %s\n",
					processo,
					notificacao,
					recebido ? "sim" :"nao"
					);	
		}
}
