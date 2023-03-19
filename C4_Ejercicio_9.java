/*
 * 1) Pedir que se ingrese por teclado un número y mostrar la tabla de multiplicar completa del 0 al 10.
 * Imprimir el multiplicando, el multiplicador y el producto.
 */

import javax.swing.JOptionPane;

public class C4_Ejercicio_9 {
    public static void main(String[] args) {

        //pedir numero para hacer la tabla.

        int num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));

        //bucle para realizar la tabla de multiplicar.
        
        for(int i=0; i<=10; i++){
            int b = i*num;
            System.out.println(".: "+num+" por "+i+" es "+b+" :.  ¬(^_^)¬");
        }

    }
}
