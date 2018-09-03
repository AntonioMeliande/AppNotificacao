package negocios;

public class Processo {

		public String processo;
		public String notificacao;
		public boolean recebido;
		
		public void exibir() {
			System.out.printf("Informação :: Número Processo: %s - Número da Notificação: %s"
					+ " - Recebido: %s\n",
					processo,
					notificacao,
					recebido ? "sim" :"nao"
					);	
		}
}
