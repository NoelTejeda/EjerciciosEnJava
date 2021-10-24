package prueba.src;

// substring(x,y) : devuelve una subcadena dentro de la cadena, siendo X el carácter a partir del cuál se extrae e Y y el numero de caracteres qeu se quieran extraer 


public class claseString2 {
    public static void main(String[] args) {
        String frase="Hoy es un buen día para aprender ";
        String frase_resume=frase.substring(10, 33) + " concateno unas palabras de más"; //las palabras de inicio como de fin empiezan a contar desde cero
        System.out.println(frase_resume);

    }
}
