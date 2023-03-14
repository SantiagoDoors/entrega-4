/*
 *
 * Ejercicio Nº 1 
 * Averiguar si un número es divisible por otro, utilizando el módulo o resto de la división (%).
 *
 */

import javax.swing.JOptionPane;
public class C4_Ejercicio_4{
    public static void main(String[] args) {
    // mensaje de bienvenida
        JOptionPane.showInputDialog("Averigüe si su numero es divisible por otro sin dejar resto ¬(^_^)¬ -> [Enter para Seguir]");
        String a = JOptionPane.showInputDialog("Ingrese un dividendo");
        String b = JOptionPane.showInputDialog("Ingrese un divisor");
    // transformando variables a entero

        int dividendo = Integer.parseInt(a);
        int divisor = Integer.parseInt(b);

    //logica para saber si el divisor da resto.    

        if (dividendo%divisor == 0 ){
            JOptionPane.showInputDialog("El Numero "+divisor+" es divisor de "+dividendo+" ¬(^_^)¬");
            } else {JOptionPane.showInputDialog("El Numero "+dividendo+" no es divisible por "+divisor+" ¬(^_^)¬");
        }
    }
}