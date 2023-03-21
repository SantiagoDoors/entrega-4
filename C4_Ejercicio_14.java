/* 
 * 
 * 6) En la Cámara de n Diputados se levanta una encuesta con todos los integrantes con el fin de determinar 
 *    qué porcentaje de ellos está a favor del Tratado de Libre Comercio, qué porcentaje está en contra 
 *    y qué porcentaje se abstiene de opinar.
*/


import javax.swing.JOptionPane;

public class C4_Ejercicio_14 {
    public static void main(String[] args) {
        int diputados = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de diputados"));
        int favor = 0, contra = 0, abstencion = 0;
        for (int i = 0; i< diputados; i++){
            String voto = JOptionPane.showInputDialog("ingrese su voto escribiendo .: ACEPTO - RECHAZO - ABSTENGO :.");
            switch (voto.trim().toLowerCase()){
                case "acepto": favor +=1;
                break;
                case "rechazo": contra +=1;
                break;
                case "abstengo": abstencion +=1;
                break;
                case default: System.out.println("escribio mal su voto, comience de nuevo");
            }

        }
       int porcentaje1 = (favor * 100)/ diputados;
       int porcentaje2 = (contra * 100)/ diputados;
       int porcentaje3 = (abstencion * 100)/ diputados;
       System.out.println(".: A favor: "+porcentaje1+"% en contra: "+porcentaje2+"% abtenciones: "+porcentaje3+"% :.");
    }  
}
