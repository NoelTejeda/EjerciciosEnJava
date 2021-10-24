package Ejercicios;
/*Diseñe un algoritmo para una persona que desea invertir su capital (cap_inv) en un banco y desea saber cuánto 
dinero ganara después de un mes si el banco le paga un interés del 2% mensual.*/
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	Scanner Noel = new Scanner (System.in);
	int capinv;
	double Ganancia;
	
	System.out.println("indique la cantidad de dinero a invertir");
	capinv = Noel.nextInt();
	
	Ganancia= capinv * 0.02;
	Noel.close();
	
	System.out.println("la ganancia mensual es de: "+Ganancia);
	
	}
}