
package daw2017;
import java.util.Random;
import java.util.Scanner;

public class Práctica1AdivinaNum {

    public static void main(String[] args) {

        //variables
        int inf, sup, contador, num;

        Random genAleatorio = new Random();
        Scanner s = new Scanner(System.in);
        
        //coleccion de datos
        System.out.println("Debes indicar el rango de numeros para adivinar y el numero de intentos.");
        System.out.println("Introduce el numero inferior");
        inf = s.nextInt();
        System.out.println("Introduce el numero superior.");
        sup = s.nextInt();
        System.out.println("Intentos que puede realizar");
        contador = s.nextInt();
        
        //genera aleatorio
        int aleatorio = genAleatorio.nextInt(sup) + inf;
        
        for (int i = 1; i < contador + 1; i++) {
            //numero a adivinar
            System.out.println("Escriba un numero entero.");
            num = s.nextInt();
            //verificar si es mayor, menor, igual
            if (num == aleatorio) {
                System.out.println("El numero introducido es correcto, felicidades! Lo has adivinado en el intento numero "+i);
                i=contador;
            } else if (num < aleatorio) {
                System.out.println("El numero a adivinar es mayor.");
                System.out.println("Intento numero " + i+" de "+contador);
                if(i==contador){
                    System.out.println("Lo siento el numero a adivinar era: "+aleatorio+" y no lo has adivinado en el numero de intentos permitidos vuelve a intentarlo en otro momento.");
                }
            } else if (num > aleatorio) {
                System.out.println("El numero a adivinar es menor.");
                System.out.println("Intento numero " + i+" de "+contador);
                 if(i==contador){
                    System.out.println("Lo siento el numero a adivinar era: "+aleatorio+" y no lo has adivinado en el numero de intentos permitidos vuelve a intentarlo en otro momento.");
                }
            }
           

        }
    }
}
