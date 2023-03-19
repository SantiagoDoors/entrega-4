/*
 * 2) Pida al usuario que ingrese 10 números y luego muestre solamente los múltiplos de 2.
 */

import javax.swing.JOptionPane;

public class C4_Ejercicio_10 {
    public static void main(String[] args) {

            //crear array de numeros.

        int numeros[];
        numeros = new int[10];

            //bucle para pedir numeros.

        for (int i=0;i <10; i++){

            //pedir los 10 numeros.

            numeros[i]= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero "+i+"/10"));
            if (numeros[i]%2 == 0){

                //mostrar solo los pares.

                System.out.println("el numero "+numeros[i]+" es par");
            } else {
                System.out.println("el numero "+numeros[i]+" es impar");
            }
        }
        System.out.println("el programa finalizó con éxito  ¬(^_^)¬");
    }
}