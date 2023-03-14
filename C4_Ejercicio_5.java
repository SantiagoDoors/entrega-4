/*
 *
 * Ejercicio Nº 2  
 * Tomando dos valores devolver el número mayor. 
 *
 */

import javax.swing.JOptionPane;

public class C4_Ejercicio_5 {
    public static void main(String[] args) {

    // pedimos datos

        JOptionPane.showInputDialog("De dos numeros le dire cual es el mayor. ¬(^_^)¬ [enter para seguir] ");
        String a = JOptionPane.showInputDialog(" ingrese el primer numero");
        String b = JOptionPane.showInputDialog("ingrese el segundo numero");
    
    // lo transformo en entero

        int uno = Integer.parseInt(a);
        int dos = Integer.parseInt(b);

    // logica para devoler resultado.

        if (uno > dos){
            JOptionPane.showInputDialog("["+ uno + "] es mayor que [" + dos +"] ¬(^_^)¬");
        } else if (dos > uno){
            JOptionPane.showInputDialog("["+ dos + "] es mayor que [" + uno +"] ¬(^_^)¬");
        } else {
            JOptionPane.showInputDialog("para que me pones dos numeros iguales? ·(º_º)· ");
        }

    }
}
