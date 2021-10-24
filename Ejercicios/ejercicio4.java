package Ejercicios;
import java.util.Scanner;

/*Diseñe un algoritmo que permita a los estudiantes saber cuál será su calificación final en la materia de Programación Digital, 
 si la calificación se compone de los siguientes porcentajes:
 i.- 55% del promedio de sus tres calificaciones parciales (c1, c2, c3).
ii.- 30% de la calificación del examen final (ef). 
iii.- 15% de la calificación de un trabajo final (tf).*/

public class ejercicio4 {

	public static void main(String[] args) {
		Scanner Noel = new Scanner(System.in);
		int c1,c2,c3,ef,tf;
		double propar, proexamf, promtf, calif;
		
		System.out.println("Indique las tres calificaciones de los parciales");
		c1 = Noel.nextInt();
		c2 = Noel.nextInt();
		c3 = Noel.nextInt();
		
		propar = (c1+c2+c3)/3 * 0.55;
		
		System.out.println("Indique la calificion del examen final");
		ef = Noel.nextInt();
		
		proexamf = ef * 0.30;
		
		System.out.println("Indique la nota del trabajo final");
		tf = Noel.nextInt();
		
		promtf = tf * 0.15;
		
		
		calif = propar + proexamf + promtf ;
		
		System.out.println("la nota final del estudiante es de: "+calif);
		Noel.close();
		
	}

}
