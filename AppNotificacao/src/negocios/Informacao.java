package negocios;

public class Informacao {

	private String dataRecebimento;
	private String dataLavratura;
	private String dataUltCiencia;
	private String dataTermoEnc;
	private String dataCadastro;
	
	public Informacao() {
		
	}
	
	public Informacao(String dataRecebimento, String dataLavratura, String dataUltCiencia, String dataTermoEnc,
			String dataCadastro) {
		this.dataRecebimento = dataRecebimento;
		this.dataLavratura = dataLavratura;
		this.dataUltCiencia = dataUltCiencia;
		this.dataTermoEnc = dataTermoEnc;
		this.dataCadastro = dataCadastro;
	}
	
	public void exibir() {
		System.out.println("\n#INFORMAÇÃO#\n");
		System.out.printf("Data do Recebimento: %s\n"
				+ "Data da Lavratura: %s\n"
				+ "Data da Última Ciência: %s\n"
				+ "Data Termo de Encaminhamento: %s\n"
				+ "Data do Cadastramento: %s\n",
				dataRecebimento,
				dataLavratura,
				dataUltCiencia,
				dataTermoEnc,
				dataCadastro
				);	
	}

	public String getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(String dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public String getDataLavratura() {
		return dataLavratura;
	}

	public void setDataLavratura(String dataLavratura) {
		this.dataLavratura = dataLavratura;
	}

	public String getDataUltCiencia() {
		return dataUltCiencia;
	}

	public void setDataUltCiencia(String dataUltCiencia) {
		this.dataUltCiencia = dataUltCiencia;
	}

	public String getDataTermoEnc() {
		return dataTermoEnc;
	}

	public void setDataTermoEnc(String dataTermoEnc) {
		this.dataTermoEnc = dataTermoEnc;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
}
