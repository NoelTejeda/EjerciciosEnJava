package Ejercicios;
/*Diseñe un algoritmo para convertir una cantidad en bolívares (can_bs) 
en dólares, asumiendo que la unidad cambiaría es un dato proporcionado 
(tasa).*/

import java.util.Scanner;

public class ejercicios6 {



	public static void main(String[] args) {
		int can_bs, tasa, entre;
		
		Scanner Noel = new Scanner (System.in);
		System.out.println(" ¿Que cantidad de bolivares desaa convertir? ");
		can_bs = Noel.nextInt();
		System.out.println("Indique la tasa del $ ");
		tasa = Noel.nextInt();
		
		Noel.close();
		
		entre=can_bs/tasa;
		
		System.out.println("Dolares a recibir: "+entre+"$");

	}

}
