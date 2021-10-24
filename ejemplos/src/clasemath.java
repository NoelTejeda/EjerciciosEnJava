package ejemplos.src;

// math.sqrt(n): raiz cuadrada de un número

// math.pow(base,exponente):potencia de un numero. base y exponentes son doubles

// math.sin(angulo). Math.cos(angulo) Math.tan(angulo) Math.atan(angulo)

// math.round(decimal): redondeo de un numero.

//Math.pi:constante de clase con el numero pi

//------------------------------------------------------

// package prueba.src;

// public class clasemath {

//     public static void main(String[] args) {
//             double raiz=Math.sqrt(9);
//             System.out.println(raiz);
//     }
// }
//-----------------------------------------------------

// public class clasema

//     public static void main(String[] args) {
//         float num1=5.85f;
//     int resultado=Math.round(num1);
// System.out.println(resultado);
// }
// }

// --------------------------------------------

public class clasemath {
    public static void main(String[] args) {
        double base = 5;
        double exponente = 3;
         int resultado = (int) Math.pow(base, exponente);
        System.out.println("el resultado de: " + base + " elevado con el exponente " + "exponente "
                + " el resultado es: " + resultado);
    }

}
// la salida debe ser tipo double, pero con la refundición se forza la salida a
// entero