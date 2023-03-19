/*
*       Ejercicio Nº 5
*           Una empresa quiere pagar a sus empleados por la asistencia de lunes a viernes 
*           y un adicional por las horas trabajadas los domingos en tareas especiales. 
*       a. El empleado asistió todo el mes, además entre 3 y 5 horas los domingos, adiciona el 3 % del sueldo. 
*       b. Si asistió todo el mes y entre 6 y 10 horas los domingos, adiciona el 10 %. 
*       c. No asistió todo el mes y entre 3 y 10 horas los domingos, adiciona el 2 %. 
*/

import javax.swing.JOptionPane;

public class C4_Ejercicio_8 {
    public static void main(String[] args) {

        //iniciando las variables

        int sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo del trabajador ¬(^_^)¬"));
        int horasDomingo = Integer.parseInt(JOptionPane.showInputDialog("Escriba las horas extras hechas en domingo ¬(^_^)¬"));
        String asistencia = JOptionPane.showInputDialog("Asistió todo el mes? escriba .:si o no:. ¬(^_^)¬").toLowerCase().trim();
        

        if (asistencia.equals("si")){

            //logica para el calculo de los extras sabiendo que las horas domingo
            //modifican la adicion al sueldo.

            if(horasDomingo < 5){
                sueldo *= 1.03;
                System.out.println("el sueldo que le corresponde es: "+sueldo);
            } else {sueldo *= 1.10;
            System.out.println("el sueldo que le corresponde es: "+sueldo);
        }
    }  else { 
            sueldo *= 1.02;
            System.out.println("el sueldo que le corresponde es: "+sueldo);
        }
        
    }
}