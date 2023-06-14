package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertidorDeMonedaAPesos { 
	
	public void ConvertidorDolarAPesos(double valor) {
		double  monedaDolar = valor * 4439.10;
		monedaDolar = (double)Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ "Pesos Colombianos");
	}
	
	public void ConvertidorEuroAPesos(double valor ) {
		double monedaEuro = valor * 4762.87;
		monedaEuro = (double)Math.round(monedaEuro * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ "Pesos Colombianos");
	}
	
	public void ConvertidorYenAPesos (double valor ) {
		double monedaYen = valor * 31.74;
		monedaYen = (double)Math.round(monedaYen *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ "  +monedaYen+ "Pesos Colombianos");
	}
	
	public void ConvertirLibraEsterlinaAPesos(double valor) {
		double monedaLibraEsterlina = valor * 5497.00;
		monedaLibraEsterlina = (double)Math.round(monedaLibraEsterlina * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibraEsterlina+ "Pesos Colombianos");
	}
	
	public void ConvertirWonCoreano(double valor) {
		double monedaWon =valor * 3.37;
		monedaWon =(double)Math.round(monedaWon  * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ "Pesos Colombianos");
	}
}
