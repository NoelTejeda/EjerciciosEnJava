// Calcular el número de pulsaciones que una persona debe tener por cada 10 segundos de ejercicio, conociendo la edad y la formula es: num_pulsaciones = (220 - edad)/10

package Ejercicios;

import javax.swing.JOptionPane;

public class ejercicio7_7 {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Indique su edad: "));

        JOptionPane.showMessageDialog(null,
                "su numero de pulsaciones es de: " + (220 - edad) / 10 + " Pulsaciones por minuto");
    }
}
