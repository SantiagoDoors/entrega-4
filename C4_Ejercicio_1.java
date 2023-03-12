import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class C4_Ejercicio_1 {
    public static void main(String[] args) {

    // ingresar los numeros a ordenar

        String p = JOptionPane.showInputDialog("ingrese el primer número");
        String s = JOptionPane.showInputDialog("ingrese el segundo número");
        String t = JOptionPane.showInputDialog("ingrese el tercer número");

    //convertir string a int

        int num1 = Integer.parseInt(p);
        int num2 = Integer.parseInt(s);
        int num3 = Integer.parseInt(t);

    // ingresar la forma de orden

        String asc = JOptionPane.showInputDialog("ingrese el tipo de orden preferido siendo 'A' Ascendente, o 'D' Descendente").toLowerCase();


    //ordenar de forma Ascendente

        if (asc.equals("a")){
            int resultado[] = {num1, num2, num3};
            Arrays.sort(resultado);
            System.out.println("los numeros en orden Ascendente son: ");
            for (int n : resultado){
                System.out.println(n);
            }

    //ordenar de forma Descendente

        } else if (asc.equals("d")){
            Integer resultado[] = {num1, num2, num3};
            Arrays.sort(resultado, Collections.reverseOrder());
            System.out.println("los numeros en orden Descendente son: ");
            for (int n : resultado){
                System.out.println(n);
            }
        }
    }
}