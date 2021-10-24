package Ejercicios;
/*Un profesor desea saber qué porcentaje de hombres y que porcentaje de mujeres hay en su curso si se conocen el  
número de hombres (nh) y el número de mujeres (nm).*/

import javax.swing.JOptionPane;

public class ejercicio5 {

	public static void main(String[] args) {
		int nh, nm,porch,porcm,sumestu;
		
		nh=Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de hombres"));
		nm=Integer.parseInt(JOptionPane.showInputDialog("Indique la cantidad de mujeres"));
		
		sumestu=nh+nm;
		porch=nh*100/sumestu;
		porcm=nm*100/sumestu;
		
		JOptionPane.showMessageDialog(null, "el porcentaje de hombres es de "+porch+ " %" + " y mujeres "+porcm+" %");

	}

}
