// Calcular el número de pulsaciones que una persona debe tener por cada 10 segundos de ejercicio, conociendo la edad y la formula es: num_pulsaciones = (220 - edad)/10

package Ejercicios;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner noel = new Scanner(System.in);

        System.out.println("Indique su edad: ");
        int edad = noel.nextInt();

        noel.close();

        System.out.println("El número de pulsaciones es de: " + (220 - edad) / 10 + " pulsaciones por minuto");
    }

}
