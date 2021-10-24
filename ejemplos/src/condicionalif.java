package prueba.src;

import java.util.Scanner;

public class condicionalif {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("introduce tu edad ");
        int edad=entrada.nextInt();
        
        if(edad>=18){
            System.out.println("Usted es mayor de edad");
        }
        else if (edad>40) {
            System.out.println("Eres un adulto");
        }
        else if (edad > 80) {
            System.out.println("Eres mayor de edad");
        }
        entrada.close();
    }
}
