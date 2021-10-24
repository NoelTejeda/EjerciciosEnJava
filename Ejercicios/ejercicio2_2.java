package Ejercicios;


/*Diseñe un algoritmo para un vendedor que gana un sueldo base (sb) más un 10% extra por comisión de sus ventas y 
 desea calcular cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realiza en el mes 
 (v1, v2, v3) y el total que recibirá en el mes tomando en cuenta su sueldo base y comisiones.*/

import java.util.Scanner;
public class ejercicio2_2 {

	public static void main(String[] args) {
	Scanner Noel= new Scanner (System.in);
	
		int sb, v1,v2,v3;
		double vt, gantotal;
	
		System.out.println("indique cuál es el salario del trabajador");
		sb = Noel.nextInt();
		System.out.println("indique cuál fué el monto de la venta 1");
		v1 = Noel.nextInt();
		System.out.println("indique cuál fué el monto de la venta 2");
		v2 = Noel.nextInt();
		System.out.println("indique cuál fué el monto de la venta 3");
		v3 = Noel.nextInt();
		
		Noel.close();
		
		vt= (v1+v2+v3)*0.01;
		gantotal = sb + vt;
		
		System.out.println("la ganancia por concepto de venta es de: " +vt);
		System.out.println("a ganancia total del mes es de: " +gantotal);		
	}
}
