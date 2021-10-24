package ejemplos.src;

// metodos más usados en la clase String:

// length() : devuelve la longitud de una cadena de caracteres

// charAt() : devuelve la posición de un caracter dentro de una cadena, las posiciones empiezan a contar de cero 

//------------------------------------------------

// declaración de String debe ser con comillas dobles
public class claseString {
    public static void main(String[] args) {
        String nombre = "Noel";

        System.out.println("mi nombre es " + nombre);
        System.out.println("mi nombre tiene " + nombre.length() + " letras"); // cantidad de letras
        System.out.println("la primera letra de mi nombre es " + nombre.charAt(0)); // devuelve la letra que solicitemos
                                                                                    // empieza por cero.
        // -------------si quiero que me diga cual es la última letra:
        // int ultima_letra;
        int ultima_letra = nombre.length();
        System.out.println("y la última letra es " + nombre.charAt(ultima_letra - 1));

    }

}