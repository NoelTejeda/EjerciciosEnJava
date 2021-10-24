package ejemplos.src;

import javax.swing.JOptionPane;

public class formatonumero {
    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Introduce un numero para sacarle la raiz cuadrada ");

        double num2 = Double.parseDouble(num1);

        System.out.print("La raiz de " + num2 + " es ");
        System.out.printf("%1.2f", Math.sqrt(num2)); // sqrt es un metodo para buscar la raiz cuadrada de un número

    }
}

/*
 * double x=10000.0; System.out.printf("%1.4f", x/3);
 * 
 * si al querer dividir un numero y nos arroja muchos decimales podemos darle un
 * formato a su salida. sustituimos el println (ln=salto de linea), por printf
 * (f=formato) y colocamos entre comillas "%1.4f" siendo el .4 la cantidad de
 * decimales que queramos ver
 * 
 */
