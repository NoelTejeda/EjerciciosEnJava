package Ejercicios;
import javax.swing.JOptionPane;

/*Una tienda ofrece un descuento del 15% sobre el total de la compra de sus clientes, diseñe un algoritmo para saber cuánto deberá pagar c/u si conoce el total de su compra.*/

public class ejercicio3 {

	public static void main(String[] args) {
		double comprador1, comprador2, pagar1, pagar2;
		
		comprador1 = Double.parseDouble(JOptionPane.showInputDialog("para el cliente 1 indique el monto total de la compra")) ;
		comprador2 = Double.parseDouble(JOptionPane.showInputDialog("para el cliente 2 indique el monto total de la compra")) ;
		
		pagar1= comprador1 - (comprador1 * 0.15);
		pagar2= comprador2 - (comprador2 * 0.15);
		
		JOptionPane.showMessageDialog(null, "la cantidad a pagar del comprador 1 es: "+pagar1);
		JOptionPane.showMessageDialog(null, "la cantidad a pagar del comprador 2 es: "+pagar2);
		
	}

}
