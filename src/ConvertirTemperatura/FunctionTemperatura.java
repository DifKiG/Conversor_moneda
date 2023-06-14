package ConvertirTemperatura;

import javax.swing.JOptionPane;

public class FunctionTemperatura {
	ConvertidorTemperatura temperatura = new ConvertidorTemperatura();
	
	public void ConvertidorTemperatura (double valorRecibido) {
		String opcion = (JOptionPane.showInputDialog(null, "Elige la temperatura que deseas convertir", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"Grados Celcius a grados Farenheit", "Grados Celcius a grados Kelvin", 
								"Grados Farenheit a grados Celcius", "Grados Kelvin a Celcius", "Grados Kelvin a Farenheit"},"Seleccion")).toString();
		switch(opcion) {
		case "Grados Celcius a grados Farenheit":
			temperatura.ConvertirCelciusAFarenheit(valorRecibido);
			break;
		case "Grados Celcius a grados Kelvin":
			temperatura.ConvertirCelciusAKelvin(valorRecibido);
			break;
		case "Grados Farenheit a grados Celcius":
			temperatura.ConvertirFarenheitACelcius(valorRecibido);
			break;
		case "Grados Kelvin a Celcius":
			temperatura.ConvertirKelvinACelcius(valorRecibido);
			break;
		case "Grados Kelvin a Farenheit":
			temperatura.ConvertirKelvinAFarenheit(valorRecibido);
		}	
	}
}
