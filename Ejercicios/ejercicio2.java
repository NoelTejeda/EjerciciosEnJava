package Ejercicios;

/*Diseñe un algoritmo para un vendedor que gana un sueldo base (sb) más un 10% extra por comisión de sus ventas y 
 desea calcular cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes 
 (v1, v2, v3) y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.*/



import javax.swing.JOptionPane;
public class ejercicio2 {

	public static void main(String[] args) {
	
		int sb, v1,v2,v3;
		double vt, gantotal;
		
		sb = Integer.parseInt(JOptionPane.showInputDialog("indique cuál es el salario del trabajador"));
		v1 = Integer.parseInt(JOptionPane.showInputDialog("indique cuál fué el monto de la venta 1"));
		v2 = Integer.parseInt(JOptionPane.showInputDialog("indique cuál fué el monto de la venta 2"));
		v3 = Integer.parseInt(JOptionPane.showInputDialog("indique cuál fué el monto de la venta 3"));
		
		vt= (v1+v2+v3)*0.01;
		gantotal = sb + vt;
		
		JOptionPane.showMessageDialog(null, "la ganancia por concepto de venta es de: " +vt);
		JOptionPane.showMessageDialog(null, "la ganancia total del mes es de: " +gantotal);
		
		
	}

}
