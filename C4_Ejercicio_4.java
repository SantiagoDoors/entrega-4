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

        JOptionPane.showInputDialog("_[Par o Impar]_");
        String a = JOptionPane.showInputDialog("ingrese un numero y le dire!! muajaaaaaa ja!");
        
    // transformando variables a entero

        int ini = Integer.parseInt(a);

    //logica para saber cual es par o impar.    

        if (ini %2 == 0) {
            JOptionPane.showInputDialog("su numero es _[Par]_ ");
        }
        JOptionPane.showInputDialog("su numero es _[Impar]_ ");
    }
}