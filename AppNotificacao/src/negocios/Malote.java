package negocios;

import java.util.Calendar;
import java.util.List;

import auxiliar.Constante;
import interfaces.IExibido;

public class Malote implements IExibido {
	
	private String[] srte;
	private String oficio;
	private int quantidade;
	private Calendar dataEnvio;
	private List<Processo> processos;
	
	@Override
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
				Constante.obterDataFormatada(dataEnvio.getTime())
				);
		
		this.exibirProcessos();	
				
	}
	private void exibirProcessos() {
		System.out.println("Processos");
		for (Processo processo : processos) {
			processo.exibir();
		}
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

	public Calendar getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Calendar dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

	
	public String getOficio() {
		return oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public List<Processo> getProcessos() {
		return processos;
	}

	public void setProcessos(List<Processo> processos) {
		this.processos = processos;
	}

		
}
