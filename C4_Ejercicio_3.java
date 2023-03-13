import javax.swing.JOptionPane;

public class C4_Ejercicio_3 {
    public static void main(String[] args) {
                //Pedir Variable inicio, y de Finalizacion.
                String a = JOptionPane.showInputDialog("ingrese un numero de inicio");
                String b = JOptionPane.showInputDialog("ingrese un numero de fin");
                int ini = Integer.parseInt(a);
                int fin = Integer.parseInt(b);

                System.out.println("Numeros desde ini a fin");
                while (ini < fin){
                    ini += 1;
                    System.out.println(ini);
        }
    }
} 