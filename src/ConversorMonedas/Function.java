package ConversorMonedas;

import javax.swing.*;

public class Function {
	
	ConvertirMonedas  monedas =  new ConvertirMonedas();
	ConvertidorDeMonedaAPesos pesos = new ConvertidorDeMonedaAPesos ();
	
	public void ConvertirMonedas (double valorRecibido) {
		String opcion = (JOptionPane.showInputDialog(null , "Elige la moneda a la que deseas convertir tu dinero ",	"Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"De pesos a Dólar", "De pesos a Euro", "De pesos a Libras", "De pesos a Yen Japones", "De pesos a Won Sul Coreano",
								"De Dólar a pesos", "De Euro a pesos", "De Libras a pesos", "De Yen a pesos", "De Won a pesos"},
						"Seleccion")).toString();
		switch (opcion) {
		case "De pesos a Dólar": 
			monedas.ConvertirPesoColADolar(valorRecibido);
			break;
		case "De pesos a Euro":
			monedas.ConvertirPesoColAEuro(valorRecibido);
			break; 
		case "De pesos a Libras":
			monedas.ConvertirPesoColALibraEsterlina(valorRecibido);
			break;
		case "De pesos a Yen Japones":
			monedas.ConvertirPesoColAYen(valorRecibido);
			break;
		case "De pesos a Won Sul Coreano":
			monedas.ConvertirPesoColAWonSulCoreano(valorRecibido);
			break;
		case "De Dólar a pesos":
			pesos.ConvertidorDolarAPesos(valorRecibido);
			break;
		case "De Euro a pesos":
			pesos.ConvertidorEuroAPesos(valorRecibido);
			break;
		case "De Libras a pesos":
			pesos.ConvertirLibraEsterlinaAPesos(valorRecibido);
			break;
		case "De Yen a pesos":
			pesos.ConvertidorYenAPesos(valorRecibido);
			break;
		case "De Won a pesos":
			pesos.ConvertirWonCoreano(valorRecibido);
			break;
		} 	
	}
}
