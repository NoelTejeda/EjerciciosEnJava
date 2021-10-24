package ejemplos.src;

import javax.swing.JOptionPane;

public class Joptionpane {
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digite una cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero"));
        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));

        // ahora mostraremos el mensaje de salida con showMessageDialog

        JOptionPane.showMessageDialog(null, "la cadena es: " + cadena);
        JOptionPane.showMessageDialog(null, "El entero es: " + entero);
        JOptionPane.showMessageDialog(null, "la letra es: " + letra);
        JOptionPane.showMessageDialog(null, "El decimal es: " + decimal);

    }

}

// todo lo que reciba Joptionpane.showInputDialog será tomado como un string.

// averiguar showOptionDialog
