package Ejercicios;
import javax.swing.JOptionPane;

/*Diseñe un algoritmo para una persona que desea invertir su capital (cap_inv) en un banco y desea saber cuánto 
dinero ganara después de un mes si el banco le paga un interés del 2% mensual.*/


public class Ejercicio1_1 {

	public static void main(String[] args) {
		int capinv;
		double Ganancia;
		
		capinv= Integer.parseInt(JOptionPane.showInputDialog("indique la cantidad de dinero a invertir"));
		Ganancia= capinv * 0.02;
		
		JOptionPane.showMessageDialog(null, "la ganancia mensual es de: "+Ganancia);
		
	}

}
