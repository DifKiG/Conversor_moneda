package ConversorMonedas;

import javax.swing.JOptionPane	; 

public class ConvertirMonedas {
	public void ConvertirPesoColADolar(double valor) {
		double monedaDolar = valor / 4439.10;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares"); 
	}
	
	public void ConvertirPesoColAEuro(double valor) {
		double monedaEuro = valor / 4762.87;
		monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	
	public void ConvertirPesoColAYen(double valor) {
		double monedaYen = valor / 31.74;
		monedaYen = (double) Math.round(monedaYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yenes");
	}
	
	public void ConvertirPesoColALibraEsterlina(double valor) {
		double monedaLibraEsterlina = valor / 5497.00;
		monedaLibraEsterlina = (double) Math.round(monedaLibraEsterlina * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibraEsterlina+ " Libras Esterlinas");
	}
	
	public void ConvertirPesoColAWonSulCoreano(double valor) {
		double monedaWonSulCoreano = valor / 3.37;
		monedaWonSulCoreano = (double) Math.round(monedaWonSulCoreano * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWonSulCoreano+ " Won Sul Coreano");
	}
	
}
