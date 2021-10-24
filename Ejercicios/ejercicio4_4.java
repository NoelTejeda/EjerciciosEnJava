package Ejercicios;

import javax.swing.JOptionPane;
/*Diseñe un algoritmo que permita a los estudiantes saber cuál será su calificación final en la materia de Programación Digital, 
si la calificación se compone de los siguientes porcentajes:
 i.- 55% del promedio de sus tres calificaciones parciales (c1, c2, c3).
 ii.- 30% de la calificación del examen final (ef). 
 iii.- 15% de la calificación de un trabajo final (tf).*/

public class ejercicio4_4 {

	public static void main(String[] args) {

		int c1, c2, c3, ef, tf;
		double propar, proexamf, promtf, calif;

		c1 = Integer.parseInt(JOptionPane.showInputDialog("Indique la calificacion del parcial 1"));
		c2 = Integer.parseInt(JOptionPane.showInputDialog("Indique la calificacion del parcial 2"));
		c3 = Integer.parseInt(JOptionPane.showInputDialog("Indique la calificacion del parcial 3"));

		propar = (c1 + c2 + c3) / 3 * 0.55;

		ef = Integer.parseInt(JOptionPane.showInputDialog("Indique la calificion del examen final"));

		proexamf = ef * 0.30;

		tf = Integer.parseInt(JOptionPane.showInputDialog("Indique la nota del trabajo final"));

		promtf = tf * 0.15;

		calif = propar + proexamf + promtf;

		JOptionPane.showMessageDialog(null, "la nota final del estudiante es de: " + calif);

	}

}
