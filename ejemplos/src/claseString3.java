package ejemplos.src;

// equals(cadena) : deveulve true si dos cadenas que se comparan son iguales y false si no lo son. Distingue mayúsculas y minúsculas.class

// equalsignoreCase(cadena) : igual que el anterior pero sin tener en cuenta mayúsculas y minúsculas

public class claseString3 {
    public static void main(String[] args) {
        String alumno1, alumno2;
        alumno1 = "Noel";
        alumno2 = "noel";
        System.out.println(alumno1.equalsIgnoreCase(alumno2));
    }
}
