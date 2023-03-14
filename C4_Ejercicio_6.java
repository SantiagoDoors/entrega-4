import javax.swing.JOptionPane;

/*
 * Ejercicio Nº 3 
 * Pidiendo al usuario que ingrese un valor, si el mismo es par, 
 * mostrar el literal “Es número par”, si no lo es, mostrar el literal “Es número impar”. 
*/

public class C4_Ejercicio_6{
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Deme un numero y le dire si es par o impar ¬(^_^)¬");
        int num = Integer.parseInt(a);
        if (num % 2 == 0){
            JOptionPane.showInputDialog(num+" Es un numero Par ¬(^_^)¬");
        } else {
            JOptionPane.showInputDialog(num+" Es un numero Impar ¬(^_^)¬");
        }
    }
}