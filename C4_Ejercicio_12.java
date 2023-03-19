public class C4_Ejercicio_12 {
    public static void main(String[] args) throws InterruptedException {

        //declarando varibales inicializadas en 09:59:50 para mostrar al llegar a las 10:00:00 el cambio de 
        // ".:[" y se muestre correctamente. (estetica)

        int horas = 9, minutos = 59, segundos = 50;

        while(true){
            if(horas<10){
                System.out.print(".:[0"+horas+":");
            }else {
                System.out.print(".:["+horas+":");
            }
            if(minutos<10){
                System.out.print("0");
            }
            System.out.print(minutos+":");
            if(segundos<10){
                System.out.print("0");
            }
            System.out.println(segundos+"]:. ¬(^_^)¬");
            segundos++;

            //incrementos de segundo, de minutos, y de horas, tambien reinicio al llegar a 24h.

            if (segundos == 60){
                segundos = 0;
                minutos++;
                if(minutos== 60){
                    minutos = 0;
                    horas++;
                    if(horas==24){
                        horas = 0;
                    }
                }
            }

            //retardo de mil milisegundos para que pase un segundo entre cada muestra en consola.

            Thread.sleep(1000);
        }

    }
}
