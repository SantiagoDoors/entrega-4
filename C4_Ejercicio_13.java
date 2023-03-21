/* 
 * 5) En un supermercado una clienta pone en su carrito los artículos que va tomando de los estantes. 
 *      La señora quiere asegurarse de que el cajero le cobre bien lo que ella ha comprado, 
 *      por lo que cada vez que toma un artículo anota su precio junto con la cantidad de 
 *      artículos iguales que ha tomado y determina cuánto dinero gastará en ese artículo; 
 *      a esto, le suma lo que ira gastando en los demás artículos, hasta que decide que 
 *      ya tomó todo lo que necesitaba. Ayúdele a esta señora a obtener el total de sus compras.
*/


import javax.swing.JOptionPane;

public class C4_Ejercicio_13 {
    public static void main(String[] args) {
        int articulos = 0, precio = 0,cuenta=0;
        String continuar, ComenzarCompra;
        ComenzarCompra = JOptionPane.showInputDialog("Desea comenzar a comprar? .: SI - NO :. escriba si o no segun corresponda").toLowerCase().trim();
        if(ComenzarCompra.equals("si")){
            do{
                articulos = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de articulos"));
                precio = Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio del articulo"));
                cuenta += articulos*precio;
                System.out.println("su cuenta es de: "+cuenta+"$ hasta el momento");
                continuar = JOptionPane.showInputDialog("desea seguir comprando? .: SI - NO :. escriba si o no segun corresponda").toLowerCase().trim();
            }
        while (continuar.equals("si"));
        
    }
    System.out.println("su cuenta es de: "+cuenta+" $ finales");
    }
}
