/*Una tienda ofrece un descuento del 15% sobre el total de la compra de sus clientes, diseñe un algoritmo para saber cuánto deberá pagar c/u si conoce el total de su compra.*/

package Ejercicios;
import java.util.Scanner;

public class Ejercicio3_3 {
    public static void main(String[] args) {
        
        Scanner ejer3 = new Scanner(System.in);

        System.out.println("Indique cual fue la cantidad total de sus compra: ");
        int compra = ejer3.nextInt();
        ejer3.close();

        double pagar=(compra*0.15);
        System.out.println("Usted deberá cancelar: "+(compra-pagar)+" bs");
  
    }
}
