package Principal;
import javax.swing.*;
import ConversorMonedas.Function;
import ConvertirTemperatura.FunctionTemperatura;

public class Principal {
	
	public static void main (String[] args) {
		
		Function monedas = new Function();
		FunctionTemperatura temperatura = new FunctionTemperatura();
		    
		while (true) {
			
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ",	"Menu",	JOptionPane.QUESTION_MESSAGE,  null,  new Object[] 	{"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();
			
			switch (opciones) {
			case "Conversor de Moneda":
				String input = JOptionPane.showInputDialog("Digita la cantidad de dinero que necesitas convertir: ");			
			if (ValidarNumero(input) == true) {
				double valorRecibido = Double.parseDouble(input);
				monedas.ConvertirMonedas(valorRecibido);
			
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
				if (JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Selecciona opción afirmativa");
				}else {
					JOptionPane.showMessageDialog(null, "Programa finalizado");
				}
				
				}else {
					JOptionPane.showMessageDialog(null, "Valor Inválido");
				}
				break;
			
			case "Conversor de Temperatura":
				input = JOptionPane.showInputDialog("Digita el valor de la temperatura que deseas convertir ");
				if(ValidarNumero(input) == true) {
					double valorRecibido = Double.parseDouble(input);
					temperatura.ConvertidorTemperatura(valorRecibido);
					
					int respuesta = 0;
					respuesta = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
					if ((respuesta == 0) && (ValidarNumero(input) == true)) {
				}else { 
					JOptionPane.showMessageDialog(null, "Programa Terminado");
				}
				}else {
					JOptionPane.showMessageDialog(null, "Valor Inválido");
				}
				break;
				
				}
			}
		}
	
	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x >= 0 || x < 0 );
			return true;  
		}catch (NumberFormatException e ) {
			return false;
		}
	}
}
	

