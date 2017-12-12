/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author flotante
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        System.out.print("\n Opcion 1:"
                + "\n Opcion 2:"
                + "\n Opcion 3:"
                + "\n Opcion 4:"
                + "\n Opcion 5:"
                + "\n Opcion 6:\n");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                ejercicio1(sc);
                break;
            case 2:
                ejercicio2(sc);
                break;
            case 3:
                ejercicio3(sc);
                break;
            case 4:
                ejercicio4(sc);
                break;
            case 5:
                ejercicio5(sc);
                break;
            case 6:
                ejercicio6(sc);
                break;
            default:
        }
    }

    public static void ejercicio1(Scanner sc) {
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        int posicion[] = {1, 1, 1, 1, 1, 2, 2, 1, 1, 1};
        // s para establecer el tamaño del tercer array
        int s = 0;
        for (int i = 0; i < 10; i++) {
            s = s + posicion[i] + posicion[i++];
        }
        int fin[] = new int[s];

        for (int i = 0; i < numeros.length; i++) {
            int n = posicion[i];
            int cont = fin[i];
            for (int x = 0; x <= n; x++) {
                fin[i] = numeros[i];
                cont++;
            }
        }
        for (int i = 0; i < fin.length; i++) {
            System.out.println("Los numeros son " + fin[i]);
        }
    }

    public static void ejercicio2(Scanner sc) {
        
        int[] nums = new int[15];
        //pedir nums
        System.out.println("Introduzca dies numeros");
        for (int i = 0; i < 10; i++) {
            nums[i] = sc.nextInt();
        }
        int cont = 0;
        for (int i = 0; i < 13; i += 3) {
            //mover el array
            for (int x = 0; x < 2; x++) {
                nums[13 - x - i] = nums[9 - cont];
                cont++;
            }
            //para sumar
            nums[14 - i] = nums[13 - i] + nums[12 - i];
        }
        System.out.println("Los numeros cson");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void ejercicio3(Scanner sc) {
        int cartas[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numeros[] = new int[10];
        int num = 1;
        barajarArray(cartas);
        for (int x = 0; x < numeros.length; x++) {
            //si se empieza por la ultima posicione del array colocar-1(cartas.legth-1)
            for (int i = 0; i < cartas.length; i++) {
                //si el numero es igual a un numero dentro del array
                if (num == cartas[i]) {
                    numeros[x] = i;
                    //para que se detenga al encontrar la carta
                    i = cartas.length;
                }
                //para continuar buscando el siguiente numero
            }
            num++;

        }
        for (int i = 1; i < numeros.length; i++) {
            System.out.println("El numero " + i + " se encuentra en la posicion" + numeros[i]);
        }
    }

    public static void ejercicio4(Scanner sc) {
        int[] pri = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] seg = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ter = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] union = new int[30];
        int in1 = 0, in2 = 0, in3 = 0, in4 = 0;
        for (int i = 0; in1 < 10 && in2 < 10 && in3 < 10; i++) {
            if (pri[in1] < seg[in2] && pri[in1] < seg[in2]) {
                union[in4] = pri[in1];
                in1++;
                in4++;
            } else if (seg[in2] < pri[in1] && seg[in2] < ter[in3]) {
                union[in4] = seg[in2];
                in2++;
                in4++;
            } else {
                union[in4] = ter[in3];
            }
            in3++;
            in4++;
        }
        System.out.println("La nueva tabla es: ");
        for (int x = 0; x < union.length; x++) {
            System.out.println(union[x]);
        }
    }

    public static void ejercicio5(Scanner sc) {
        int cartas[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numeros[] = new int[10];
        int num = 1;
        barajarArray(cartas);
        for (int x = 0; x < numeros.length; x++) {
            //si se empieza por la ultima posicione del array colocar-1(cartas.legth-1)
            for (int i = cartas.length - 1; i >= 0; i--) {
                //si el numero es igual a un numero dentro del array
                if (num == cartas[i]) {
                    numeros[x] = i;
                    i = 0;
                }
            }
            num++;

        }
        for (int i = 1; i < numeros.length; i++) {
            System.out.println("El numero " + i + " se encuentra en la posicion" + numeros[i]);
        }
    }

    public static void barajarArray(int[] array) {
        Random generadorNumerosAleatorios = new Random();
        int posicion;
        int posicion2;
        int swap;

        for (int i = 0; i < 20; i++) {
            posicion = generadorNumerosAleatorios.nextInt(array.length);
            posicion2 = generadorNumerosAleatorios.nextInt(array.length);
            swap = array[posicion];
            array[posicion] = array[posicion2];
            array[posicion2] = swap;
        }

    }

    public static void ejercicio6(Scanner sc) {
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        int operaciones[] = {1, 1, 1, 3, 1, 4, 1, 1, 2};
        int resultado[] = new int[10];
        for (int i = 0; i < resultado.length; i++) {
            if (operaciones[i] == 1) {
                numeros[i] += numeros[i + 1];
                i++;
            } else if (operaciones[i] == 2) {
                numeros[i] -= numeros[i + 1];
                i++;
            } else if (operaciones[i] == 3) {
                numeros[i] *= numeros[i + 1];
                i++;

            } else if (operaciones[i] == 4) {
                numeros[i] /= numeros[i + 1];
                i++;
            }
        }
        System.out.println("El resultado es: " + resultado[9]);
    }
}
