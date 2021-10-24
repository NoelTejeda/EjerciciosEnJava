/*Diseñe un algoritmo para convertir una cantidad en bolívares (can_bs) 
en dólares, asumiendo que la unidad cambiaría es un dato proporcionado 
(tasa).*/

package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio6_6 {
    public static void main(String[] args) {
        double resultado;

        int can_bs = Integer.parseInt(JOptionPane.showInputDialog("indique la cantidad a convertir: "));

        double tasa = Double.parseDouble(JOptionPane.showInputDialog("indique la tasa del dia: "));

        resultado = ((double) Math.round(can_bs / tasa));
        /*
         * revisar para que solo me dé dos decimales.
         * https://es.stackoverflow.com/questions/29408/como-limitar-la-cantidad-de-
         * decimales-de-un-double
         */
        JOptionPane.showMessageDialog(null, "la cantidad de dinero de acuerdo a la tasa es de: " + resultado);

    }
}
