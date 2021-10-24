package prueba.src;

import javax.swing.*;

public class entradas2 {
    public static void main(String[] args) {
        
        String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre ");

        String edad=JOptionPane.showInputDialog("Introduce tu edad "); //normalmente declaramos edad como int, pero este metodo showInputDialog devuelve un string; así que lo declaramos como string, pero al querer sumarlo con otro numero lo que hará es concatenarlo y no sumarlo, entonces la solución a esto es transformar el string a valor numerico con parseInt....se busca la clase integer en la api, y en los metodos buscamos el metodo parseInt.

        int edad_usuario=Integer.parseInt(edad); //de esta manera pasamos el string a int

        edad_usuario++; //incrementará en 1 y así no se tendría que colocar en la salida: edad_usuario+1

        System.out.println("Hola "+nombre_usuario+" el año que viene tendrás: "+edad_usuario+" años");

    }
}

/* para construir una ventana y mostrar un mensaje a traves de ella usamos el metodo showInputDialog del paquete javax.swing



 */
