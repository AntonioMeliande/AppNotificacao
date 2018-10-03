package testes;

import negocios.Empresa;

public class TestaEmpresa {

	public static void main(String[] args) {
		
		Empresa e = new Empresa();
		e.setRazaoSocial("EMPRESA NOVA");
		e.setInscricao("00123456000188");
		e.setValorDebito(1000);
		
		e.exibir();
	}
}
