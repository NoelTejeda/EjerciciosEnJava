package ejemplos.src;

import java.util.*; //libreria (paquete) para poder usar la clase scanner

public class entradas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");

        String nombre_usuario = entrada.nextLine();

        System.out.println("Introduce tu edad: ");

        int edad = entrada.nextInt();

        System.out.println("hola! " + nombre_usuario + " el año que viene tendrás " + (edad + 1) + " años");

        entrada.close();
    }
}

/*
 * en la api de java : https://docs.oracle.com/javase/8/docs/api/ se puede ver
 * que el constructor recibe el mismo nombre de la clase; y este es new
 * "Scanner"
 * 
 * necesitamos la clase Scanner para la recepcion o entrada de datos, para poder
 * usarlo es necesario importar el paquete java.util.*; al colocar el *
 * indicamos que queremos todas las clases, en caso de querer usarlo y no tener
 * que estar especificando. como por ejemplo: java.util.Scanner;
 * 
 * 
 * 
 */
