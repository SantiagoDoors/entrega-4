/*                  .: Conversiones de tipo :.
*        Resuelva los siguientes ejercicios
*        1. Teniendo los datos en las siguientes variables:
*        Variable car, tipo char, con el dato ‘r’.
*        Variable antiguo, tipo int, con el dato 128.
*        Variable piso, tipo String, con el dato 7.
*        a. Creando nuevas variables tipo entero, convierta car y piso a tipo int.
*        b. Luego sume las tres variables y muestre el resultado.
*        c. Luego convierta car y antiguo a tipo String, y car a mayúscula (toUpperCase()).
*        d. Utilice lo hecho en el punto c para mostrar la frase: Hay 7 áRboles de 128 años. 
*/

public class C4_Ejercicio_15 {
    public static void main(String[] args) {
        char car = 'r';
        int antiguo = 128;
        String piso = "7";
        int modifi1 = Integer.parseInt(piso);
        int modifi2 = (int) car;
        int b = modifi1+modifi2+antiguo;
        System.out.println("suma de las 3 varibales: "+b);
        String modifi3 = String.valueOf(car).toUpperCase();
        String modifi4 = String.valueOf(antiguo);
        System.out.println("Hay "+modifi1+" á"+modifi3+"boles de "+modifi4+" años");
    }

}
