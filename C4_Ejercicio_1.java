import java.util.Arrays;
import java.util.Collections;

public class C4_Ejercicio_1 {
    public static void main(String[] args) {

    // ingresar los numeros a ordenar

        int num1 = 23, num2 = 98, num3 = 2; 

    // ingresar la forma de orden

        String asc = "d";

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
