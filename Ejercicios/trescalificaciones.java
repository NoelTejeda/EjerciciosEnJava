package Ejercicios;
// hacer un programa que calcule e imprima la suma de tres calificaciones

import java.util.Scanner;

public class trescalificaciones {

	public static void main(String[] args) {
		Scanner Noel = new Scanner(System.in);
		
		float n1,n2,n3,total;
	
		System.out.println("indique las tres calificaciones");
		 n1= Noel.nextFloat();
		 n2= Noel.nextFloat();
		 n3= Noel.nextFloat();
		 Noel.close();
		 total=n1+n2+n3;
		 
		 System.out.println("la suma de las tres notas es: "+total);

	}

}
