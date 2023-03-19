import javax.swing.JOptionPane;

public class C4_Ejercicio_11 {
    public static void main(String[] args) {
        
            //crear array de numeros.

        int numeros[];
        numeros = new int[20];

            //bucle para pedir numeros.

        for (int i=0;i <20; i++){

            //pedir los 20 numeros.

            numeros[i]= Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero "+i+"/20"));
            if (numeros[i]>0){

                //mostrar solo los positivos.

                System.out.println("el numero .: "+numeros[i]+" :. es positivo");
            } else if (numeros[i]<0){
                System.out.println("el numero .: "+numeros[i]+" :. es negativo");
            } else {
                System.out.println("el numero .: "+numeros[i]+" :. es neutro");
            }
        }
        System.out.println(".:el programa finalizó con éxito:. ¬(^_^)¬");
    }
}

