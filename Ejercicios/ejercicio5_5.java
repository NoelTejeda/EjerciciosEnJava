package Ejercicios;
/*Un profesor desea saber qué porcentaje de hombres y que porcentaje de mujeres hay en su curso si se conocen el 
número de hombres (nh) y el número de mujeres (nm).*/

import java.util.Scanner;
public class ejercicio5_5 {

	public static void main(String[] args) {
	Scanner Noel = new Scanner (System.in);
	int nh,nm,sumestu;
	double porch,porcm;
	
	
	System.out.println("indique la cantidad de hombres");
	nh = Noel.nextInt();
	
	System.out.println("indique la cantidad de mujeres");
	nm = Noel.nextInt();
	Noel.close();
	sumestu=nh+nm;
	porch=nh*100/sumestu;
	porcm=nm*100/sumestu;
	
	System.out.println("el porcentaje de hombres es de: "+porch +"%");
	System.out.println("el porcentaje de mujeres es de: "+porcm +"%");

	}

}
