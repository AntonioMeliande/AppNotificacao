package auxiliar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Constante {

	public static final String[] SRTE = {"RJ", "SP", "PR", "RS"};
	
	public static String obterDataFormatada(Date data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
        return df.format(data);
	}
	public static String obterHoraFormatada(Date data) {
		DateFormat df = new SimpleDateFormat("HH:mm");
		
        return df.format(data);
	}

	public static String obterDataHoraFormatada(Date data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
        return df.format(data);
	}	
	
}
