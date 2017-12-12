/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensorpresaestavezsifuesorpresa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daw
 */
public class ExamenSorpresaEstaVezSiFueSorpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elije el numero de ejercicio (1-3). Los Enunciados son:\n"
          + "1: Dos barajas de 40, te indico donde esta el ultimo numero cuya posicion sea mas baja.\n"
          + "2: mover los impares de una array a derecha o izquierda el numero de veces que quieras.\n");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1(sc);
                break;
            case 2:
                ejercicio2(sc);
                break;
            default:
                System.out.println("opcion no valida");
        }

    }

    public static void ejercicio1(Scanner sc) {
        Random generadorNumerosAleatorios = new Random();
        int[] baraja1 = new int[40];
        int[] baraja2 = new int[40];
        int[] posiciones1 = new int[10];
        int[] posiciones2 = new int[10];
        int[] arrayfinal = new int[10];
        int posicion1, posicion2, swap;
        //creo primera baraja
        int contador = 0;
        for (int k = 0; k < 4; k++) {
            for (int j = 1; j < 11; j++) {
                baraja1[contador] = j;
                contador++;
            }
        }
        //creo segunda baraja
        contador = 0;
        for (int k = 0; k < 4; k++) {
            for (int j = 1; j < 11; j++) {
                baraja2[contador] = j;
                contador++;
            }
        }

        //barajeo 1
        for (int i = 0; i < 999999; i++) {
            posicion1 = generadorNumerosAleatorios.nextInt(baraja1.length);
            posicion2 = generadorNumerosAleatorios.nextInt(baraja1.length);
            swap = baraja1[posicion1];
            baraja1[posicion1] = baraja1[posicion2];
            baraja1[posicion2] = swap;
        }

        //barajeo 2
        for (int i = 0; i < 999999; i++) {
            posicion1 = generadorNumerosAleatorios.nextInt(baraja2.length);
            posicion2 = generadorNumerosAleatorios.nextInt(baraja2.length);
            swap = baraja2[posicion1];
            baraja2[posicion1] = baraja2[posicion2];
            baraja2[posicion2] = swap;
        }
        //cojo ultimas posiciones 1º
        for (int i = 0; i < baraja1.length; i++) {
            posiciones1[baraja1[i] - 1] = i;

        }
        //cojo ultimas posiciones 2º
        for (int i = 0; i < baraja2.length; i++) {
            posiciones2[baraja2[i] - 1] = i;
        }
        //comparamos arrays
        for (int i = 0; i < 10; i++) {
            if (posiciones1[i] < posiciones2[i]) {
                arrayfinal[i] = posiciones1[i];
            } else {
                arrayfinal[i] = posiciones2[i];
            }
        }
        //imprimo
        for (int i = 0; i < arrayfinal.length; i++) {
            System.out.println("el numero " + (i + 1) + " queda en la posicion " + arrayfinal[i]);
        }
    }

    public static void ejercicio2OtraSolucion(Scanner sc) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int contadorimpares = 0;
        //pido los numeros al usuario porque me sobra el tiempo

        //pido numero de movimientos y direccion
        System.out.println("Introduce el numero de veces que quieras que se mueva");
        int movimientos = sc.nextInt();
        int posicionUltimoImpar = -1;
        int posicionPrimerImpar = -1;
        for (int i = array.length; i >= 0; i--) {
            if ((array[i] % 2) != 0) {
                posicionUltimoImpar = i;
                i = -1;
            }
        }
       
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                posicionPrimerImpar = i;
                i = array.length;
            }
        }
        int entra = array[posicionUltimoImpar];
        int sale;
        for (int i = posicionUltimoImpar; 
          i > posicionPrimerImpar; i--) {
            if (array[i] % 2 != 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (array[j] % 2 != 0) {

                        array[i] = array[j];
                        i = j + 1;
                    }
                }

            }

        }
        array[posicionPrimerImpar] = entra;

    }

    public static void ejercicio2(Scanner sc) {
        int[] array = new int[10];
        int contadorimpares = 0;
        //pido los numeros al usuario porque me sobra el tiempo

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            array[i] = sc.nextInt();
        }
        //pido numero de movimientos y direccion
        System.out.println("Introduce el numero de veces que quieras que se mueva");
        int movimientos = sc.nextInt();
        System.out.println("Introduce la direccion hacia donde quieres que se mueva (1 sera abajo, 2 sera arriba, con otro numero la lias");
        int direccion = sc.nextInt();
        boolean correcto = true;

        //cuento el numero de impares
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                contadorimpares++;
            }
        }
        //creo array segun el numero de impares
        int[] arrayimpares = new int[contadorimpares];
        contadorimpares = 0;

        //meto en esta array los indices de los impares
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) != 0) {
                arrayimpares[contadorimpares] = i;
                contadorimpares++;
            }
        }
        //if para segun direccion
        if (direccion == 1) {
            //repito la cantidad de veces introducido, como este es el que va para la derecha (o abajo en mi impresion), tengo que guardar de primeras el ultimo numero antes de hacer el movimiento
            for (int i = 0; i < movimientos; i++) {
                moverArray(array,arrayimpares,contadorimpares);
                
            }
        } //repito la cantidad de veces introducido, como este es el que va para la izquierda (o arriba en mi impresion), tengo que guardar de primeras el primer numero antes de hacer el movimiento
        else if (direccion == 2) {
            for (int i = 0; i < movimientos; i++) {
                int entra = array[arrayimpares[0]];
                int sale;
                for (int j = arrayimpares.length - 1; j >= 0; j--) {
                    sale = array[arrayimpares[j]];
                    array[arrayimpares[j]] = entra;
                    entra = sale;
                }
            }
        } //por si ponen otro numero a la hora de elegir direccion, imprimir que tiene un fallo
        else {
            correcto = false;
        }
        if (correcto) {
            System.out.println("tu array queda asi:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } else {
            System.out.println("Has puesto otro numero en las veces de movimiento");
        }


    }
    
    
    public static void moverArray(int []array,int []arrayimpares,int contadorimpares)
    {
        int entra = array[arrayimpares[contadorimpares - 1]];
                int sale;
                for (int j = 0; j < arrayimpares.length; j++) {
                    sale = array[arrayimpares[j]];
                    array[arrayimpares[j]] = entra;
                    entra = sale;
                }
    }
}

