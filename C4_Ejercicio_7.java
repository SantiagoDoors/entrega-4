import javax.swing.JOptionPane;

/* 
 * Ejercicio Nº 4  
 * Dado que se conocen ciertos símbolos cuyo nombre es particular, 
 * construir un programa que permita el ingreso
 * de un nombre y responda con un texto que indique lo que representa, 
 * por ejemplo: PI  es el nombre del número 3,14159
 * Alfa  es la primera letra griega, Omega  es la última letra del alfabeto griego. 
 * Si se indica una que el programa no conoce, e indica con un texto adecuado. 
*/

public class C4_Ejercicio_7 {
    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("ingrese una palabra al diccionario").toLowerCase();
        switch (palabra) {
            case "pi": System.out.println("3,14159");
            case "alfa": System.out.println("primerla letra griega");
            case "omega": System.out.println("ultima letra del alfabeto grigo");
            case "perro": System.out.println("es un animal que tiene cuatro patas, cola y ladra.");
            default : System.out.println("no se encuentra en mi diccionario. .:muy pronto tendremos su definicion:. ¬(^_^)¬");
    }
}
}
